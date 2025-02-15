
<%@page import="com.sathya.servlet.ProductDao1"
	import="java.util.Base64 "%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Form</title>
<!--  BootStrap CDN Link to Get the Support of BootStrap -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"></link>
</head>
<body>
	<div class="container mt-5 text-center">
		<h2 class="text-center font-italic mb-1">Save product data...</h2>
		<form method="post" action="./UpdateProductServlet"
			enctype="multipart/form-data" onsubmit="return validateForm()">
			<div class="form-group">
				<label class="font-italic text-center font-weight-bold" for="proid">product
					Id:</label> <input type="text" class="form-control-sm" id="proid"
					name="proid" value="${existingobject.pid}" required />
			</div>
			<div class="form-group">
				<label class="font-italic text-center font-weight-bold"
					for="proname">product Name::</label> <input type="text"
					class="form-control-sm" id="proname" name="proname"
					value="${existingobject.proname}" required />
			</div>
			<div class="form-group">
				<label class="font-italic text-center font-weight-bold"
					for="proprice">product Price:</label> <input type="number"
					class="form-control-sm" id="proprice" name="proprice"
					value="${existingobject.proprice}" required />
			</div>
			<div class="form-group">
				<label class="font-italic text-center font-weight-bold"
					for="probrand">product Brand:</label> <input type="text"
					class="form-control-sm" id="probrand" name="probrand"
					value="${existingobject.probrand}" required />
			</div>
			<div class="form-group">
				<label class="font-italic text-center font-weight-bold"
					for="probrand">product MadeIn:</label> <input type="text"
					class="form-control-sm" id="madein" name="madein"
					value="${existingobject.promadein}" required />
			</div>
			<div class="form-group">
				<label class="font-italic text-center font-weight-bold"
					for="manufactutedate">product ManufacturedDate:</label> <input
					type="date" class="form-control-sm" id="manufactureddate"
					name="manufactureddate" value="${existingobject.promnfdate}"
					required />
			</div>
			<div class="form-group">
				- <label class="font-italic text-center font-weight-bold"
					for="expirydate">product ExpiryDate:</label> <input type="date"
					class="form-control-sm" id="expirydate" name="expirydate"
					value="${existingobject.proexpdate}" required />
			</div>
			<div class="form-group">
				<label class="font-italic text-center font-weight-bold"
					for="currentimage">current Image:</label> 
			<img src="data:image/jpeg;base64,${Base64.getEncoder().encodeToString(existingobject.proImage)}"
					alt="current  product  image"
					style="max-width: 100px; max-height: 100px;"/> 
			<input type="hidden" id="existingimage" name="existingimage"
					value="${Base64.getEncoder().encodeToString(existingobject.proImage)}" />
			</div>
			<div class="form-group">
				<label class="font-italic text-center font-weight-bold"
					for="newimage">New Image:</label> 
					<input type="file" id="newimage" name="newimage" value="newimage">
			</div>
	
	
			<div class="form-group">
				<label class="font-italic font-weight-bold" for="proAudio">Current
					Product Audio: </label>
				<audio controls><source src="data:audio/mpeg;base64,${Base64.getEncoder().encodeToString(existingobject.proaudio)}"></audio>
				<input type="hidden" id="existingaudio" name="existingaudio" value="${Base64.getEncoder().encodeToString(existingobject.proaudio)}"/>
			</div>
			
			<div class="form-group">
				<label class="font-italic font-weight-bold" for="proVideo">Current
					Product Video: </label>
				<video width="160" height="120" controls>
					<source src="data:video/mp4;base64,${Base64.getEncoder().encodeToString(existingobject.provideo)}">
				</video>
				<input type="hidden" id="existingvideo" name="existingvideo" value="${Base64.getEncoder().encodeToString(existingobject.provideo)}"/>
			</div>

			<div>
				<input type="submit" class="btn btn-success" value="update" />
			</div>
		</form>
	</div>
</body>
</html>