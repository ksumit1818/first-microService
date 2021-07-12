package com.learn.App.hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
public class HelloWrold {

	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}
}
