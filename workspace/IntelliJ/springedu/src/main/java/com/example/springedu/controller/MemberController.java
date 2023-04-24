package com.example.springedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.springedu.domain.MemberDTO;

@Controller
public class MemberController {	
	
	@PostMapping("/member1")
	protected ModelAndView proc1(@RequestParam(value = "name", defaultValue = "없음") String name,
			@RequestParam(value = "phone", defaultValue = "없음") String phone,
			@RequestParam(value = "id", defaultValue = "없음") String id,			
			@RequestParam(value = "password", defaultValue = "없음") String password) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("name", name);
		mav.addObject("id", id);
		mav.addObject("phone", phone);
		mav.addObject("password", password);
		mav.setViewName("memberView");
		return mav;
	}
	
	@PostMapping("/member2")
	public String proc2(@ModelAttribute("member") MemberDTO vo) {
		if( vo.getName() == null || vo.getName().equals("")) 			
			vo.setName("없음"); 
		if( vo.getPhone() == null || vo.getPhone().equals("")) 
			vo.setPhone("없음");
		if( vo.getId() == null || vo.getId().equals("")) 
			vo.setId("없음");
		if( vo.getPassword() == null || vo.getPassword().equals("")) 
			vo.setPassword("없음");				
		return "memberView";
	}
	
	@PostMapping("/member3")
	public String proc3(MemberDTO vo) { // memberVO 이름으로 request 객체에 보관까지 된다
		if( vo.getName() == null || vo.getName().equals("")) 			
			vo.setName("없음"); 
		if( vo.getPhone() == null || vo.getPhone().equals("")) 
			vo.setPhone("없음");
		if( vo.getId() == null || vo.getId().equals("")) 
			vo.setId("없음");
		if( vo.getPassword() == null || vo.getPassword().equals("")) 
			vo.setPassword("없음");				
		
		return "memberView";
	}
}
