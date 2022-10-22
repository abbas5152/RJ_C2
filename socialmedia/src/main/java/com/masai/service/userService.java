package com.masai.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.masai.bean.post;
import com.masai.bean.user;


@Service
public interface userService {
	
	public user searchByName(String name,String key);
	
	public user followUser(user us,String key);
	
	public List<user> followers(user us,String key);
	
	public user deleteFollower(user us,String key);
	
	public post createpost(post p,String key);
	
	public post deletepost(post p,String key);
	

}
