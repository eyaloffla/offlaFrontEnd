<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Person in data base</title>
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
              <li class="active"><a href="person">Person on Data Base</a></li>
              <li><a href="email">Email Validator</a></li>
              
           </ul>
           </div>
           </div>
           </nav>   
<!-- Static navbar -->



<br><br>

       The person is in database : ${personisindb}
    
</div>
   <script src="${domainResources}/js/bootstrap.min.js" ></script>
</body>
</html>