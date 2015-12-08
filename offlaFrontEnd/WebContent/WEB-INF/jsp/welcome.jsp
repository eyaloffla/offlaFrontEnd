<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>hi</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" ></script>

</head>
<body>${message}
 
<div class="container">
    
    <br><br>
    <form:form action="${localDomain}/welcome" commandName="personData" method="post">
    	<div class="form-group">
    	<label for="id">ID: </label>
    	<form:input path="id" class="form-control"/>
    	</div>
    	
    	<div class="form-group">
        <label for="birthDay">Date of birth: </label> DD/MM/YYYY
        <form:input path="birthDay" class="form-control" id="birthDay"/>
        <br> <br>
        <h3>OR</h3>
        <br> <br>
        <div class="form-group">
        <label for="finalNumber">Final Number: </label>
        <form:input path="finalNumber" class="form-control" id="finalNumber"/>
        </div>
        <br><br>
        <input type="submit" value="Submit" class="btn btn-primary" /> 
        <input type="reset" value="Reset" class="btn btn-default" /></p>
     </div>
    </form:form>
    </div>
   	
</body>
</html>