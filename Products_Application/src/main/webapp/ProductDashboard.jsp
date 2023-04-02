<%@page import="com.soft.beans.Product"%>
<%@page import="java.util.List"%>
<%@page import="com.soft.dao.ProductDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<style>
body {
	background-color: #c1cbc8;
	border: 2px dashed #c1cbc8;
}

#tablecenter {
	display: flex;
	justify-content: center;
	align-items: center;
}

th {
	background-color: rgb(4, 170, 109);
}

table, th, td {
	border: 1px solid;
	border-collapse: collapse;
	text-align: center;
	padding: 20px;
}

tr:nth-child(even) {
	background-color: #f2f2f2;
}

tr:nth-child(odd) {
	background-color: white;
}

td:hover {
	background-color: yellow;
}

td>button:nth-child(1) {
	padding: 8px;
	background-color: #cf6565;
	border: 1px solid #cf6565;
	font-weight: 700;
	cursor: pointer;
}

td>button:nth-child(1):hover {
	background-color: #da4d22;
}

td>button:nth-child(2):hover {
	background-color: #e55b16;
}

td>button:nth-child(2) {
	padding: 8px;
	background-color: #d87c4e;
	border: 1px solid #d87c4e;
	font-weight: 700;
	cursor: pointer;
}

h1 {

	margin:auto;
	text-align:center;
	color: maroon;
	background-color:#7191c3;
	border-radius: 10px;
	width: 30%;
	margin-bottom: 50px;
}

#divCenter {
	text-align: center;
}

#divCenter>button {
	padding: 8px;
	margin: 9px;
	background-color: #bd6b97;
	border: none;
	color: white;
	border-radius: 10px;
}

#divCenter>button:hover {
	color: black;
	background-color: #c8287e;
	cursor: pointer;
}

.btnde {
	padding: 8px;
	background-color: #d87c4e;
	border: 1px solid #d87c4e;
	font-weight: 700;
	cursor: pointer;
}
.btnde>a{
text-decoration:none;
 color: black;
}
.btnde:hover {
	background-color: #e55b16;
}

</style>
<body>

	<%
	String userName = (String) request.getAttribute("UserName");
	%>



	<h1>Products Dashboard</h1>
	<div id="divCenter">
		<span style="color: red; font-size: 25px;">Welcome::<b
			style="color: purple; margin-right: 90px"><%=userName%></b></span>
		<button>
			<a style="color: white; text-decoration: none;" href="AddProduct.jsp">Add
				New Products</a>
		</button>
	</div>
	<div id="tablecenter">
		<table>
			<thead>
				<tr>
					<th>ProductID</th>
					<th>ProductName</th>
					<th>ProductQty</th>
					<th>ProductPrice</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>

				<%
				ProductDAO productdao = new ProductDAO();
				List<Product> productlist = productdao.findAllproduct();
				%>
				<%
				for (Product produ : productlist) {%>

				<tr>
					<td><%=produ.getProductID()%></td>
					<td><%=produ.getProductName()%></td>
					<td><%=produ.getProductQTY()%></td>
					<td><%=produ.getProductPrice()%></td>
					<td>
					<button>
					<a href="EditProduct.jsp?pid=<%=produ.getProductID()%>"style="text-decoration: none; color: black;">EDIT</></button>
						<button class="btnde"><a href="deleteProduct?pid=<%=produ.getProductID()%>" onclick="return confirm('Are You Sure Want to Delete this Record');">DELETE</a></button>
						
					</td>
				</tr>
             <%	}%>
			</tbody>
		</table>
	</div>
</body>
</html>