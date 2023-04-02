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
	text-align: center;
	color: purple;
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

.btnde:hover {
	background-color: #e55b16;
}
</style>
<body>

	<h1>Products Dashboard</h1>
	<div id="divCenter">
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
				<tr>
					<td>1</td>
					<td>TV</td>
					<td>2</td>
					<td>20000</td>
					<td>
						<button>EDIT</button>
						<button>Delete</button>
					</td>
				</tr>
				<tr>
					<td>2</td>
					<td>LED</td>
					<td>2</td>
					<td>30000</td>
					<td>
						<button>EDIT</button>
						<button>Delete</button>
					</td>
				</tr>
				<tr>
					<td>3</td>
					<td>Mobile</td>
					<td>2</td>
					<td>10000</td>
					<td>
						<button>EDIT</button>
						<button>Delete</button>
					</td>
				</tr>
				<tr>
					<td>4</td>
					<td>Laptop</td>
					<td>2</td>
					<td>40000</td>
					<td>
						<button>EDIT</button>
						<button>Delete</button>
					</td>
				</tr>
				<tr>
					<td>5</td>
					<td>Headphone</td>
					<td>2</td>
					<td>1500</td>
					<td>
						<button>
							<a href="EditProduct.jsp"
								style="text-decoration: none; color: black;">EDIT</>
						</button>
						<button class="btnde">Delete</button>
					</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>