<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>registration form</title>
<s:head/>
</head>
<body bgcolor="blue">
<h2>registation form</h2>
   <s:form action = "registerAction">
   
     <s:textfield key="global.firstName" name="firstName" />
     <s:textfield name="lastName" label = "Last Name"/>
     <s:radio name = "gender" list="{'Male','Female'}" label = "Gender" />
     <s:textfield name = "age" label = "Age" />
     <s:textfield name = "email" label = "Email" />
     <s:submit value = "Register" />
     <!--  <s:property value="#user.firstName"/> -->
     <!--  if user is an object  -->
     
   </s:form>
   
   <s:url action="changeLocaleAction" var="urlEn">
      <s:param name="request_locale">en</s:param>
   </s:url>
   <a href="${urlEn}">English</a>
   
   <s:url action="changeLocaleAction" var="urlFr">
       <s:param name="request_locale">fr</s:param>
   </s:url>
   <a href="${ urlFr }">French</a>

   <s:url action="changeLocaleAction" var="urlDe">
       <s:param name="request_locale">de</s:param>
   </s:url>
   <a href="${ urlDe }">German</a>

</body>
</html>