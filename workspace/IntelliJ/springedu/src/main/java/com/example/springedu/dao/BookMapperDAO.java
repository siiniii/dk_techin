package com.example.springedu.dao;

import com.example.springedu.domain.BookMybatisDTO;
import com.example.springedu.domain.EmpVO;
import com.example.springedu.domain.PageDTO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BookMapperDAO {
    @Select("SELECT id, title, price, kind FROM book")
    public List<BookMybatisDTO> b1();

    @Select("SELECT id, title, price, kind FROM book ORDER BY price DESC")
    public List<BookMybatisDTO> b2();

    @Select("SELECT title, price FROM book WHERE price>= 20000")
    public List<BookMybatisDTO> b3();

    @Select("SELECT title, price FROM book WHERE kind = 'b02'")
    public List<BookMybatisDTO> b4();

    @Select(" SELECT title, price FROM book WHERE kind = 'b04' OR kind = 'b05'")
    public List<BookMybatisDTO> b5();

    @Select("SELECT title, price FROM book WHERE title LIKE concat('%',#{key},'%')")
    public List<BookMybatisDTO> b6(String keyword);

    @Select("SELECT kind, AVG(price) price FROM book WHERE kind IS NOT NULL GROUP BY kind")
    public List<BookMybatisDTO> b7();

    @Insert("INSERT INTO book (title, price, kind) VALUES (#{title}, #{price}, #{kind})")
    public boolean insert(BookMybatisDTO bookMybatisDTO);

}