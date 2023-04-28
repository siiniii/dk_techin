package com.example.springedu.dao;

import com.example.springedu.domain.BookMybatisDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookMybatisDAO {
    @Autowired
    SqlSession session;

    public List<BookMybatisDTO> b1() {
        List<BookMybatisDTO> list = null;
        try {
            String statement = "lab1.exam1";
            list = session.selectList(statement);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<BookMybatisDTO> b2() {
        List<BookMybatisDTO> list = null;
        try {
            String statement = "lab1.exam2";
            list = session.selectList(statement);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<BookMybatisDTO> b3() {
        List<BookMybatisDTO> list = null;
        try {
            String statement = "lab1.exam3";
            list = session.selectList(statement);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<BookMybatisDTO> b4() {
        List<BookMybatisDTO> list = null;
        try {
            String statement = "lab1.exam4";
            list = session.selectList(statement);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public List<BookMybatisDTO> b5() {
        List<BookMybatisDTO> list = null;
        try {
            String statement = "lab1.exam5";
            list = session.selectList(statement);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<BookMybatisDTO> b6(String keyword) {
        List<BookMybatisDTO> list = null;
        try {
            String statement = "lab1.exam6";
            list = session.selectList(statement, keyword);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<BookMybatisDTO> b7(String keyword) {
        List<BookMybatisDTO> list = null;
        try {
            String statement = "lab1.exam6";
            list = session.selectList(statement, keyword);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<BookMybatisDTO> b8() {
        List<BookMybatisDTO> list = null;
        try {
            String statement = "lab1.exam7";
            list = session.selectList(statement);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean insert(BookMybatisDTO bookMybatisDTO) {
        boolean result = true;
        String statement = "lab1.insertBookData";
        if(session.insert(statement,bookMybatisDTO) != 1)
            result = false;
        return result;
    }

}
