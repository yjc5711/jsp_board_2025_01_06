package com.sbs.jsp.board.servlet;

import com.sbs.jsp.board.Rq;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/gugudan")
public class GugudanServlet extends HttpServlet {
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    Rq rq = new Rq(request,response);

    int dan = rq.getIntParam("dan",9);
    int limit = rq.getIntParam("limit",9);

    rq.appendBody("<h1>%d단</h1>\n".formatted(dan));
    for(int j = 1; j<=limit; j++){
      rq.appendBody("<div>%d * %d = %d</div>\n".formatted(dan,j,dan*j));

    }

  }
}
