package com.masai.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class login {
	
	  @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Integer id;

	 
	    private String name;

	  
	    private String key;

	 
	    public String getKey() {
			return key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		private String email;
	    
	    private String password;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public login() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
	    
	    

}
