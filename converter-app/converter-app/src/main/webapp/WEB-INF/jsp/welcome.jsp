<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html lang="en">

<head>
    <title>Currency Converter</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
 
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
 
    <!-- Custom CSS -->
    <link href="styling.css" rel="stylesheet">
 
    <!-- Javascript -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

	<style>

		html {
		  font-size: 20px;
		}
		
		.panel {
		  background: #333333;
		  border: solid white;
		}
		
		.results {
		  font-size: 1em;
		  color: #FFFFFF;
		}
		
		.dropdown {
		  margin-bottom: 50px;
		}
		
		.inline-block {
		  display: inline-block;
		}
		
		.center {
		  width: 90%;
		  margin: 0 auto 30px;
		}

	</style>

</head>

<body>
    <!-- Navigation Bar -->
    <nav class="menu navbar-default navbar-menu">
        <div class="container">
            <div class="menu-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand">Currency Converter Website</a>
            </div>
        </div>
    </nav>
    <!-- End of navbar-->

	<br>
	<br>
	<br>

	<div class="container">
	  <div class="row">
	    <div class="col-md-6 col-md-offset-3">
	      <div class="panel panel-primary text-center">
	        <div class="panel-heading">
	          <h4 class="panel-title">Currency Converter</h4>
	        </div>
	        <div class="error">
	          Please enter numeric value
	        </div>
	        <div class="panel-body">
	  
	          <form:form class="form-vertical" method="POST" action="/converter-app/convert" modelAttribute="convertion">
	
	            <div class="form-group center">
	              <label for="">Enter Value:</label>
	              <form:input type="number" class="amount form-control" placeholder="Enter value" min="1" path="quantity"/>
	            </div>
	
	
	            <div class="form-group inline-block">
	              <label for="">From currency:</label>
	              <form:select class="currency-list form-control" path="to">
	                <option>--Select--</option>
	                <option value="D">Dollar</option>
	                <option value="E">Euro</option>
	                <option value="P">Peso</option>
	              </form:select>
	            </div>
	
	            <div class="form-group inline-block">
	              <label>To currency:</label>
	              <form:select class="currency-list form-control" path="from">
	                <option>--Select--</option>
	                <option value="D">Dollar</option>
	                <option value="E">Euro</option>
	                <option value="P">Peso</option>
	              </form:select>
	            </div>
	          	<button type="submit" class="btn btn-success">Send</button>
	       		<p class="results">${convertion.result}</p>
	          </form:form>
	        </div>
	      </div>
	    </div>
	  </div>
	  
	  <br>
	  <div class="row">
	    <div class="col-md-6 col-md-offset-3">
	      <div class="panel panel-primary text-center">
	  	  		<label class="panel-title">Dollar:<span>${dollar}</span></label>
	  	  		<label class="panel-title">Euro:<span>${euro}</span></label>
	  	  </div>
	  	</div>
	  </div>
	</div>

	<script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.0/jquery.min.js'></script>
	<script src='https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/js/bootstrap.min.js'></script>

 	<!-- Footer -->
 	<footer class="footer">
        <div class="container">
            <p class="text-center">© </p>
        </div>
    </footer>
    <!-- End of Footer -->
</body>

</html>