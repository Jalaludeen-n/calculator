<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Calculator</title>
    <link href="/calculator.css" rel="stylesheet" type="text/css">
    <script src="http://code.jquery.com/jquery-1.11.0.min.js"></script>


</head>
<body>
<form method="post" name="Calculator" class="calculator">
    <table border="2" align="center" cellpadding="15" cellspacing="12" bgcolor="#c0c0c0">
        <tr>
            <td>
                <input type="text" name="Input" Size="35" id="display" value=${result}>
                <br>
            </td>
        </tr>
        <tr>
            <td>
                <input type="button" name="one" style="font-size:30px" value=" 1 "
                       OnCLick="Calculator.Input.value += '1'">
                <input type="button" name="two" style="font-size:30px" value=" 2 "
                       OnCLick="Calculator.Input.value += '2'">
                <input type="button" name="three" style="font-size:30px" value=" 3 "
                       OnClick="Calculator.Input.value += '3'">
                <input type="button" name="add" class="btnTop" style="font-size:30px" value=" + "
                       OnClick="Calculator.Input.value += ' + '">
                <br>
                <input type="button" name="four" style="font-size:30px" value=" 4 "
                       OnClick="Calculator.Input.value += '4'">
                <input type="button" name="five" style="font-size:30px" value=" 5 "
                       OnCLick="Calculator.Input.value += '5'">
                <input type="button" name="six" style="font-size:30px" value=" 6 "
                       OnClick="Calculator.Input.value += '6'">
                <input type="button" name="minus" style="font-size:30px" value=" - "
                       OnClick="Calculator.Input.value += ' - '">
                <br>
                <input type="button" name="seven" style="font-size:30px" value=" 7 "
                       OnClick="Calculator.Input.value += '7'">
                <input type="button" name="eight" style="font-size:30px" value=" 8 "
                       OnCLick="Calculator.Input.value += '8'">
                <input type="button" name="nine" style="font-size:30px" value=" 9 "
                       OnClick="Calculator.Input.value += '9'">
                <input type="button" name="mul" style="font-size:30px" value=" * "
                       OnClick="Calculator.Input.value += ' * '">
                <br>
                <input type="button" name="clear" style="font-size:30px" value=" c "
                       OnClick="Calculator.Input.value = ''">
                <input type="button" name="zero" style="font-size:30px" value=" 0 "
                       OnClick="Calculator.Input.value += '0'">
                <input type="button" name="submit" style="font-size:30px" value=" = "
                       OnClick="showResult(Calculator.Input.value)">
                <%--                type="submit" value="Calculate"--%>
                <input type="button" name="div" style="font-size:30px" value=" / "
                       OnClick="Calculator.Input.value += ' / '">
                <br>
            </td>

        </tr>
    </table>
</form>

</body>

</html>