<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Calculator</title>
    <script src="http://code.jquery.com/jquery-1.11.0.min.js"></script>
</head>
<body>
<h1 align="center">Arithmetic calculator</h1>
<%@taglib uri="/struts-tags" prefix="s" %>
<s:form theme="simple">
    <table border="2" align="center" cellpadding="15" cellspacing="12" bgcolor="#c0c0c0">
        <tr>
            <td>
                <input type="text" id="display" name="output"/>
                <br>
            </td>
        </tr>


        <tr>
            <td>
                <s:submit style="font-size:30px" value=" 1 "
                          onclick="output.value += '1'; return false;"/>
                <s:submit style="font-size:30px" value=" 2 "
                          onclick="output.value += '2'; return false;"/>
                <s:submit style="font-size:30px" value=" 3 "
                          onclick="output.value += '3'; return false;"/>
                <s:submit class="btnTop" style="font-size:30px" value=" + "
                          onclick="output.value += '+'; return false;"/>
                <br>
                <s:submit style="font-size:30px" value=" 4 "
                          onclick="output.value += '4'; return false;"/>
                <s:submit style="font-size:30px" value=" 5 "
                          onclick="output.value += '5'; return false;"/>
                <s:submit style="font-size:30px" value=" 6 "
                          onclick="output.value += '6'; return false;"/>
                <s:submit style="font-size:30px" value=" - "
                          onclick="output.value += '-'; return false;"/>
                <br>
                <s:submit style="font-size:30px" value=" 7 "
                          onclick="output.value += '7'; return false;"/>
                <s:submit style="font-size:30px" value=" 8 "
                          onclick="output.value += '8'; return false;"/>
                <s:submit style="font-size:30px" value=" 9 "
                          onclick="output.value += '9'; return false;"/>
                <s:submit style="font-size:30px" value=" * "
                          onclick="output.value += '*'; return false;"/>
                <br>
                <s:submit style="font-size:30px" value=" c "
                          onclick="output.value = ''; return false;"/>
                <s:submit style="font-size:30px" value=" 0 "
                          onclick="output.value += '0'; return false;"/>
                <input type="button" style="font-size:30px" value=" = " onclick="callMyAction(output.value)"
                />
                <s:submit style="font-size:30px" value=" / "
                          onclick="output.value += '/'; return false;"/>
                <br>
            </td>

        </tr>
    </table>
</s:form>
</body>

</html>
<script type="text/javascript">
    function callMyAction(value) {
        $.ajax({
            type: "POST",
            url: "calculate.action",
            data: {input: value},
            success: function (result) {
                $("#display").val(result.output);
            },
            error: function (xhr, status, error) {
                alert(error);
            }
        });
    }
</script>
