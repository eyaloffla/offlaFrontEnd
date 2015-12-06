<html xmlns:th="http://www.thymeleaf.org">
<head>
<title>hi</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">

</head>
<body>${message}
 
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://bootswatch.com/cerulean/bootstrap.min.css">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
    
    <div class="container">
    
    <br><br>
    <form role="form" action="#" th:action="@{/welcome}" th:object="${personData}" method="post">
    	<div class="form-group">
    	<label for="id">ID: </label>
    	<input type="text" th:field="*{id}" class="form-control" id="id"/>
    	</div>
    	
    	<div class="form-group">
        <label for="birthDay">Date of birth: </label> DD/MM/YYYY
        <input type="text" th:field="*{birthDay}" class="form-control" id="birthDay"/>
        <br> <br>
        <h3>OR</h3>
        <br> <br>
        <div class="form-group">
        <label for="finalNumber">Final Number: </label>
        <input type="text" th:field="*{finalNumber}" class="form-control" id="finalNumber"/>
        </div>
        <br><br>
        <input type="submit" value="Submit" class="btn btn-primary" /> 
        <input type="reset" value="Reset" class="btn btn-default" /></p>
     </div>
    </form>
    </div>
   	
</body>
</html>