<%@ page import="com.tyss.springmvcassessment.dto.RetailerBean" %>
<%@ page import="com.tyss.springmvcassessment.dto.Product" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   <%
   		RetailerBean bean = (RetailerBean)session.getAttribute("bean");
   %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="./updatepassword">Update Password</a>
<a href="./logout" style="float: right;">Logout</a>
<a href="./totalamount">Total Amount</a>

<h2>Welcome <%=bean.getName() %></h2>
<fieldset>
	<legend>Search Product by Product Id</legend>
	<form action="./search">
		<table>
			<tr>
				<td>ID:</td>
				<td><input type="number" name="pid"></td>
				<td><input type="submit" value="Search"></td>
			</tr>
		</table>
	</form>
</fieldset>
<%
	Product product = (Product)request.getAttribute("product");
%>
<%
if(product!=null){
%>
<table>
			<tr>
				<th>Pid</th>
				<th>PName</th>
				<th>Price</th>
				
			</tr>
			<tr>
				<td><%=product.getPid() %></td>
				<td><%=product.getPname()%></td>
				<td><%=product.getPriceperproduct()%></td>
			</tr>
</table>
<%
}
%>
<h3>${msg}</h3>

<fieldset>
	<legend>Place order here</legend>
	<form action="./doorder" method="post">
		<table>
			<tr>
				<td>ID:</td>
				<td><input type="number" name="pid"></td>
				
			</tr>
			
			<tr>
				<td>Enter Quantity</td>
				<td><input type="number" name="quantity"></td>
				<td><input type="submit" value="order"></td>
				
			</tr>
			
			
		</table>
	</form>
</fieldset>
<a href="./getorder">Get My Orders</a>




</body>
</html>