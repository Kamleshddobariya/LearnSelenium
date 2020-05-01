package com.pluralsight;

public class HomePage {

	static String url = "http://www.pluralsight.com";
	static String title = "Pluralsight | THE Technology Skills Platform";

	public void goTo() {
		Browser.setUp();
		Browser.goTo(url);
		
	}

	public boolean isAt() {

		return Browser.title().equals(title);
	}

}
