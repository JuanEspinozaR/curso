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
        <title>JSP Page - Curso Tecnológico</title>
    </head>
    <body>
        <table border="1" cellpadding="0" cellspacing="0" class="form">
            <tr> 
                <td align="center">Clave:</td>
                <td align="center">Nombre</td>
            </tr> 
                <%
                    PreparedStatement preparedStatement = null;
                    ResultSet rs = null;
                    Connection connection = null;
                    try {

                        connection = DBUtil.getConnection();

                        preparedStatement = connection.prepareStatement("Select * from unidad");
                        rs = null;
                            // Parameters start with 1


                        rs = preparedStatement.executeQuery();
                        if (rs != null) {
                            while (rs.next()) {
                %>
            <tr>
                <td align="center"><%= rs.getString("uni_bus_uni")%></td>
                <td align="center"><%= rs.getString("uni_nombre")%></td>     
            </tr>          
            <%
                }
            } else {
            %>
            <tr> 
            <td colspan="2" align="center">No existen unidades</td>
            <%
                        }

                    } catch (SQLException e) {
                        System.out.println("Excpetion >>>>>>>>>>>> " + e.getMessage());

                        //request.setAttribute("ErrorMessage",);            
                    } finally {
                        if (preparedStatement != null) {
                            preparedStatement.close();
                        }
                        if (rs != null) {
                            rs.close();
                        }
                        if (connection != null) {
                            connection.close();
                        }
                    }

            %>
            </tr> 
    </body>
</html>
