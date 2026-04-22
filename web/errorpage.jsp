<%
	String errorMessage;
	errorMessage = (String)request.getAttribute("ErrorMessage");
%>

<html>

<head>
	<title>Key Dev Error</title>
	<style type=text/css>
		.titulo {font-family: Verdana; font-size: 14pt; color: navy; text-decoration: none}
		.default {font-family: Verdana, Arial, Helvetica, sans-serif; font-size: 10pt; color: #000000}
	</style>
</head>

<body>
<form name="form" action="">
<table border="0" align="center" width="100%" height="80%">
	<tr>
		<td align="center" valign="middle">
			<table border="2" align="center" bordercolor="navy">
			<tr>
			<td>
			<table border="0" align="center" bgcolor="#D8D8D8" cellpadding="0" cellspacing="0">
				<tr>
					<td align="center">
						<font class="titulo"><b> Error</b></font>
					</td>
				</tr>
				<tr><td>&nbsp;</td></tr>
				<tr>
					<td align="center">
						<font class="default"><% if (errorMessage != null) { %><%= errorMessage %><% } %></font>
					</td>
				</tr>
				<tr><td>&nbsp;</td></tr>
				<tr>
					<td align="center"><input type="button" value="Regresar" onClick="history.back()"></td>
				</tr>
			</table>
			</td>
			</tr>
			</table>
		</td>
	</tr>
</table>
</form>
</body>
</html>