package com.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 
 * @author ����ү
 */
@Controller
public class login {
	@RequestMapping(value = "login.do")
	public String loginDo(){
		System.out.println("loginDo");
		return "MyJsp";
	}
}
