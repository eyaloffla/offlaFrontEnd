<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>validate email</title>
<link rel="stylesheet" href="${domainResources}/css/bootstrap.min.css">
<!-- Optional theme -->
<link rel="stylesheet" href="${domainResources}/css/bootstrap-theme.min.css">

</head>
<body>
 
<div class="container">

<!-- Static navbar -->
      <nav class="navbar navbar-default">
        <div class="container-fluid">
          <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
              <span class="sr-only">Toggle navigation</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand">Offla</a>
          </div>
          <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
              <li ><a href="person">Person on Data Base</a></li>
              <li class="active"><a href="email">Email Validator</a></li>
              
           </ul>
           </div>
           </div>
           </nav>   
<!-- Static navbar -->


 <table>
 <tr>
 <td width="120%">
 
    
    <br><br>
    <form:form action="${domain}/email" commandName="email" method="post">
    	<div class="form-group">
    	<label for="email">Validate email: </label>
    	<form:input path="email" class="form-control"/>
    	</div>
    	
    	
        <br><br>
        <input type="submit" value="Submit" class="btn btn-primary" /> 
        <input type="reset" value="Reset" class="btn btn-default" />
     
    </form:form>
    
    </td>
 </tr>
 </table>
   	
   </div>
   <script src="${domainResources}/js/bootstrap.min.js" ></script>
</body>
</html>