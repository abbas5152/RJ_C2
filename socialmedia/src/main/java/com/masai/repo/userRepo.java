package com.masai.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.bean.user;

public interface userRepo extends JpaRepository<user,Long> {
	public user findByName(String name);

}
