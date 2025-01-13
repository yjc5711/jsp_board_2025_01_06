package com.sbs.jsp.board.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/gugudan")
public class GugudanServlet extends HttpServlet {
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    request.setCharacterEncoding("utf-8");
    response.setCharacterEncoding("utf-8");
    response.setContentType("text/html;charset=utf-8");

    int dan = Integer.parseInt(request.getParameter("dan"));
    int limit = Integer.parseInt(request.getParameter("limit"));;
    response.getWriter().append("<h1>%d단</h1>\n".formatted(dan));
    for(int j = 1; j<=limit; j++){
      response.getWriter().append("<div>%d * %d = %d</div>\n".formatted(dan,j,dan*j));
    }

  }
}
