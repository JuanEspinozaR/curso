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
        <a href="index.jsp" >Regresar a Página de Inicio</a>
        <table border="1" cellpadding="0" cellspacing="0" class="form">
            <tr> 
                <td align="center">Clave</td>
                <td align="center">Nombre</td>
                <%
                    PreparedStatement preparedStatement = null;
                    ResultSet rs = null;
                    Connection connection = null;
                    try {
                        System.out.println("Define Conexion >>>>>>>>>>>>");

                        connection = DBUtil.getConnection();
                        System.out.println("obtiene Conexion >>>>>>>>>>>>");

                        System.out.println("Prepare Statement >>>>>>>>>>>>");

                        preparedStatement = connection.prepareStatement("Select * from unidad");
                        rs = null;
                            // Parameters start with 1
                        //preparedStatement.setString(1, user.getFirstName());
                        System.out.println("Antes de Execute >>>>>>>>>>>>");

                        rs = preparedStatement.executeQuery();
                        if (rs != null) {
                            System.out.println("Result set <> null >>>>>>>>>>>>");
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
            <td colspan="2" align="center">No existen unidades</td>
            <%
                        }

                    } catch (SQLException e) {
                        System.out.println("Excpetion >>>>>>>>>>>> " + e.getMessage());

                        //request.setAttribute("ErrorMessage",);            
                    } finally {
                        if (preparedStatement != null) {
                            preparedStatement.close();
                            preparedStatement = null;
                        }
                        if (rs != null) {
                            rs.close();
                            rs=null;
                        }
                        if (connection != null) {
                            connection.close();
                            connection = null;
                        }
                    }

            %>
        </table>    
        <a href="index.jsp" >Regresar a Página de Inicio</a>

    </body>
</html>
