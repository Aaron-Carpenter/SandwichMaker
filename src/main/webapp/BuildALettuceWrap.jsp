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
<p>Aha, now we see what type awf feller ya really ahr</p>
<form action="makeLettuceWrapServlet" method="post">
<p>Enter thuh toppin's ya want awn yo-wr sayndwich in thuh followin' way - Sour Dough Bread, Fried Egg, Ham, Bacon, Sour Dough Bread</p>
<p>May-uk syhaw ya inculude 'em commas in thair! that's how we diestinguish all der different items!</p>
<input type="text" name="lettuceWrapContents" size="50">
<input type="submit" value="Format Lettuce Wrap Contents" />
</form>

</body>
</html>