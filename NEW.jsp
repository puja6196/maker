<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<style>
table, th, td {
    border: 1px solid black;
    border-collapse: collapse;
}
th, td {
    padding: 5px;
    text-align: left;    
}
</style>
</head>
<body>
<form action="CS">
<table style="width:100%">

<tr><th>User Code:</th><td><input type="text" name="usercode" pattern=".{4,}" title="invalid entry" required></td></tr><br>
<tr><th>User Name:</th><td><input type="text" name="username" pattern="[a-zA-Z0-9]+" title="invalid entry"required></tr><br>
<tr><th>User Address1:</th><td><input type="textarea" rows="2" cols="120 ">
 </textarea></td></tr><br>
<tr><th>User Address2:</th><td><input type="textarea" rows="2" cols="120">
 </textarea></td></tr><br>
 <tr><th>User PinCode:</th><td><input type="text" name="userpincode"></td></tr><br>
 <tr><th>User EmailAddress:</th><td><input type="text" name="useremailadd"></td></tr><br>
<tr><th> User Contact No:</th><td><input type="text" name="usercontactno"></td></tr><br>
<tr><th>Primary Contact Person:</th><td><input type="text" name="usercontactno"></td></tr><br>
<tr><th>Record Status:<br>
<th> <input type="radio" name="status" value="New"> New<br>
 <input type="radio" name="status" value="Modified">Modified <br>
 <input type="radio" name="status" value="Deleted">Deleted <br>
 <input type="radio" name="status" value="Authorized">Authorized <br>
 <input type="radio" name="status" value="Rejected"> Rejected</th><br>
 <tr><th>Flag:<br>
 <th><input type="radio" name="flag" value="active"> Active<br>
 <input type="radio" name="flag" value="inactive">Inactive </th><br>
 
 </table>
 <input type="submit" name="Submit Details"value="Submit Details">
 
</form>
</body>
</html>



