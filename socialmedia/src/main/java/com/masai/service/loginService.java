package com.masai.service;

import org.springframework.stereotype.Service;

import com.masai.bean.login;

@Service
public interface loginService {
	
	public login registeruser(login log);
	
	public String signoutuser(login log);

}
