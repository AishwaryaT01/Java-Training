<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> First JSP page</title>
</head>
<body bgcolor="dodgerblue">
	<b>Static Content:</b>Hello World!
	<br>
	<b>Scriplet:</b>
	<%
	for(int num=1;num<10;num++){
		out.println(num);
	}
	%>
	<br>
	<b>Declaration:</b>
	<%! int number; %>
	<%
	number=287;
	%>
	<br>
	<b>Expression:</b>
	<%= number %>
	<br>

</body>
</html>