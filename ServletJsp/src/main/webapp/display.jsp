<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
String answer=request.getAttribute("answer").toString();

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h>Answer is : <%= answer  %></h>
<br/><br/><br/><br/>

<form method="get" action="index.jsp">
    <input type="submit" value="Go to index">

</form>

</body>
</html>