package com.example.abc;

import org.springframework.web.bind.annotation.RequestMapping;

public class controller1 {
	@RequestMapping("/forw")
	public String xyz() {
		System.out.println("preeti singh");
		return "dispaly.jsp";
	}

}
