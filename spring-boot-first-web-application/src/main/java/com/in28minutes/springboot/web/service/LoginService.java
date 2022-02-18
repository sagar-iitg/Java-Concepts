package com.in28minutes.springboot.web.service;

import org.springframework.stereotype.Component;

//Spring Bean
@Component

public class LoginService {

	public boolean validateUser(String userid, String password) {

		// sagarku
		// dummy

		return userid.equals("sagarku") && password.equals("dummy");

	}
}
