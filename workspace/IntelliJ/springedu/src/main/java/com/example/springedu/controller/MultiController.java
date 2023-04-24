package com.example.springedu.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class MultiController {	
	@RequestMapping(value="/select")
	public String select_proc() {
		System.out.println("select ............");
		return  "viewTest";
	}
	@RequestMapping(value="/search")
	public String search_proc() {
		System.out.println("search ............");
		return "viewTest";
	}
	@RequestMapping(value="/insert")
	public String insert_proc(int pageno) {
		System.out.println("insert ............"+pageno);
		return  "viewTest";
	}
	@RequestMapping(value="/viewTest")
	public void void_proc(int pageno) {
		System.out.println("viewTest ............");
	}	
}


