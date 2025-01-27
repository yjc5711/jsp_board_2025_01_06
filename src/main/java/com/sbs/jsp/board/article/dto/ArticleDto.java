package com.sbs.jsp.board.article.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ArticleDto {
  private int id;

  private String title;

  private String body;
}
