<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <h1> Spring boot MVC works!!!!</h1>
   <%
      String[] names=(String[])request.getAttribute("names");
   %>
   <h3><u>Team</u></h3>
   <ul>
      <%
        for(String x:names){
      %>
        <li> <% out.println(x); %></li>
       <% 
       }
       %>
   </ul>
   
   <h4>Number of times accessed in this session: <%=request.getAttribute("scounter") %></h4>
   <h4>Number of times accessed in this application: <%=request.getAttribute("acounter") %></h4>
   
</body>
</html>