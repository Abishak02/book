package com.ab.reg.controller;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import javax.management.loading.PrivateClassLoader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ab.reg.entity.Admin;
import com.ab.reg.entity.User;
import com.ab.reg.repository.Adminrepository;
import com.ab.reg.repository.Userrepository;

@Controller
public class Parentcontroller {
	
	@Autowired
	private Userrepository userrepository;

	
	@GetMapping("/index")
	
	public String home(Model model) {
		 
		return "index";
	}
	
	@GetMapping("/registration")
	public String registrationpage(User user) {
		return "registrationpage";
	}
	@PostMapping("/register")
//	@ResponseBody
	public String register(@ModelAttribute("user")User user) {
//		System.out.println(user);
		userrepository.save(user);
		return "redirect:/booklist";
	}
	@GetMapping("/booklist")
	public String bookdetais(Model model) {
	List<User> booklist=userrepository.findAll();
	model.addAttribute("book", booklist);
	
		return"bookdetails";
	}
	
	@Autowired
	private Adminrepository adminrep;
	
	@GetMapping("/adminlogin")
	public String adminlog(Admin admin) {
		return "adminlogin";
	}

	@PostMapping("/adminregister")
//	@ResponseBody
	public String adminregister(@RequestParam("userid")String userid,@RequestParam("userpassword")String userpassword) {

	Admin dbadmin =	adminrep.findByUseridAndUserpassword(userid, userpassword);


	 if (dbadmin != null ) {
	      
	        return "redirect:/registration";
	
	    }


     return "redirect:/admindetail";

}
	@GetMapping("/admindetail")
	public String admindetail(Admin admin) {
		return "admindetails";
	}
	@PostMapping("/admindetails")
//	@ResponseBody
	public String admindetails(@ModelAttribute("admin")Admin admin) {
//		System.out.println(user);
		adminrep.save(admin);
		return "redirect:/index";
	}
	@Autowired

	private Userrepository user;
	 @GetMapping("/delete/{userId}")
//		@ResponseBody
	    public String  deleteUser(@PathVariable int userId) {
		 user.deleteById(userId);
		
			return "redirect:/booklist";
		
	    }
		@GetMapping("/contact")
		public String contact() {
			return "contact";
		}
	 
}

