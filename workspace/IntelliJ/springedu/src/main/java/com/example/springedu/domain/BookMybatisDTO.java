package com.example.springedu.domain;

import lombok.Data;

@Data
public class BookMybatisDTO {
  private String id;
  private String title;
  private int price;
  private String kind;
}
