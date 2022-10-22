package com.masai.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class user {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private long id;

	 
	    private String name;

	  
	    private String username;

	 
	    private String email;
	    
	    @ManyToMany(cascade = CascadeType.ALL)
	     @JsonIgnore
	    private List<user> friendList = new ArrayList<>();

		
		@OneToMany(cascade = CascadeType.ALL)
		private List<post> list=new ArrayList<>();

		public List<post> getList() {
			return list;
		}

		public void setList(List<post> list) {
			this.list = list;
		}

		public user() {
			super();
			// TODO Auto-generated constructor stub
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public List<user> getFriendList() {
			return friendList;
		}

		public void setFriendList(List<user> friendList) {
			this.friendList = friendList;
		}

		@Override
		public String toString() {
			return "user [id=" + id + ", name=" + name + ", username=" + username + ", email=" + email + ", friendList="
					+ friendList + "]";
		}
	    
	    

}
