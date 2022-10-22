package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.bean.login;
import com.masai.repo.loginDao;

import net.bytebuddy.utility.RandomString;


@Service
public class loginServiceImpl  implements loginService {
	
	@Autowired
	private loginDao login;

	@Override
	public login registeruser(login log) {
		// TODO Auto-generated method stub
  login admin = login.findById(log.getId()).get() ;
		
		
		
		
		
		if(! admin.getPassword().equalsIgnoreCase(admin.getPassword())) {
			System.out.println("please Enter Correct password");
		}
		
		login adminLoginSession2 = new  login() ;
		
		adminLoginSession2.setId(admin.getId());
		
		String key = RandomString.make(7);
		
		adminLoginSession2.setKey(key);

		
	   return login.save(adminLoginSession2);
		
	
	}

	@Override
	public String signoutuser(login log) {
login adminLoginSession = login.findByKey(log.getKey()) ;
		
		
		login.delete(adminLoginSession);
		
		return "Admin Logged Out Successfully";
	}
	
	

}
