package com.sbs.jsp.board.servlet;

import com.sbs.jsp.board.Rq;
import jakarta.servlet.RequestDispatcher;
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

    //request에 정보를 담는다.
    // 왜냐하면 나중에 gugudan2.jsp에서 해당 내요을 꺼내 쓸 수 있기 때문에
    request.setAttribute("dan",dan);// key, value
    request.setAttribute("limit",limit);

    //gugudan2.jsp에게 나머지 작업을 토스
    RequestDispatcher requestDispatcher = request.getRequestDispatcher("/gugudan2.jsp");
    requestDispatcher.forward(request, response);


  }
}
