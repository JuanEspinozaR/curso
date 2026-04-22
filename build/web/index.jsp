<%@ page language="java" import="curso.tec.dbutil.DBUtil" errorPage="errorpage.jsp" %>
<%@ page language="java" import="java.sql.Connection" errorPage="errorpage.jsp" %>
<%@ page language="java" import="java.sql.PreparedStatement" errorPage="errorpage.jsp" %>
<%@ page language="java" import="java.sql.ResultSet" errorPage="errorpage.jsp" %>
<%@ page language="java" import="java.sql.SQLException" errorPage="errorpage.jsp" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page - Curso Tecnológico de la Laguna</title>
    </head>
    <body>
    <center>
        <P>Creación de Tareas para manejo de Tablas en Base de Datos</P>
        <BR><a href="actualizador.jsp">Actualiza Registros</a></BR>
        <BR><a href="buscar.jsp">Buscar Registros</a></BR>
        <BR><a href="buscar.jsp">Eliminar Registros</a></BR>
        <BR><a href="buscar.jsp">Modificar Registros</a></BR>    
    </center>
    </body>
</html>
