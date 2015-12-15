<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>hi</title>
<link rel="stylesheet" href="${domainResources}/css/bootstrap.min.css">
<!-- Optional theme -->
<link rel="stylesheet" href="${domainResources}/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script src="${domainResources}/js/bootstrap.min.js" ></script>

</head>
<body>${message}
 
<div class="container">

 <table>
 <tr>
 <td width="120%">
 
    
    <br><br>
    <form:form action="${domain}/welcome" commandName="personData" method="post">
    	<div class="form-group">
    	<label for="id">ID: </label>
    	<form:input path="id" class="form-control"/>
    	</div>
    	
    	<div class="form-group">
        <label for="birthDay">Date of birth: </label> DDMMYYYY
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
        <input type="reset" value="Reset" class="btn btn-default" />
     
    </form:form>
    
    </td>
 </tr>
 </table>
   	
   </div>
</body>
</html>