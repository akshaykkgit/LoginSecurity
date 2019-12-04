/*akshay*/
package com.m2h.wsi.restcontroller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestController1 {
	
	@GetMapping(value = "rest/home")
	public String hello() {
		return "Akshay home";
	}
	//akshay kk

}
