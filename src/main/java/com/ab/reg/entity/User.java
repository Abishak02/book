package com.ab.reg.entity;

import java.util.List;

import jakarta.persistence.ElementCollection;
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

public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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


	public String getDop() {
		return dop;
	}

	public void setDop(String dop) {
		this.dop = dop;
	}

//	public List<String> getTechnology() {
//		return technology;
//	}
//
//	public void setTechnology(List<String> technology) {
//		this.technology = technology;
//	}
@Getter @Setter
	private String name;
@Getter @Setter
	private String username;

@Getter @Setter
	private String dop;
@Getter @Setter
private String technology;
//	@ElementCollection(targetClass = String.class)
//	private List<String> technology;
public String getTechnology() {
	return technology;
}

public void setTechnology(String technology) {
	this.technology = technology;
}
}
