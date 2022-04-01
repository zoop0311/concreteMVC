<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
       // get the result String from the request attribute
       String result = (String) request.getAttribute("result");
    
    %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Concrete Calculator Results</title>
</head>
<body>

   <h1>Concrete Calculator</h1>
   
   
   
    <%= result %>
   
   
   
   <p>
     <a href="index.html">Try another!</a>
   </p>

</body>
</html>