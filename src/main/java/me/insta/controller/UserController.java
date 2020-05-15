package me.insta.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import me.insta.model.User;

@Controller
public class UserController {
	
	private static final Logger log = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private BCryptPasswordEncoder encoder;

	@GetMapping("/auth/join")
	public String authJoin() {
		
		return "auth/join";
	}
	
	@GetMapping("/auth/login")
	public String authLogin() {
		
		return "auth/login";
	}
	
	@PostMapping("/auth/joinProc")
	public String authJoinProc(User user) {
		
		return "";
	}
	
}
