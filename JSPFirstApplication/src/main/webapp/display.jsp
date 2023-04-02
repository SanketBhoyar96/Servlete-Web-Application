<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>User DATA</h1>

<%@ include file="Header.jsp"%>


<--Declerative tag-->
<%! int a=90; %>      
<%! public int m1(){
	return a;
	}
	%>
	
    <%= a=100 %>  //Expression tag//
    
   <%     // <--Scriplet tag-->//
   String name= request.getParameter("fname");
   String email= request.getParameter("email");
   String phoneNo=request.getParameter("phone");
   
   out.print(name);
   out.print(email);
   out.print(phoneNo);
   
   String str= "abcd";
   //out.println(str);//
   str="world";
   out.print(str);
   out.println(m1());
   
   
   %>
   <%= str="hello" %>
   
 <%@ include file="Footer.jsp" %>

</body>
</html>