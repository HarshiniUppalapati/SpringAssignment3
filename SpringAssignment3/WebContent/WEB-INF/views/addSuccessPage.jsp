<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h2> Product added successfully</h2>
		<table border="2" width="70%" cellpadding="2">  
		<tr><th>Product Id</th><th>Product Name</th><th>Price</th></tr>     
   		<tr>  
   		<td>${product.productId}</td>  
   		<td>${product.productName}</td>  
   		<td>${product.productPrice}</td>   
   		</tr>  
   		  
   		</table>  
   		<br/>  
   		<a href="add"><input type="submit" value="Add New Product" /></a>
   		<a href=""><input type="submit" value="Home" /></a>
   		<a href="viewAll"><input type="submit" value="Show all Products/Update" /></a>
		</div>

</body>
</html>