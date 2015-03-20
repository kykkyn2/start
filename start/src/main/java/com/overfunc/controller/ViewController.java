package com.overfunc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ViewController {
  
    @RequestMapping(value = { "/index.htm", "/", "" }, method = RequestMethod.GET)
    public String siteIndex(HttpServletRequest request) {
        return "index";
    }
    
    @RequestMapping(value = "/docs.htm", method = RequestMethod.GET)
    public String gooGleIndex(HttpServletRequest request) {
        return "docs";
    }
    
    
}
