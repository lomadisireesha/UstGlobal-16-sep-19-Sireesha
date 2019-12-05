<%@ page import="com.tyss.springmvcassessment.dto.OrderBean" %>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	List<OrderBean> list = (List)request.getAttribute("list");
%>
<%
if(list!=null){
	for(OrderBean order:list){
%>
<table>
			<tr>
				<th>OrderId</th>
				<th>OrderName</th>
				<th>Quantity</th>
				<th>Amount Payable</th>
				
			</tr>
			<tr>
				<td><%=order.getOrderid() %></td>
				<td><%=order.getProductname()%></td>
				<td><%=order.getQuantity()%></td>
				<td><%=order.getAmountpayable()%></td>
			</tr>
</table>
<%} %>
<%
}
%>
<h3>${msg}</h3>

</body>
</html>