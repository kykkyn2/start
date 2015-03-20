package com.overfunc.util;

import com.google.gdata.client.spreadsheet.*;
import com.google.gdata.data.spreadsheet.*;
import com.google.gdata.util.*;

import java.io.IOException;
import java.net.*;
import java.util.*;

public class Dart {
  public static final String GOOGLE_ACCOUNT_USERNAME = "kykkyn2@gmail.com"; // Fill in google account username
  public static final String GOOGLE_ACCOUNT_PASSWORD = "passwd"; // Fill in google account password
  //public static final String SPREADSHEET_URL = "https://docs.google.com/spreadsheets/d/1I32XJzwfSr_sWgPuO8ZfR8xmAVTFYfwQsE86ED7Q-oc/edit#gid=0"; //Fill in google spreadsheet URI
  public static final String SPREADSHEET_URL = "https://docs.google.com/a/adwitt.com/spreadsheets/d/1crlKgx62WRoK4oSKEjHPvtVbPHJ-feB3OTExI4d0GU4/edit#gid=0";	//	다트
  
  public static void main(String[] args) throws IOException, ServiceException {

    // 먼저 서비스를 만들고 로그인 정보를 입력합니다.
    SpreadsheetService service = new SpreadsheetService("MySpreadsheetIntegration-v1");
    service.setUserCredentials(GOOGLE_ACCOUNT_USERNAME, GOOGLE_ACCOUNT_PASSWORD);

    
//    URL SPREADSHEET_FEED_URL = new URL("https://spreadsheets.google.com/feeds/spreadsheets/private/full");
//    URL SPREADSHEET_FEED_URL = new URL("https://spreadsheets.google.com/feeds/worksheets/1crlKgx62WRoK4oSKEjHPvtVbPHJ-feB3OTExI4d0GU4/private/full");
    //	
    URL SPREADSHEET_FEED_URL = new URL("https://spreadsheets.google.com/feeds/worksheets/1crlKgx62WRoK4oSKEjHPvtVbPHJ-feB3OTExI4d0GU4/private/full");
    

    // feed.getEntries() 를 통해 등록되어 있는 모든 SpreadSheet 의 Entry 를 List 로 반환합니다.
    SpreadsheetFeed feed = service.getFeed(SPREADSHEET_FEED_URL, SpreadsheetFeed.class);
    
    System.out.println(feed.getTitle().getPlainText());
    List<SpreadsheetEntry> spreadsheets = feed.getEntries();
    
    for (SpreadsheetEntry entry : spreadsheets) {
    	System.out.println(entry.getKey()+" <<<>>>"+entry.getTitle().getPlainText());
    }
    


  }
}
  

