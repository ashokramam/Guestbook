package com.guestbook.rest;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.guestbook.beans.User;
import com.guestbook.beans.UserType;
import com.guestbook.dao.UserDAO;

@RestController
public class UserServices {
	
	public List<User> getUser(String userName){
		// 
		return null;
	}
	
	public UserType validateUser(String userName, String password) {
		return new UserDAO().verifyUser(userName, password);
	}
}
