<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to the Java EE World</title>
</head>
<body>
<h1>Sandwich Creator!</h1>
<p>I knew I liked ya!</p>
<form action="makeSandwichServlet" method="post">
<p>Enter thuh toppin's ya want awn yo-wr sayndwich in thuh followin' way - Fried Egg, Ham, Bacon</p>
<p>May-uk syhaw ya inculude 'em commas in thair! that's how we diestinguish all der different items!</p>
<input type="text" name="sandwichToppings" size="50">
<input type="submit" value="Format Sandwich Toppings" />
</form>

</body>
</html>