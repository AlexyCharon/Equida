<%-- 
    Document   : listerLesCourriel
    Created on : 20/09/2021
    Author     : Dylan
--%>

<%@page import="model.Courriel"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Equida</title>
    </head>
    <body>
        <%@ include file="../component/Menu.jsp" %>
       <h1>Liste des courriels par vente</h1>
         <%
        ArrayList<Courriel> lesCourriels = (ArrayList)request.getAttribute("pLesCourriels");
        %>
        <table  class="table table-bordered table-striped table-condensed">  
            <thead>
                <tr>             
                    <th>id</th>
                    <th>objet</th>
                    <th>corps</th>
                    <th>date</th>
            <br>
            <br>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <%
                    for(int i = 0; i < lesCourriels.size();i++)
                    {
                        
                        Courriel unCourriel = lesCourriels.get(i);
                        
                        out.println("<tr><td>");
                        out.println(unCourriel.getId());
                        out.println("</td>");
                        
                        out.println("<td>");
                        out.println(unCourriel.getObjet());
                        out.println("</td>");

                        out.println("<td>");
                        out.println(unCourriel.getCorps());
                        out.println("</td>");

                        out.println("<td>");
                        out.println(unCourriel.getDate());
                        out.println("</td>");
                        
                        out.println("<td><a href ='../ServletPieceJointe/listerLesPiecesJointesParCourriel?idCourriel="+ unCourriel.getId()+ "'>");
                        out.println("Lister les pièces jointes");
                        out.println("</td>");
                               
                    }
                    %>
                </tr>
            </tbody>
        </table>
    </body>
</html>

