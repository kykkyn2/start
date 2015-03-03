package com.overfunc.util;

import com.google.gdata.client.spreadsheet.*;
import com.google.gdata.data.spreadsheet.*;
import com.google.gdata.util.*;

import java.io.IOException;
import java.net.*;
import java.util.*;

public class Google {
  public static final String GOOGLE_ACCOUNT_USERNAME = "kykkyn2@gmail.com"; // Fill in google account username
  public static final String GOOGLE_ACCOUNT_PASSWORD = "passwd"; // Fill in google account password
  public static final String SPREADSHEET_URL = "https://spreadsheets.google.com/feeds/spreadsheets/1I32XJzwfSr_sWgPuO8ZfR8xmAVTFYfwQsE86ED7Q-oc"; //Fill in google spreadsheet URI
  
  public static void main(String[] args) throws IOException, ServiceException
  {
    /** Our view of Google Spreadsheets as an authenticated Google user. */
    SpreadsheetService service = new SpreadsheetService("Print Google Spreadsheet Demo");
  
    // Login and prompt the user to pick a sheet to use.
    service.setUserCredentials(GOOGLE_ACCOUNT_USERNAME, GOOGLE_ACCOUNT_PASSWORD);
  
    // Load sheet
    URL metafeedUrl = new URL(SPREADSHEET_URL);
    SpreadsheetEntry spreadsheet = service.getEntry(metafeedUrl, SpreadsheetEntry.class);
    System.out.println(spreadsheet.getTitle().getPlainText());
    //URL listFeedUrl = ((WorksheetEntry) spreadsheet.getWorksheets().get(0)).getListFeedUrl();
  
    
  }
}
