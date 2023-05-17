package com.example.springnews.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springnews.model.News;

public interface NewsRepository extends JpaRepository<News, Integer> {


}
