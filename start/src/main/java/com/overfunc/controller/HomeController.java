package com.overfunc.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.overfunc.service.UserService;


@Controller
public class HomeController {
	
	
	@Autowired
	private UserService userService;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/time.htm", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/test.htm", method = RequestMethod.GET)
	public String home2(HttpServletRequest request) {
		
		//Map<String,Object> nMap = new HashMap<String, Object>();
		//nMap.put("you", "babo");
		//request.setAttribute("data", nMap);
		
		JSONObject jsonData = new JSONObject();
		jsonData.put("you", "babo");
		
		request.setAttribute("data",  jsonData );
		
		return "server_response";
	}
	
	
	
	
	
}
