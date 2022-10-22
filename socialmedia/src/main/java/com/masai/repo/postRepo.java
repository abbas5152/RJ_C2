package com.masai.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.bean.post;

public interface postRepo extends JpaRepository<post, Integer> {

}
