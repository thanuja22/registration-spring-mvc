<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Forgot password</title>
</head>
<body>
<form id="forgotForm"  action="forgotProcess" method="post">
<table align="center">
 <tr>
                        <td>
                            <label >Email: </label>
                        </td>
                        <td>
                            <input name="email" id="email" />
                        </td>
                    </tr>
                    <tr>
                    <td align="left">
                            <button id="submit" name="submit">Submit</button>
                        </td>
                        </tr>
</table>
</form>
</body>
</html>