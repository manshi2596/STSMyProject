<%@page import="com.example.webapp.bean.DistrictBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>

<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
	integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
	crossorigin="anonymous"></script>

<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>
	
<script src="https://code.jquery.com/jquery-3.3.1.min.js"
    integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=" crossorigin="anonymous"></script>
<script type="text/javascript">
function getTaluka(){
		var disId = $('#district').val();
		$.ajax({
	          url: '/loadDisByTaluka/' + disId,
	          type: "GET",
	          dataType: "json",
	          beforeSend: function(x) {
	            if (x && x.overrideMimeType) {
	              x.overrideMimeType("application/j-son;charset=UTF-8");
	            }
	          },
	          success: function(result) {
	        	  var result = JSON.parse(result);
					alert(result);
	 	     //Write your code here
	          }
		});
		document.getElementById("taluka1").innerHTML = '<label class="form-label" for="form3Example3cg" >Taluka</label><form:select path="taluka" class="btn btn-light dropdown-toggle" data-toggle="dropdown" id="taluka" >';
		document.getElementById("taluka1").innerHTML += '<form:options  item = "${taluka}" ></form:options></form:select>';
}
</script>

</head>
<body>

	<!-- Nav Bar -->
	<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
		<a class="navbar-brand" href="#"></a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNavDropdown">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link" href="#">Registration
						Form <span class="sr-only">(current)</span>
				</a></li>
			</ul>

			<%-- <form action="" class="form-inline my-2 my-lg-0">
				<!-- <a class="btn btn-light my-2 my-sm-0 mr-1" type="submit">Login</a> -->
				<a class="btn btn-light my-2 my-sm-0" type="submit">Signup</a>
			</form> --%>
		</div>
	</nav>
	<!-- End Nav Bar -->
	
	<form:form method="POST" action="/userDetails" modelAttribute="userDetails">
	<section class="vh-100 bg-image"
		style="background-image: url('https://mdbcdn.b-cdn.net/img/Photos/new-templates/search-box/img4.webp');">
		<div class="mask d-flex align-items-center h-100 gradient-custom-3">
			<div class="container h-100">
				<div class="row d-flex justify-content-center align-items-center h-100">
					<div class="col-12 col-md-9 col-lg-7 col-xl-6">
						<div class="card" style="border-radius: 15px;">
							<div class="card-body p-5">
								<h2 class="text-uppercase text-center mb-5">Register Your Details</h2>
								<form>
									<div class="form-outline mb-4">
										<input type="text" id="form3Example1cg"	class="form-control form-control-lg" /> 
										<label class="form-label" for="form3Example1cg">Your Name</label>
									</div>

									<div class="form-outline mb-4">
										<input type="email" id="form3Example3cg" class="form-control form-control-lg" /> 
										<label class="form-label" for="form3Example3cg">Your Email</label>
									</div>
									
									<div class="dropdown  mb-4">
										<label class="form-label" for="form3Example3cg">District </label>	
									    	<form:select path = "district" class="btn btn-light dropdown-toggle" data-toggle="dropdown" id="district" onchange="getTaluka()">
									    		<form:option value="-- Select --"></form:option>
   												<form:options  items = "${district}" style="text-align:left;"  />
											</form:select>
									</div>
									
									<div id="taluka1">
									</div>
									<!-- Image -->
									<div style="margin-bottom: 10px;">
										<label class="form-label" for="customFile">Choose Photo</label>
										<input type="file" class="form-control" id="customFile" style="margin-bottom: 5px;"  />
									</div>
									
									<div class="d-flex justify-content-center">
										<button type="submit" 
											class="btn btn-success btn-block btn-lg gradient-custom-4 text-body">Register</button>
									</div>

									<!-- <p class="text-center text-muted mt-5 mb-0">
										Have already an account? <a href="#!"
											class="fw-bold text-body"><u>Login here</u></a>
									</p> -->

								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	</form:form>
</body>
</html>