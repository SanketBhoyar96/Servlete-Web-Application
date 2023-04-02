<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
body{
background-color: orange;
}
h1{
text-align: center;
}
#anchor{
  display: flex;
  justify-content: center;
}
#anchor>a{
margin: 10px;
font-size: 20px;
}
</style>
</head>
<body>
      <h1>Welcome to User Application</h1>

  <div id="anchor">
      <a  href="UserRegister.jsp">Click here for new Registration</a><br><br>
      <a href="UserLogin.jsp">Click here for login</a>
  </div>
      
</body>
</html>