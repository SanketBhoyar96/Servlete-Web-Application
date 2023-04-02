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
#containerchilds {
	/* border: 1px solid rgb(250, 246, 246); */
	padding: 30px;
	border-radius: 25px;
	box-shadow: rgba(50, 50, 93, 0.25) 0px 50px 100px -20px,
		rgba(0, 0, 0, 0.3) 0px 30px 60px -30px, rgba(10, 37, 64, 0.35) 0px
		-2px 6px 0px inset;
	background-color: #c59989;
}

#containerchilds>form>label {
	color: rgb(28, 9, 6);
	font-size: 20px;
	cursor: pointer;
}

#containerchilds>form>input {
	width: 100%;
	height: 28px;
	font-size: 18px;
	cursor: pointer;
}

#containerchild>form>input:active {
	background-color: rgb(156, 158, 46);
	border: none;
}
</style>
<body>

	<div id="container">
		<div id="containerchilds">
			<h1>User Registration</h1>

			<form action="register" method="post">

				<label>ID*</label><br> <input placeholder="Enter UserID"
					type="number" name="id"><br> <label>Name*</label><br>
				<input placeholder="Enter UserID" type="text" name="fname"><br>

				<label>Contact*</label><br> <input
					placeholder="Enter UserEmail" type="number" name="contact"><br>

				<label>Address*</label><br> <input
					placeholder="Enter UserPassword" type="text" name="address"><br>

				<label>Email*</label><br> <input placeholder="Enter UserName"
					type="text" name="email"><br> <label>Password*</label><br>
				<input placeholder="Enter UserPassword" type="password"
					name="password"><br>

				<div id="btnsubmit">
					<input type="submit" value="REGISTER">
				</div>
				<a style="margin-left: 50px" href="UserLogin.jsp">Already have
					an Account?</a>
		</div>

		</form>
	</div>

</body>
</html>