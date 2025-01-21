<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.sbs.jsp.board.Rq" %>

<%
Rq rq = new Rq(request, response);

int dan = rq.getIntAParam("dan", 9);
int limit = rq.getIntParam("limit", 9);
<%
int dan = Integer.parseInt(request.getParameter("dan"));
int limit = Integer.parseInt(request.getParameter("limit"));
%>

<h1><%=dan%>단</h1>
<% for(int i = 1; i <= limit; i++) { %>
  <div><%=dan%> * <%=i%> = <%=dan * i%></div>
<% } %>




