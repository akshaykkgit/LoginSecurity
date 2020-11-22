package com.m2h.wsi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.m2h.wsi.entity.CodingLanguage;

@Controller
public class AppController {

	@PostMapping("/submitCodingLanguage")
	public String greetingSubmit(@ModelAttribute CodingLanguage language, Model model) {
		model.addAttribute("language", language);
		return "result";
	}

}
