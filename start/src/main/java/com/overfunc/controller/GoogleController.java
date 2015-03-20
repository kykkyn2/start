package com.overfunc.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class GoogleController {
	
	@RequestMapping(value = "/google/docs.htm", method = RequestMethod.POST)
	public String docs(HttpServletRequest request , Model model) {
		
		String a = request.getParameter("test1");
		String b = request.getParameter("test2");
		
		
		
		Map<String,Object> dataMap = new HashMap<String,Object>();
		
		dataMap.put("AAA", a);
		dataMap.put("BBB", b);
		
		JSONObject json = new JSONObject();
		
		model.addAttribute("data", json.put("data", dataMap) );
		
		return "server_response";
	}
	
	
}
