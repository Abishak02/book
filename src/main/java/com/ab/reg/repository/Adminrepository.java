package com.ab.reg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ab.reg.entity.Admin;
import com.ab.reg.entity.User;

@Repository
public interface Adminrepository extends JpaRepository<Admin, Integer>{
	Admin findByUseridAndUserpassword(String userid, String userpassword);
	
}
