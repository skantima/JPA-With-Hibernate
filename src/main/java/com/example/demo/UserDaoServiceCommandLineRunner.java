package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.enity.User;
import com.example.demo.enity.service.UserDAOService;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner{

	private static final Logger log = LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);
	@Autowired
	private UserDAOService userDaoService;
	
	@Override
	public void run(String... args) throws Exception {
		User user = new User("Jack", "Admin");
		//New user is created : User [id=1, name=Jack, role=Admin]
		long insert = userDaoService.insert(user);
		log.info("New user is created : " + user);
	}
	

}
