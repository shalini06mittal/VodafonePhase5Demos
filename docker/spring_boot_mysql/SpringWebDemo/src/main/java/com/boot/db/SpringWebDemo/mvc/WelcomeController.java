package com.boot.db.SpringWebDemo.mvc;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.boot.db.SpringWebDemo.entity.Author;
import com.boot.db.SpringWebDemo.service.AuthorService;



@Controller
public class WelcomeController {

	@Autowired
	AuthorService db;
	
	@GetMapping("/welcome")
	public String dashboard(HttpSession session, Map<String, String> map
			,Map<String, List<Author>> mapList)
	{
		String email = (String)session.getAttribute("email");
		if(email != null) {
			map.put("email", email);
			mapList.put("authors", db.getAllAuthor());
			return "welcome";
		}
		return "redirect:signin";
	}
}
