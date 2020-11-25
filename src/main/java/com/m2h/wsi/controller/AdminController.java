package com.m2h.wsi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.m2h.wsi.entity.CodingLanguage;
import com.m2h.wsi.entity.Greeting;
import com.m2h.wsi.repository.CodingLanguageRepository;

@Controller
public class AdminController {
	  @Autowired
	  private  CodingLanguageRepository codingRepo;
	  @PostMapping("/addProgramingLanguage")
	  public String greetingSubmit(@ModelAttribute("code") CodingLanguage codingLanguage,BindingResult errors, Model model) {
	    if(!codingRepo.existCodingLanguage(codingLanguage.getCodingLanguage()) ) {
		codingRepo.save(codingLanguage);
	    }
	    model.addAttribute("codingLanguage", codingLanguage);
	    return "result2";
	  }
}
