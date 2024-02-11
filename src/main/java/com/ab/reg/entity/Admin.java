package com.ab.reg.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter 
@Setter 
public class Admin {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	 @Getter @Setter 
	 private int adminId;
	
	 public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserpassword() {
		return userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

	@Getter @Setter 
	 private String userid;

	 @Getter @Setter 
	 private String userpassword;
	 @Getter @Setter 
	 private String comuserpassword;

	public String getComuserpassword() {
		return comuserpassword;
	}

	public void setComuserpassword(String comuserpassword) {
		this.comuserpassword = comuserpassword;
	}
	
	

}
