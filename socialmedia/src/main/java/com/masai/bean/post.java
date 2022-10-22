package com.masai.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class post {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int postid;
	private String caption;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	private user users;
	


	public user getUsers() {
		return users;
	}

	public void setUsers(user users) {
		this.users = users;
	}

	public int getPostid() {
		return postid;
	}

	public void setPostid(int postid) {
		this.postid = postid;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	

	public post() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
