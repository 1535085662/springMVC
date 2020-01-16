package com.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 
 * @author Ôø´óÒ¯
 */
@Controller
public class user {
	@RequestMapping(value = "login1.do")
	public String userdo(){
		System.out.println("user");
		return "MyJsp";
	}
}
