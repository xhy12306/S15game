package com.xhy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping(value = "/hello")
	public String printHello() {
		System.out.println("nihao");
		return "hello";
	}
}
