<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<%@ page isELIgnored="false"%>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css" integrity="sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Products List</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
<form action="product" method="post"  >
  <h2>Welcome To Product App</h2>
         
  <table class="table">
    <thead>
      <tr>
        <th>Product Id</th>
        <th>Product Name</th>
        <th>Product Description</th>
        <th>Product Price</th>
        <th>Action</th>
      </tr>
    </thead>
    
    <tbody>
     <c:forEach items="${products}" var="p">
      <tr>
        <td> ${p.product_ID }</td>
        <td>${p.product_Name }</td>
        <td>${p.product_Description }</td>
        <td>${p.product_Price }</td>
        <td><a href="delete/${p.product_ID }" ><i class="fa-solid fa-trash"></i> </a> </td>
	    <td><a href="update/${p.product_ID }" ><i class="fa-light fa-pen-to-square"></i> </a> </td>
        
      </tr>
      
    </tbody>
    </c:forEach>
  </table>
</div>

 </div>
		
		<button type="submit" class="btn btn-primary">Add Product</button>
	</form>
	</div>
</body>
</html>

