<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Apna Time Aayega</title>
</head>
<body>


	<form method="post" action="AddEmployeeServlet">
		<div class="form-group">
			Enter Empno : <input type="text" class="form-control"
				placeholder="Enter Employee Number" required="required" id="empno"
				name="empno"><br /> Enter Name : <input type="text"
				class="form-control" placeholder="Enter Employee Name"
				required="required" id="empname" name="empname"><br />
			Enter Salary : <input type="text" class="form-control"
				placeholder="Enter Employee Salary" required="required" id="empsal"
				name="empsal"><br /> <input type="submit" value="Add"><br />

			<%
				HttpSession sess = request.getSession();
				String x = (String) (sess.getAttribute("message"));
				if (x != null) {
			%>
			<h3 style="color: green"><%=x%></h3>
			<%
				}
			%>
		
	</form>

</body>
</html>