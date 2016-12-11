package com.pojo;

import java.util.ArrayList;

//POJO for Full Data Binding of Results Array in JSON

public class AppResults {
	
	private ArrayList<String> ipadScreenshotUrls;
	
	private ArrayList<String> appletvScreenshotUrls;
	
	private String artworkUrl512;
	
	public String getArtworkUrl512() {		
		return artworkUrl512;
	}
	
	public void setArtworkUrl512(String artworkUrl512){
		this.artworkUrl512 = artworkUrl512;
	}
	
	private ArrayList<String> features;
	
	public ArrayList<String> getFeatures(){
		return features;
	}
	
	public void setFeatures(ArrayList<String> features) {
		this.features = features;
	}
	
	private ArrayList<String> supportedDevices;
	
	public ArrayList<String> getSupportedDevices(){
		return supportedDevices;
	}
	
	public void setSupportedDevices(ArrayList<String> supportedDevices) {
		this.supportedDevices = supportedDevices;
	}
	
	private ArrayList<String> advisories;
	
	public ArrayList<String> getAdvisories(){
		return advisories;
	}
	
	public void setAdvisories(ArrayList<String> advisories) {
		this.advisories = advisories;
	}
	
	private boolean isGameCenterEnabled = false;
	
	public boolean getIsGameCenterEnabled() {
		return isGameCenterEnabled;
	}
	
	public void setIsGameCenterEnabled(boolean isGameCenterEnabled) {
		this.isGameCenterEnabled = isGameCenterEnabled;
	}
	
	private ArrayList<String> screenshotUrls;
	
	public ArrayList<String> getScreenshotUrls(){
		return screenshotUrls;
	}
	
	public void setScreenshotUrls(ArrayList<String> screenshotUrls) {
		this.screenshotUrls = screenshotUrls;
	}
	
	private float averageUserRatingForCurrentVersion;
	
	public float getAverageUserRatingForCurrentVersion() {
		return averageUserRatingForCurrentVersion;
	}
	
	public void setAverageUserRatingForCurrentVersion(float averageUserRatingForCurrentVersion){
		this.averageUserRatingForCurrentVersion = averageUserRatingForCurrentVersion;
	}
	
	private int userRatingCountForCurrentVersion;
	
	public int getUserRatingCountForCurrentVersion() {
		return userRatingCountForCurrentVersion;
	}
	
	public void setUserRatingCountForCurrentVersion(int userRatingCountForCurrentVersion){
		this.userRatingCountForCurrentVersion = userRatingCountForCurrentVersion;
	}
	
	private ArrayList<String> languageCodesISO2A;
	
	public ArrayList<String> getLanguageCodesISO2A(){
		return languageCodesISO2A;
	}
	
	public void setLanguageCodesISO2A(ArrayList<String> languageCodesISO2A) {
		this.languageCodesISO2A = languageCodesISO2A;
	}
	
	private String sellerUrl;
	
	public String getSellerUrl() {
		return sellerUrl;
	}
	
	public void setSellerUrl(String sellerUrl){
		this.sellerUrl = sellerUrl;
	}
	
	private String trackContentRating;
	
	public String getTrackContentRating() {
		return trackContentRating;
	}
	
	public void setTrackContentRating(String trackContentRating){
		this.trackContentRating = trackContentRating;
	}
	
	private ArrayList<String> genreIds;
	
	public ArrayList<String> getGenreIds(){
		return genreIds;
	}
	
	public void setGenreIds(ArrayList<String> genreIds) {
		this.genreIds = genreIds;
	}
	
	private String version;
	
	public String getVersion() {
		return version;
	}
	
	public void setVersion(String version){
		this.version = version;
	}
	
	private String description;
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description){
		this.description = description;
	}
	
	private ArrayList<String> genres;
	
	public ArrayList<String> getGenres(){
		return genres;
	}
	
	public void setGenres(ArrayList<String> genres) {
		this.genres = genres;
	}
	
	private float price;
	
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	private boolean isVppDeviceBasedLicensingEnabled = false;
	
	public boolean getIsVppDeviceBasedLicensingEnabled(){
		return isVppDeviceBasedLicensingEnabled;
	}
	
	public void setIsVppDeviceBasedLicensingEnabled(boolean isVppDeviceBasedLicensingEnabled) {
		this.isVppDeviceBasedLicensingEnabled = isVppDeviceBasedLicensingEnabled;
	}
	
	private String bundleId;
	
	public String getBundleId() {
		return bundleId;
	}
	
	public void setBundleId(String bundleId){
		this.bundleId = bundleId;
	}
	
	private String currentVersionReleaseDate;
	
	public String getCurrentVersionReleaseDate() {
		return currentVersionReleaseDate;
	}
	
	public void setCurrentVersionReleaseDate(String currentVersionReleaseDate){
		this.currentVersionReleaseDate = currentVersionReleaseDate;
	}
	
	private String releaseNotes;
	
	public String getReleaseNotes() {
		return releaseNotes;
	}
	
	public void setReleaseNotes(String releaseNotes){
		this.releaseNotes = releaseNotes;
	}
	
	private String sellerName;
	
	public String getSellerName() {
		return sellerName;
	}
	
	public void setSellerName(String sellerName){
		this.sellerName = sellerName;
	}
	
	private int primaryGenreId;
	
	public int getPrimaryGenreId() {
		return primaryGenreId;
	}
	
	public void setPrimaryGenreId(int primaryGenreId){
		this.primaryGenreId = primaryGenreId;
	}
	
	private String minimumOsVersion;
	
	public String getMinimumOsVersion() {
		return minimumOsVersion;
	}
	
	public void setMinimumOsVersion(String minimumOsVersion){
		this.minimumOsVersion = minimumOsVersion;
	}
	
	private String formattedPrice;
	
	public String getFormattedPrice() {
		return formattedPrice;
	}
	
	public void setFormattedPrice(String formattedPrice){
		this.formattedPrice = formattedPrice;
	}
	
	private float averageUserRating;
	
	public float getAverageUserRating() {
		return averageUserRating;
	}
	
	public void setAverageUserRating(float averageUserRating){
		this.averageUserRating = averageUserRating;
	}
	
	private int userRatingCount;
	
	public int getUserRatingCount() {
		return userRatingCount;
	}
	
	public void setUserRatingCount(int userRatingCount) {
		this.userRatingCount = userRatingCount;
	}
	
	private String wrapperType;
	
	private String kind;
	
	private int artistId;
	
	private ArrayList<Integer> artistIds;
	
	public ArrayList<Integer> getArtistIds() {
		return artistIds;
	}
	
	public void setArtistIds(ArrayList<Integer> artistIds) {
		this.artistIds = artistIds;
	}
	
	private int collectionId;
	
	private int trackId;
	
	private String artistName;
	
	private String collectionName;
	
	private String trackName;
	
	private String collectionCensoredName;
	
	private String trackCensoredName;
	
	private int collectionArtistId;
	
	private String collectionArtistName;
	
	private String collectionArtistViewUrl;
	
	private String artistViewUrl;
	
	private String collectionViewUrl;
	
	private String trackViewUrl;
	
	private String previewUrl;
	
	private String artworkUrl30;
	
	private String artworkUrl60;
	
	private String artworkUrl100;
	
	private int fileSizeBytes;
	
	private float collectionPrice;
	
	private float trackPrice;
	
	private float trackRentalPrice;
	
	private float collectionHdPrice;
	
	private float trackHdPrice;
	
	private float trackHdRentalPrice;
	
	private String releaseDate;
	
	private String collectionExplicitness;
	
	private String trackExplicitness;
	
	private int discCount;
	
	private int discNumber;
	
	private int trackCount;
	
	private int trackNumber;
	
	private int trackTimeMillis;
	
	private String country;
	
	private String currency;
	
	private String primaryGenreName;
	
	private boolean isStreamable = false;
	
	private String contentAdvisoryRating;
	
	private String shortDescription;
	
	private String longDescription;
	
	private boolean hasITunesExtras = false;
	
	public ArrayList<String> getIpadScreenshotUrls(){
		return ipadScreenshotUrls;
	}
	
	public void setIpadScreenshotUrls(ArrayList<String> ipadScreenshotUrls) {
		this.ipadScreenshotUrls = ipadScreenshotUrls;
	}
	
	public ArrayList<String> getAppletvScreenshotUrls(){
		return appletvScreenshotUrls;
	}
	
	public void setAppletvScreenshotUrls(ArrayList<String> appletvScreenshotUrls) {
		this.appletvScreenshotUrls = appletvScreenshotUrls;
	}
	
	public String getWrapperType() {
		return wrapperType;
	}
	
	public void setWrapperType(String wrapperType){
		this.wrapperType = wrapperType;
	}
	
	public String getKind() {
		return kind;
	}
	
	public void setKind(String kind){
		this.kind = kind;
	}
	
	public int getArtistId() {
		return artistId;
	}
	
	public void setArtistId(int artistId){
		this.artistId = artistId;
	}
	
	public int getCollectionId() {
		return collectionId;
	}
	
	public void setCollectionId(int collectionId){
		this.collectionId = collectionId;
	}
	
	public int getTrackId() {
		return trackId;
	}
	
	public void setTrackId(int trackId){
		this.trackId = trackId;
	}
	
	public String getArtistName() {
		return artistName;
	}
	
	public void setArtistName(String artistName){
		this.artistName = artistName;
	}
	
	public String getCollectionName() {
		return collectionName;
	}
	
	public void setCollectionName(String collectionName){
		this.collectionName = collectionName;
	}
	
	public String getTrackName() {
		return trackName;
	}
	
	public void setTrackName(String trackName){
		this.trackName = trackName;
	}
	
	public String getCollectionCensoredName() {
		return collectionCensoredName;
	}
	
	public void setCollectionCensoredName(String collectionCensoredName){
		this.collectionCensoredName = collectionCensoredName;
	}
	
	public String getTrackCensoredName() {
		return trackCensoredName;
	}
	
	public void setTrackCensoredName(String trackCensoredName){
		this.trackCensoredName = trackCensoredName;
	}
	
	public int getCollectionArtistId() {
		return collectionArtistId;
	}
	
	public void setCollectionArtistId(int collectionArtistId){
		this.collectionArtistId = collectionArtistId;
	}
	
	public String getCollectionArtistName() {
		return collectionArtistName;
	}
	
	public void setCollectionArtistName(String collectionArtistName){
		this.collectionArtistName = collectionArtistName;
	}
	
	public String getCollectionArtistViewUrl() {
		return collectionArtistViewUrl;
	}
	
	public void setCollectionArtistViewUrl(String collectionArtistViewUrl){
		this.collectionArtistViewUrl = collectionArtistViewUrl;
	}
	
	public String getArtistViewUrl() {
		return artistViewUrl;
	}
	
	public void setArtistViewUrl(String artistViewUrl){
		this.artistViewUrl = artistViewUrl;
	}
	
	public String getCollectionViewUrl() {
		return collectionViewUrl;
	}
	
	public void setCollectionViewUrl(String collectionViewUrl){
		this.collectionViewUrl = collectionViewUrl;
	}
	
	public String getTrackViewUrl() {
		return trackViewUrl;
	}
	
	public void setTrackViewUrl(String trackViewUrl){
		this.trackViewUrl = trackViewUrl;
	}
	
	public String getPreviewUrl() {
		return previewUrl;
	}
	
	public void setPreviewUrl(String previewUrl){
		this.previewUrl = previewUrl;
	}
	
	public String getArtworkUrl30() {
		return artworkUrl30;
	}
	
	public void setArtworkUrl30(String artworkUrl30){
		this.artworkUrl30 = artworkUrl30;
	}
	
	public String getArtworkUrl60() {
		return artworkUrl60;
	}
	
	public void setArtworkUrl60(String artworkUrl60){
		this.artworkUrl60 = artworkUrl60;
	}
	
	public String getArtworkUrl100() {
		return artworkUrl100;
	}
	
	public void setArtworkUrl100(String artworkUrl100){
		this.artworkUrl100 = artworkUrl100;
	}
	
	public int getFileSizeBytes() {
		return fileSizeBytes;
	}
	
	public void setFileSizeBytes(int fileSizeBytes){
		this.fileSizeBytes = fileSizeBytes;
	}
	
	public float getCollectionPrice() {
		return collectionPrice;
	}
	
	public void setCollectionPrice(float collectionPrice){
		this.collectionPrice = collectionPrice;
	}
	
	public float getTrackPrice() {
		return trackPrice;
	}
	
	public void setTrackPrice(float trackPrice){
		this.trackPrice = trackPrice;
	}
	
	public float getTrackRentalPrice() {
		return trackRentalPrice;
	}
	
	public void setTrackRentalPrice(float trackRentalPrice){
		this.trackRentalPrice = trackRentalPrice;
	}
	
	public float getCollectionHdPrice() {
		return collectionHdPrice;
	}
	
	public void setCollectionHdPrice(float collectionHdPrice){
		this.collectionHdPrice = collectionHdPrice;
	}
	
	public float getTrackHdPrice() {
		return trackHdPrice;
	}
	
	public void setTrackHdPrice(float trackHdPrice){
		this.trackHdPrice = trackHdPrice;
	}
	
	public float getTrackHdRentalPrice() {
		return trackHdRentalPrice;
	}
	
	public void setTrackHdRentalPrice(float trackHdRentalPrice){
		this.trackHdRentalPrice = trackHdRentalPrice;
	}
	
	public String getReleaseDate() {
		return releaseDate;
	}
	
	public void setReleaseDate(String releaseDate){
		this.releaseDate = releaseDate;
	}
	
	public String getCollectionExplicitness() {
		return collectionExplicitness;
	}
	
	public void setCollectionExplicitness(String collectionExplicitness){
		this.collectionExplicitness = collectionExplicitness;
	}
	
	public String getTrackExplicitness() {
		return trackExplicitness;
	}
	
	public void setTrackExplicitness(String trackExplicitness){
		this.trackExplicitness = trackExplicitness;
	}
	
	public int getDiscCount() {
		return discCount;
	}
	
	public void setDiscCount(int discCount){
		this.discCount = discCount;
	}
	
	public int getDiscNumber() {
		return discNumber;
	}
	
	public void setDiscNumber(int discNumber){
		this.discNumber = discNumber;
	}
	
	public int getTrackCount() {
		return trackCount;
	}
	
	public void setTrackCount(int trackCount){
		this.trackCount = trackCount;
	}
	
	public int getTrackNumber() {
		return trackNumber;
	}
	
	public void setTrackNumber(int trackNumber){
		this.trackNumber = trackNumber;
	}
	
	public int getTrackTimeMillis() {
		return trackTimeMillis;
	}
	
	public void setTrackTimeMillis(int trackTimeMillis){
		this.trackTimeMillis = trackTimeMillis;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country){
		this.country = country;
	}
	
	public String getCurrency() {
		return currency;
	}
	
	public void setCurrency(String currency){
		this.currency = currency;
	}
	
	public String getPrimaryGenreName() {
		return primaryGenreName;
	}
	
	public void setPrimaryGenreName(String primaryGenreName){
		this.primaryGenreName = primaryGenreName;
	}
	
	public boolean getIsStreamable() {
		return isStreamable;
	}
	
	public void setIsStreamable(boolean isStreamable){
		this.isStreamable = isStreamable;
	}
	
	public String getContentAdvisoryRating() {
		return contentAdvisoryRating;
	}
	
	public void setContentAdvisoryRating(String contentAdvisoryRating){
		this.contentAdvisoryRating = contentAdvisoryRating;
	}
	
	public String getLongDescription() {
		return longDescription;
	}
	
	public void setLongDescription(String longDescription){
		this.longDescription = longDescription;
	}
	
	public String getShortDescription() {
		return shortDescription;
	}
	
	public void setShortDescription(String shortDescription){
		this.shortDescription = shortDescription;
	}	
	
	public boolean getHasITunesExtras() {
		return hasITunesExtras;
	}
	
	public void setHasITunesExtras(boolean hasITunesExtras){
		this.hasITunesExtras = hasITunesExtras;
	}	
}
