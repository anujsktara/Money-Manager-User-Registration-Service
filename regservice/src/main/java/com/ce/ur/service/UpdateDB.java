package com.ce.ur.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Optionals;
import org.springframework.stereotype.Service;

import com.ce.ur.aspect.log;
import com.ce.ur.persistence.UserDetails;
import com.ce.ur.persistence.UserDetailsRepository;

@Service
public class UpdateDB {
	@Autowired
	private UserDetailsRepository repo; 
	
public void saveIt(UserDetails row)
{
	repo.save(row); 
}
@log
public Optional<UserDetails> getIt(String username)
{
	return repo.findById(username); 
}
}
