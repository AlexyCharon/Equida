<%-- 
    Document   : listerLesClientsParCategVente
    Created on : 18 août 2021, 17:52:16
    Author     : Zakina
--%>

<%@page import="model.Client"%>
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
       <h1>LISTE DES CLIENTS POUR UNE CATEGORIE DE VENTE</h1>
         <%
        ArrayList<Client> lesClients = (ArrayList)request.getAttribute("pLesClients");
        %>
        <table  class="table table-bordered table-striped table-condensed">  
            <thead>
                <tr>             
                    <th>id</th>
                    <th>nom</th>
                    <th>prenom</th>
                    <th>copos</th>
                    <th>ville</th>
                    <th>rue</th>
                    <th>pays</th>
                    <th>mail</th>
            <br>
            <br>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <%
                    for(int i = 0; i < lesClients.size();i++)
                    {
                        
                        Client unClient = lesClients.get(i);
                        out.println("<tr><td>");
                        out.println(unClient.getId());
                        out.println("</a></td>");

                        out.println("<td>");
                        out.println(unClient.getNom());
                        out.println("</td>");

                        out.println("<td>");
                        out.println(unClient.getPrenom());
                        out.println("</td>");
                        
                        out.println("<td>");
                        out.println(unClient.getCopos());
                        out.println("</td>");
                        
                        out.println("<td>");
                        out.println(unClient.getVille());
                        out.println("</td>");
                        
                        out.println("<td>");
                        out.println(unClient.getRue());
                        out.println("</td>");

                        out.println("<td>");
                        out.println(unClient.getLePays().getNom());
                        out.println("</td>");
                        
                        out.println("<td>");
                        out.println(unClient.getMail());
                        out.println("</td>");
                    }
                    %>
                </tr>
            </tbody>
        </table>
    </body>
</html>
