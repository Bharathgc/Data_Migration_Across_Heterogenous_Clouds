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
<s:form action="otpcheck" method="post">
<s:textfield type="number" name="recvotpobj.otpnum" placeholder="5 digit number" />
<s:submit />
</s:form>
</body>
</html>