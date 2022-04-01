<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Groome's MVC Concrete Calculator</title>
</head>
<body>

   <h1>Groome's MVC Concrete Calculator</h1>

   <form action="convert" method="get">
        <p>
        <label>Length:</label>
        <input type="number" name="length" value="0" min="1" max="99" >ft.<br>
        </p>
        <p>
        <label>Width:</label>
        <input type="number" name="width" value="0" min="1" max="99">ft.<br>
        </p>
        <p>
        <label>Depth:</label>
        <input type="number" name="depth" value="0" min="1" max="99">in.<br>
        </p>
		<select name="unit" id="unit">
		<option value="A">50 lb bag</option>
		<option value="B">60 lb bag</option>
		<option value="C">80 lb bag</option>
		</select><br>
		
		<input type="submit" name="submitBtn" value="Calculate">
		<input type="reset" name="Reset" value="reset">
   
   </form>

</body>
</html>