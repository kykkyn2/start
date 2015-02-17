package com.overfunc.util;

import com.google.gdata.client.spreadsheet.*;
import com.google.gdata.data.spreadsheet.*;
import com.google.gdata.util.*;

import java.io.IOException;
import java.net.*;
import java.util.*;

public class Songle {
  public static final String GOOGLE_ACCOUNT_USERNAME = "kykkyn2@adwitt.com"; // Fill in google account username
  public static final String GOOGLE_ACCOUNT_PASSWORD = "qkrwjd1!"; // Fill in google account password
  public static final String SPREADSHEET_URL = "https://spreadsheets.google.com/feeds/spreadsheets/1I32XJzwfSr_sWgPuO8ZfR8xmAVTFYfwQsE86ED7Q-oc"; //Fill in google spreadsheet URI
  
  public static void main(String[] args)
      throws AuthenticationException, MalformedURLException, IOException, ServiceException {

    SpreadsheetService service = new SpreadsheetService("MySpreadsheetIntegration-v1");
    
    service.setUserCredentials(GOOGLE_ACCOUNT_USERNAME, GOOGLE_ACCOUNT_PASSWORD);
    
    // Define the URL to request.  This should never change.
    //URL SPREADSHEET_FEED_URL = new URL("https://spreadsheets.google.com/feeds/spreadsheets/private/full");
    URL SPREADSHEET_FEED_URL = new URL(SPREADSHEET_URL);

    // Make a request to the API and get all spreadsheets.
    SpreadsheetFeed feed = service.getFeed(SPREADSHEET_FEED_URL, SpreadsheetFeed.class);
    
    List<SpreadsheetEntry> spreadsheets = feed.getEntries();
    
    // Iterate through all of the spreadsheets returned
    
    for (SpreadsheetEntry spreadsheet : spreadsheets) {
      // Print the title of this spreadsheet to the screen
      System.out.println(spreadsheet.getTitle().getPlainText());
    }
    
  }

}
