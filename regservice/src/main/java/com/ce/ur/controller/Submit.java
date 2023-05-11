package com.ce.ur.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ce.ur.aspect.log;
import com.ce.ur.persistence.UserDetails;
import com.ce.ur.service.UpdateDB;

@RestController 
public class Submit {
	@Autowired
	private UpdateDB update;
	private static final Logger LOGGER = LoggerFactory.getLogger(Submit.class);

@PostMapping(value = "/Done", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
public String done(@RequestBody UserDetails user)
{    
	System.out.println("init");
	update.saveIt(user); 
   
	return "successful done"; 
}

@GetMapping(value = "/Check", produces = MediaType.APPLICATION_JSON_VALUE)
public String done(@RequestParam String user)
{  // MDC.put("RequestId", UUID.randomUUID().toString());
	LOGGER.info("***********insertMovie action called..");
//log.info("received request");
	System.out.println("init");
	Optional<UserDetails>  ud = update.getIt(user); 
    if(!ud.isEmpty())
	return "successfully checked /n"+ud.get().toString();
    return "unsuccessful no records found"; 
}
}