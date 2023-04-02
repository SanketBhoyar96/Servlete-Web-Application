<%@page import="com.soft.beans.Product"%>
<%@page import="com.soft.dao.ProductDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="./css/styl.css">
</head>
<style>
 #containers{
            display: flex;
            justify-content: center;
            align-items: center;
            /* text-align: center; */
  
        }
        #containerchilds{
            /* border: 1px solid rgb(250, 246, 246); */
            padding: 30px;
            border-radius: 25px;
            box-shadow: rgba(50, 50, 93, 0.25) 0px 50px 100px -20px, rgba(0, 0, 0, 0.3) 0px 30px 60px -30px, rgba(10, 37, 64, 0.35) 0px -2px 6px 0px inset;
            background-color: #c59989;
        }
        #containerchilds>form>label{
            color: rgb(28 9 6);
            font-size: 20px;
            cursor: pointer;
        }
        #containerchilds>form>input{
            width: 100%;
            height: 30px;
            font-size: 20px;
            cursor: pointer;
            
        }
        #containerchilds>form>input:active{
            background-color: rgb(156, 158, 46);
            border: none;
        }
        #btnsubmit{
            display: flex;
            justify-content: center;
            align-items: center;
            /* width: 70%; */
            /* background-color: tomato; */
        }
        #btnsubmit>input{
            background-color: rgba(180, 9, 9, 0.849);
            padding: 10px;
            width: 50%;
            border: none;
            border-radius: 15px;
            font-size: 20px;
            color: rgb(5, 2, 3);
            cursor: pointer;
            margin: 10px;

        }

        #btnsubmit>input:hover{
            background-color: rgb(231, 32, 18);
        }
      
#btnadd {
	display: flex;
	justify-content: center;
	align-items: center;
	/* width: 70%; */
	/* background-color: tomato; */
}

#btnadd>input {
	background-color: rgba(180, 9, 9, 0.849);
	padding: 10px;
	width: 80%;
	border: none;
	border-radius: 15px;
	font-size: 20px;
	color: rgb(5, 2, 3);
	cursor: pointer;
	margin: 10px;
}

#btnadd>input:hover {
	background-color: rgb(231, 32, 18);
}
</style>
<body>

	<%
	int ProductID = Integer.parseInt(request.getParameter("pid"));
	ProductDAO productDAO = new ProductDAO();
	Product existProd = productDAO.findBypid(ProductID);
	
	%>

	<div id="containers">
		<div id="containerchilds">
			<h1>Update Product</h1>

			<form action="editProduct" method="post">

				
					<label>ProductID*</label><br> 
					<input placeholder="Enter ProductID" type="number" name="pid" readonly value="<%=existProd.getProductID()%>"><br><br>
					 
					<label>ProductName*</label><br>
					 <input	placeholder="Enter ProductName" type="text" name="pname" value="<%=existProd.getProductName()%>"><br><br>
					  
					<label>ProductQTY*</label><br> 
					<input	placeholder="Enter ProductQTY" type="text" type="password" name="pqty" value="<%=existProd.getProductQTY()%>"><br><br> 
						<label>ProductPrice*</label><br>
					<input placeholder="Enter ProductPrice" type="text" name="pprice" value="<%=existProd.getProductPrice()%>"><br><br>
					<div id="btnadd">
						<input type="submit" value="EDITPRODUCT">
					</div>
					<a style="margin-left: 40px" href="ProductDashboard.jsp">Move
						to ProductDashboard</a>

			</form>
		</div>
		</div>
</body>
</html>