package com.sbs.jsp.board;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Rq {
  private final HttpServletRequest req;
  private final HttpServletResponse resp;

  public Rq(HttpServletRequest req, HttpServletResponse resp) {
    this.req = req;
    this.resp = resp;
    try {
      req.setCharacterEncoding("utf-8");
    } catch (UnsupportedEncodingException e) {
      throw new RuntimeException(e);
    }
    resp.setCharacterEncoding("utf-8");
    resp.setContentType("text/html;charset=utf-8");
  }

  // 정수를 반환하는 메서드
  public int getIntParam(String paramName, int defaultValue) {
    String value = req.getParameter(paramName);

    if (value == null) {
      return defaultValue; // 파라미터가 없으면 기본값 반환
    }

    try {
      return Integer.parseInt(value); // 파라미터 값을 정수로 변환
    } catch (NumberFormatException e) {
      return defaultValue; // 숫자로 변환할 수 없으면 기본값 반환
    }
  }

  public void appendBody(String str) {
    try {
      resp.getWriter().append(str);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
