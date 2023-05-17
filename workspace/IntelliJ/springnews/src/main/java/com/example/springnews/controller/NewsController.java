package com.example.springnews.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.springnews.model.News;
import com.example.springnews.repository.NewsRepository;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class NewsController {
	@Autowired
	private NewsRepository newsRepository;

	@GetMapping(path = {"/newsmain"})
	public String loadAllNews(Model model){
		List<News> allNews = newsRepository.findAll();
		model.addAttribute("allNews", allNews);
		System.out.println(allNews);
		return "newsMain";
	}
	@GetMapping(path = {"/listOne"})
	@ResponseBody
	public String loadClickedNews(Model model, int id){
		News news = newsRepository.findById(id).get();
		model.addAttribute("news", news);
		return "newsDetail";
	}

//@ResponseBody
	// 	public Meeting one(int id) {
	// 		Meeting vo = repositoryM.findById(id).get();
	// 		return vo;
	// 	}

}
