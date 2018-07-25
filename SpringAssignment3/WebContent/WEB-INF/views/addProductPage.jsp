<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.error {
	color: red;
	font-weight: bold;
}
</style>
</head>
<body>
	<div align="center">
		<h2>Enter Product Details</h2>
		<table>
		
			<form:form action="addProduct" method="post"  modelAttribute="product">
			
				<tr>
					<td>Product Name:</td>
					<td><form:input path="productName" size="30" /></td>
					<td><form:errors path="productName" cssClass="error" /></td>
				</tr>
				<tr>
					<td>Product Price:</td>
					<td><form:input path="productPrice" size="30" /></td>
					<td><form:errors path="productPrice" cssClass="error" /></td>
				</tr>
				
				<tr>
					<td><input type="submit" value="Submit" /></td>
				</tr>
			</form:form>
		</table>

</body>
</html>