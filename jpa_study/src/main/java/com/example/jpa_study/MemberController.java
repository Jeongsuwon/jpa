package com.example.jpa_study;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {
	
	@GetMapping("test")
	public String test(Model model) {
		
		model.addAttribute("data", "babo");
		return "login";
	}

}
