package com.boot.db.SpringWebDemo.mvc;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.boot.db.SpringWebDemo.entity.LoginUser;


@Controller
public class HomeController {

	@GetMapping("/signin")
	public String signInUser(@RequestParam(required = false)
	String error, Map<String, String> map)
	{
		System.out.println("sign in user "+error);
		// is the name of the view
		if(error != null)
			map.put("error", error);
		return "login";
	}
	
	@PostMapping("/login")
	// Model, map, ModelAndView
	public String loginUser(LoginUser user, Map<String, String> map,HttpSession session)
	{
		System.out.println("user details "+ user);
		if(user.getEmail().equals("kshitij@gmail.com") && user.getPassword().equals("kshitij"))
		{
			// success RequestDispacther
			//map.put("email",user.getEmail());
			session.setAttribute("email", user.getEmail());
			//model.addAttribute("email", user.getEmail());
			return "redirect:welcome";
		}
		// failure
		// response.sendredirect
		return "redirect:signin?error=Invalid Credentials";
	}
	@GetMapping("/logout")
	public String logout(HttpSession session)
	{
		session.removeAttribute("email");
		session.invalidate();
		return "redirect:signin";
	}
	
}
