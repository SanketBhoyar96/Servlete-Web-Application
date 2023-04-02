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
 #btnadd{
            display: flex;
            justify-content: center;
            align-items: center;
            /* width: 70%; */
            /* background-color: tomato; */
        }
        #btnadd>input{
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

        #btnadd>input:hover{
            background-color: rgb(231, 32, 18);
        }
</style>
<body>

 <div id="container">
        <div id="containerchild">
          <h1>Add New Product</h1>
            
            <form action="addpro" method="post">
                
               
				<label>ProductID*</label><br> 
                 <input placeholder="Enter UserID" type="number" name="pid"><br>
                <br>
                <label>ProductName*</label><br> 
                 <input placeholder="Enter UserEmail" type="text" name="pname"><br>
                <br> 
                 <label>ProductQTY*</label><br> 
                 <input placeholder="Enter UserPassword" type="text" type="password" name="pqty"><br>
                <br> 
                <label>ProductPrice*</label><br> 
                 <input placeholder="Enter UserName" type="text" name="pprice"><br>
                <br> 
                <div id="btnadd">
                    <input type="submit" value="ADDPRODUCT">
                </div>
                <a style="margin-left: 50px" href="ProductDashboard.jsp">Move to ProductDashboard</a>
        </div>

        </form>
    </div>


</body>
</html>