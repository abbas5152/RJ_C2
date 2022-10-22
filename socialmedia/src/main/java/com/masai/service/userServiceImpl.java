package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.bean.post;
import com.masai.bean.user;
import com.masai.repo.postRepo;
import com.masai.repo.userRepo;


@Service
public class userServiceImpl implements userService{
	
	@Autowired
	private postRepo pr;
	

	@Autowired
	private userRepo ur;

	@Override
	public user searchByName(String name, String key) {
		// TODO Auto-generated method stub
		return ur.findByName(name);
		
	}

	@Override
	public user followUser(user us, String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<user> followers(user us,String key) {
		// TODO Auto-generated method stub
		return ur.findById(us.getId()).get().getFriendList();
	}

	@Override
	public user deleteFollower(user us, String key) {
		// TODO Auto-generated method stub
		ur.delete(us);
		
		return us;
		
	}

	@Override
	public post createpost(post p,String key) {
		post p1=null;
		
		p1=pr.save(p);
		
		return p1;
	}

	@Override
	public post deletepost(post p,String key) {
     
		
		pr.delete(p);
		
		return p;
	}

}
