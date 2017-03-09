<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="js/jquery-3.1.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/signin.css">
<script src="js/signin.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>OTP PAGE</title>
</head>
<body>
<h1>Welcome User</h1>
<p>otp has been sent to your Registered email address</p>
<div class="login-page">
  <div class="form">
<s:form action="otpcheck" method="post">
	<s:textfield type="number" name="otp" placeholder="5 digit number" />
	
	<s:submit />
</s:form>
</div>
	</div>
</body>
</html>