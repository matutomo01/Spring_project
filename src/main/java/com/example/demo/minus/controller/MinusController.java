package com.example.demo.minus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.minus.service.MinusService;

@Controller
public class MinusController {

	private final MinusService minusService;

	public MinusController(MinusService minusService) {
		this.minusService = minusService;
	}

	@GetMapping("minus")
	public String minus() {
		return "minus.html";
	}

	@PostMapping("minus")
	public String minus(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {

		int result = minusService.minus(num1, num2);

		model.addAttribute("result", result);

		return "minus.html";
	}

}