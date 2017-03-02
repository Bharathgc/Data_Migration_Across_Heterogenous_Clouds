<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome User</h1>
<p>otp has been sent to your Registered email address</p>
<s:action name="otp">
<s:textfield name="recvotp.otpnum" placeholder="5 digit number" />
<s:submit />
</s:action>
</body>
</html>