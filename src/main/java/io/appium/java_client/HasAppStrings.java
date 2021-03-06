package io.appium.java_client;


public interface HasAppStrings {
	
	/**
	* Get all defined Strings from an app for the default language
	*
	* @return a string of all the localized strings defined in the app
	*/
	public String getAppStrings();

	/**
	* Get all defined Strings from an app for the specified language
	*
	* @param language strings language code
	* @return a string of all the localized strings defined in the app
	*/
	public String getAppStrings(String language);

}
