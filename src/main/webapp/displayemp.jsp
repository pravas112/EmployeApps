<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://jakarta.apache.org/taglibs/standard/permittedTaglibs" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Details</title>

<style>

body{
    margin:0;
    padding:0;
    font-family:Arial, sans-serif;
    background:linear-gradient(to right, #4facfe, #00f2fe);
}

.container{
    width:70%;
    margin:50px auto;
    background:white;
    padding:30px;
    border-radius:15px;
    box-shadow:0px 0px 15px rgba(0,0,0,0.3);
}

h2{
    text-align:center;
    color:#333;
    margin-bottom:25px;
}

.welcome{
    text-align:center;
    font-size:20px;
    color:#444;
    margin-bottom:20px;
}

table{
    width:100%;
    border-collapse:collapse;
    overflow:hidden;
    border-radius:10px;
}

th{
    background:#007BFF;
    color:white;
    padding:15px;
    font-size:18px;
}

td{
    padding:14px;
    text-align:center;
    font-size:16px;
    border-bottom:1px solid #ddd;
}

tr:nth-child(even){
    background:#f2f2f2;
}

tr:hover{
    background:#d6ecff;
    transition:0.3s;
}

</style>

</head>

<body>

<div class="container">

<h2>Employee Details</h2>

<div class="welcome">
    Welcome <b>${name}</b> 🎉
</div>

<table>

<tr>
    <th>ID</th>
    <th>Name</th>
    <th>Email</th>
    <th>Password</th>
    <th>Gender</th>
    <th>City</th>
</tr>

<tr>
    <td>${employee.id}</td>
    <td>${employee.name}</td>
    <td>${employee.email}</td>
    <td>${employee.password}</td>
    <td>${employee.gender}</td>
    <td>${employee.city}</td>
</tr>

</table>

</div>

</body>
</html>