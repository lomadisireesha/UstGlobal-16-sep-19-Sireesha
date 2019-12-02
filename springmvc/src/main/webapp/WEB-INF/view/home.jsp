
<%@page import="com.ustglobal.springmvc.dto.RetailBean"%>
<%
RetailBean bean =(RetailBean)session.getAttribute("user");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>${msg} </h3>
	<a href="./changepassword">Change Password</a>
	<a href="./order">ordered item</a>
	<a href="./searchproduct">Search Product</a>
	<a href="./logout">Logout</a>
	<%-- <h2>Welcome <%=bean.getName()%></h2> --%>

<h3 style="color: red;">${msg}</h3>
</body>
</html>