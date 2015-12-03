<html xmlns:th="http://www.thymeleaf.org">
<head>
<title>hi</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">

</head>
<body>${message}
 
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
    
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
        <input type="submit" value="Submit" class="btn btn-default" /> <input type="reset" value="Reset" class="btn btn-default" /></p>
     </div>
    </form>
    </div>
   	
</body>
</html>