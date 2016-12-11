package com.seleniumtests;

import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//Using Jackson java library to extract JSON
//data into POJOs. Uses Full Data Bind.
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.pojo.AppResults;
import com.pojo.AppStore;

public class AppStoreSearchAPITest {
	
	@Test(dataProvider="searchInput")
	public void searchAPITest(String term, String country, String media, String limit,
			String checkValue) 
			throws JsonParseException, JsonMappingException, IOException {
		
		ObjectMapper objMap = new ObjectMapper();
		
		objMap.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
		 
		Assert.assertFalse(term.isEmpty(), "search keyword \"term\" value is required");
		
		term = Pattern.compile(" ").matcher(term).replaceAll("+");
		
		//construct search parameters
		String searchParameters = "term=" + term;
		
		if(!country.isEmpty()) {
			
			country = Pattern.compile(" ").matcher(country).replaceAll("+");
			
			searchParameters = searchParameters + "&country=" + country;
		}
		
		if(!media.isEmpty()) {
			
			media = Pattern.compile(" ").matcher(media).replaceAll("+");
			
			searchParameters = searchParameters + "&media=" + media;
			
		}
		
		if(!limit.isEmpty()) {
			
			int searchLimit = Integer.parseInt(limit);
			
			searchParameters = searchParameters + "&limit=" + searchLimit;
		}		
		
		URL jsonURL = new URL("https://itunes.apple.com/search?" + searchParameters);
		
		System.out.println(jsonURL.toString());
		
		//Map JSON to AppStore POJO class. Full Data Bind.
		AppStore appStore = objMap.readValue(jsonURL, AppStore.class);		
				
		if(appStore.getResultCount() >= 1) {
			
			List<AppResults> appResults = appStore.getResults();

			Iterator<AppResults> wheel = appResults.iterator();

			while(wheel.hasNext()) {

				AppResults results = wheel.next();
				
				//Check results.
				if(media.equals("movie") || media.equals("tvShow") ||  media.equals("musicVideo")) {
					Assert.assertEquals(results.getArtistName().contains(checkValue),true);		
				}
				
				if(media.equals("ebook") || media.equals("software")) {
					Assert.assertEquals(results.getKind().contains(checkValue), true);		
				}
				
				if(country.equals("JP")) {
					Assert.assertEquals(results.getCountry().contains(checkValue), true);		
				}
				if(country.equals("CN")) {
					Assert.assertEquals(results.getCurrency().contains(checkValue), true);		
				}				
			}
		}
	}
	
	//Test Data.
	
	@DataProvider(name="searchInput")
	
	public Object[][] searchInput() {
		return new Object[][]{
			{"Gladiator","IN","movie","1","Ridley Scott"},
			{"Jessie","US","tvShow","2","JESSIE"},
			{"The BFG","US","musicVideo","3","BFG"},
			{"Forrest Gump","US","ebook","4","ebook"},
			{"Orange","IN","shortFilm","5","Orange"},
			{"Selenium","US","software","200","software"},
			{"Last Emperor","JP","","","JPN"},
			{"Police Story","CN","all","","CNY"}
		};
	}
}
