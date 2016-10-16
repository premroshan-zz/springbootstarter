package com.example.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.domain.*;

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
	
	@RequestMapping(value="/journal",produces={MediaType.APPLICATION_JSON_UTF8_VALUE})
	public @ResponseBody List<Journal> getJournal(){
		return Repo.findAll();
	}
}
