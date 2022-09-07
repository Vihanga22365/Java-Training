<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Calculator Application</h1>
	
	<form method="GET" action=Calculate>

	    <input type="text" name="number1" placeholder="Enter Your First Number" />
	    <br/><br/><br/><br/>
	
	    <select name="sign">
	        <option>+</option>
	        <option>-</option>
	        <option>*</option>
	        <option>/</option>
	    </select>
	
	    <br/><br/><br/><br/>
	    <input type="text" name="number2" placeholder="Enter Your Second Number"/>
	    <br/><br/><br/><br/>
	    <input type="submit" value="Calculate" />
	</form>

</body>
</html>