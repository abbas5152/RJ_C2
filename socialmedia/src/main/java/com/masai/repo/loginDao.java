package com.masai.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.bean.login;

public interface loginDao extends JpaRepository<login, Integer> {
	
	public login findByKey(String key);

}
