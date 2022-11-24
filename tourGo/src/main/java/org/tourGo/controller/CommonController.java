package org.tourGo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice("controller")
public class CommonController {

	//예외 처리하기
	@ExceptionHandler(Exception.class)
	public String handleError(Exception e, Model model) {
		
		model.addAttribute("message", e.getMessage());
		e.printStackTrace();
		
		return "common/errors"; 
	}
	
}