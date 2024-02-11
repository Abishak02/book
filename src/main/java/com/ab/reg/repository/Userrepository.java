package com.ab.reg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.ab.reg.entity.User;


@Repository
public interface Userrepository extends JpaRepository<User, Integer> {
	

   
}
