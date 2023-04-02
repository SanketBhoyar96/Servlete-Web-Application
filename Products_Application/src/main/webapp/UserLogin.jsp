<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="./css/styl.css">
</head>
<body>
 <div id="container">
        <div id="containerchild">
          <h1>User Login</h1>
            
            <form action="login" method="get">
                <label>Email*</label><br> 
                 <input placeholder="Enter UserName" type="text" name="email"><br>
                <br>
                <label>Password*</label><br> 
                 <input placeholder="Enter UserPassword" type="password" name="password"><br>
                <br> 
                <div id="btnsubmit">
                    <input type="submit" value="LOGIN">
                </div>
                <a style="margin-left: 50px" href="UserRegister.jsp">Don't have an Account</a>
        </div>

        </form>
    </div>

</body>
</html>