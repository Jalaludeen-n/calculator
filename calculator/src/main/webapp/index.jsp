<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<form action="calculator" method="get" >


    Enter First Number
    <input type="text" name="numberOne" ><br>
    Enter Second Number
    <input type="text" name="numberTwo" ><br>

    Select an Operation
    <br>
    <br>

    <input type="radio" name="opr" value="+">Addition
    <input type="radio" name="opr" value="*">Multiply
    <input type="radio" name="opr" value="/">Divide
    <input type="radio" name="opr" value="-"> Subtraction
    <br> <input type="reset">


    <input type="submit" value="Calculate" >



</form>
</body>
</html>