package edu.sustech.zxc.roommatezxcbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
	@GetMapping("/")
	public String index() {
		return "Comming soon......<br>";
	}
}
