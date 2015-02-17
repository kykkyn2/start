package com.overfunc.service.impl;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.overfunc.dao.UserDao;
import com.overfunc.service.UserService;
import com.overfunc.vo.User;


@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	
	@Override
	public String userInsert(HttpServletRequest request) {
		User user = new User();
		user.setId( request.getParameter("login_id") );
		user.setPassword( request.getParameter("login_pwd") );
		
		int insertFlag = userDao.userInsert( user );
		
		JSONObject jsonData = new JSONObject();
		
		if(insertFlag == 1){
			jsonData.put("insert", "success");
		}else{
			jsonData.put("insert", "error");
		}
		
		request.setAttribute("data",  jsonData );
		
		return "server_response";
	}
	
}
