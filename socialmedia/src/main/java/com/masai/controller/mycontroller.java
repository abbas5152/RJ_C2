package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.bean.login;
import com.masai.bean.post;
import com.masai.bean.user;
import com.masai.service.loginServiceImpl;
import com.masai.service.userServiceImpl;

@RestController
public class mycontroller {
	
	@Autowired
	private userServiceImpl us;
	
	@Autowired
	private loginServiceImpl ls;
	
	
	@GetMapping("/user/{name}/{key}")
	public user searchbyName(@PathVariable String name,@PathVariable String key) {
		
		return us.searchByName(name, key);
	}
	
	@PostMapping("/user")
	public user followuser(@RequestBody user u,String key) {
		return us.followUser(u, key);
	}
	
	@GetMapping("/users")
	public List<user> listofusers(user u,String key){
		
		return us.followers(u, key);
	}
	
	@DeleteMapping("/user")
	public user deletefollower(user u,String key) {
		 return us.deleteFollower(u, key);
	}
	@PostMapping("/post")
	public post createpost(@RequestBody post p,String key) {
		
		return us.createpost(p, key);
	}
	
	@DeleteMapping("/post")
	public post deleteepost(post p,String key) {
		
		return us.deletepost(p, key);
	}
	
	@PostMapping("/login")
	public login loginuser(@RequestBody login log,String key) {
		
		return ls.registeruser(log);
		
	}
	
	@DeleteMapping("/login")
	public String logoutuser(@RequestBody login log,String key) {
		
		return ls.signoutuser(log);
		
	}
	

}
