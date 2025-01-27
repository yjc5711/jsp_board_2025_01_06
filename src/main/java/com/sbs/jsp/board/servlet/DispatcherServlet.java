package com.sbs.jsp.board.servlet;

import com.sbs.jsp.board.Rq;
import com.sbs.jsp.board.article.ArticleController;
import com.sbs.jsp.board.member.MemberController;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/usr/*")
public class DispatcherServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    Rq rq = new Rq(req, resp);

    MemberController memberController = new MemberController();
    ArticleController articleController = new ArticleController();

    //getRequestURI
    //http://localhost:8080/usr/article/list/free?page=1
    // /usr/article/list/free 부분만 가져온다
    String url = req.getRequestURI();

    switch (url) {
      case "/usr/article/list/free":
        articleController.showList(rq);
        break;

      case "/usr/article/write/free":
        articleController.showWrite(rq);
        break;

      case "/usr/member/login":
        memberController.showLogin(rq);
        break;

      default:
        System.out.println("해당 페이지는 존재하지 않습니다.");
        break;
    }
  }
}
