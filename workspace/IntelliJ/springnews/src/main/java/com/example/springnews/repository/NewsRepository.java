package com.example.springnews.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.springnews.model.News;

public interface NewsRepository extends JpaRepository<News, Integer> {
	public List<News> findByContentContains(String keyword);

	public List<News> findByWriter(String writer);

	@Modifying
	@Query("UPDATE News n SET n.cnt = n.cnt + 1 where n.id = :id")
 	public int updateView(int id);


}
