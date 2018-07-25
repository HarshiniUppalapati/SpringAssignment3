<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Products List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>Name</th><th>Price</th></tr>  
   <c:forEach var="product1"  items="${product}">   
   <tr>  
   <td>${product1.productId}</td>  
   <td>${product1.productName}</td>  
   <td>${product1.productPrice}</td>  
   <td><a href="update/${product1.productId}">Update</a></td>
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   <a href="add"><input type="submit" value="Add New Product" /></a>
   <a href=""><input type="submit" value="Home" /></a>

</body>
</html>