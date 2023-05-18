package com.example.springnews.controller;


import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.springnews.model.News;
import com.example.springnews.repository.NewsRepository;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class NewsController {
	@Autowired
	private NewsRepository newsRepository;

	@GetMapping("/newsmain")
	public String loadAllNews(Model model, @RequestParam(defaultValue = "1") int page) {
		Pageable pageable = PageRequest.of(page - 1, 3);
		Page<News> newsPage = newsRepository.findAll(pageable);
		List<News> allNews = newsPage.getContent();
		model.addAttribute("allNews", allNews);
		model.addAttribute("currentPage", page);
		model.addAttribute("totalPages", newsPage.getTotalPages());
		return "newsMain";
	}

	@GetMapping(path = {"/list/{id}"})
	@Transactional
	public String loadClickedNews(Model model, @PathVariable int id){
		News news = newsRepository.findById(id).orElse(null);
		newsRepository.updateView(id);
		model.addAttribute("news", news);
		return "newsDetail";
	}
	@GetMapping(path = {"/update/{id}"})
	public String loadModifyNewsForm(Model model, @PathVariable int id){
		News news = newsRepository.findById(id).orElse(null);
		model.addAttribute("news", news);
		return "newsUpdate";
	}
	@PostMapping(path = {"/update"})
	@Transactional
	public String modifyNews(News news, Model model) {
		try {

			News oldNews = newsRepository.findById(news.getId()).get();
			oldNews.setWriter(news.getWriter());
			oldNews.setCnt(news.getCnt());
			oldNews.setTitle(news.getTitle());
			oldNews.setContent(news.getContent());
			model.addAttribute("news",newsRepository.findAll());
		} catch (Exception e) {
			model.addAttribute("msg", "글 수정중 오류가 발생하였습니다.");
		}
		return "redirect:/list/" + news.getId();
	}

	@GetMapping(path = {"/insert"})
	public String loadWriteNewsForm(){
		return "insertNews";
	}
	@PostMapping(path = {"/insert"})
	@Transactional
	public String writeNews(News news) {
		newsRepository.save(news);
		return "redirect:/newsmain";
	}

	@GetMapping(path = {"/delete/{id}"})
	public String deleteNews(@PathVariable int id){
		newsRepository.deleteById(id);
		return "redirect:/newsmain";
	}

	@GetMapping(path = {"search"})
	public String searchNewsByKeyword(String keyword, Model model){
		List<News> news = newsRepository.findByContentContains(keyword);
		if(news.size() != 0) {
			model.addAttribute("news", news);
		} else {
			model.addAttribute("msg", "검색결과가 없습니다.");
		}
		return "searchNews";
	}

	@GetMapping(path = {"writer/{writer}"})
	public String searchNewsByWriter(@PathVariable String writer, Model model){
		List<News> news = newsRepository.findByWriter(writer);
		model.addAttribute("news",news);
		return "writerNews";
	}



}
