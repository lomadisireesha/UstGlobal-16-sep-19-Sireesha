<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.ustglobal.springmvc.dto.Order"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="./home">home</a>
<a href="./logout">Logout</a>

<table>
 <tr>
 <th>Name</th>
 <th>Price</th>
 <th>total price</th>
 </tr>
 <% List<Order> products=(List<Order>)request.getAttribute("orders"); %>
 <%for(Order op:products) {%>
 <tr>
 <td><%=op.getName() %></td>
 <td><%=op.getPrice() %></td>
 <td><%=op.getTotal() %></td>
 </tr>
 <%} %>
</table>
</body>
</html>