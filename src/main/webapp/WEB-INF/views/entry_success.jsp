<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Success</title>
<style type="text/css">
    span {
        display: inline-block;
        width: 200px;
        text-align: left;
    }
</style>
</head>
<body>
    <div align="center">    <!-- stockDate, warehouseId, productId, deliveryFromProduction,rejection, startUpLose-->>
        <h2>Entry Succeeded!</h2>
        <span>customer Id :</span><span>${entry.customerId}</span><br/>
        <span>item Id:</span><span>${entry.itemId}</span><br/>
        <span>quantity :</span><span>${entry.quantity}</span><br/>
        <span>order Date :</span><span>${entry.orderDate}</span><br/>
        <span>expected Date:</span><span>${entry.expectedDate}</span><br/>
       
        
    </div>
</body>
</html>