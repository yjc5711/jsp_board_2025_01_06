<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.sbs.jsp.board.article.dto.ArticleDto" %>
<%
List<ArticleDto> articles = (List<ArticleDto>) request.getAttribute("articles");
  %>

  <h1>게시물 리스트</h1>

  <ul>
    <% if (articles != null) { %>
    <% for (ArticleDto article : articles) { %>
    <li><%= article.getId() %> - <%= article.getTitle() %></li>
    <% } %>
    <% } else { %>
    <li>게시물이 없습니다.</li>
    <% } %>
  </ul>
