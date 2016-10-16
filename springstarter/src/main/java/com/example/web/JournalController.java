package com.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.repository.JournalRepository;

@Controller
public class JournalController {
	@Autowired
	JournalRepository Repo;
	
	@RequestMapping("/")
	public String index(Model model){
		model.addAttribute("journal",Repo.findAll());
		return "index";
	}
}
