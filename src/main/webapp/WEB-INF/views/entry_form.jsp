<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>order entry Form</title>
<style type="text/css">
    label {
        display: inline-block;
        width: 200px;
        margin: 5px;
        text-align: left;
    }
    input[type=text], input[type=password], select {
        width: 200px;  
    }
    input[type=radio] {
        display: inline-block;
        margin-left: 45px;
    }
    input[type=checkbox] {
        display: inline-block;
        margin-right: 190px;
    }  
     
    button {
        padding: 10px;
        margin: 10px;
    }
</style>
</head>
<body>
    <div align="center">
        <h2>Stock Entry</h2>
        <form:form action="AddOrder" method="post" modelAttribute="entry">
            <form:label path="customerId">customer Id :</form:label>
            <form:input path="customerId"/><br/>
             
            <form:label path="itemId">item Id:</form:label>
            <form:input path="itemId"/><br/>
             
            <form:label path="quantity">quantity :</form:label>
            <form:input path="quantity"/><br/>      
 
            <form:label path="orderDate">orderDate :</form:label>
            <form:input path="orderDate"/><br/>
                     
            <form:label path="expectedDate">expected Date</form:label>
            <form:input path="expectedDate"/><br/>
            
                 
            <form:button>Submit</form:button>
        </form:form>
    </div>
</body>
</html>