<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
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
<title>SIGN UP PAGE</title>
</head>
<body>
<div class="login-page">
  <div class="form">
    <s:form  action="adduser" method="post"> 
      <s:textfield type="text" name="user.uname"  placeholder="username"/>
      <s:password type="password" name="user.pwd"  placeholder="password"/>
      <s:textfield type="text" name="user.eid"  placeholder="Ex:abc@gmail.com"/>
      <s:submit name="CREATE" />
    </s:form>
     <p class="message">Already registered? <a href="signin.jsp">Sign In</a></p>
  </div>
</div>
</body>
</html>