<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <title>Form Manager</title>
  </head>
  <body>	
<jsp:include page="header.jsp"></jsp:include>
	
	<main>
		<div class="container">
		<div class="row">
		<div class="col-md-6 offset-md-3 ">
		<div class="my-card mt-6">
		<h1 class="text-center mb-3">Add Values</h1>
		<form action="addcontent" method="post">
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Your Name</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="name">
  </div>
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Content</label>
    <input type="text" class="form-control" id="exampleInputPassword1" name="content">
  </div>
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Date</label>
    <input type="text" class="form-control" id="exampleInputPassword1" name="date">
  </div>
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">What is Your Problem</label>
   <textarea class="form-control" name="problem" height="10px"></textarea>
</div>
  <div class="d-grid gap-2">
    <button type="submit" class="btn btn-primary btn-block">Submit</button>
   <button type="reset" class="btn btn-warning btn-block">Reset</button>
  </div>
</form>
		</div>
		</div>
		</div>
		</div>
	</main>

    <!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

  </body>
</html>
