<%-- 
    Document   : listerLesVentes
    Created on : 18 août 2021, 16:52:29
    Author     : Zakina
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.Vente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Liste des ventes</title>
    </head>
    <body>
                <%@ include file="../component/Menu.jsp" %>
        <h1>LISTE DES VENTES</h1>
         <%
        ArrayList<Vente> lesVentes = (ArrayList)request.getAttribute("pLesVentes");
        %>
        <table  class="table table-bordered table-striped table-condensed">  
            <thead>
                <tr>
                    <th>id</th>
                    <th>nom</th>
                    <th>date début</th>
                    <th>catégorie</th>  
                    <th>lieu</th>
                    <th>nombre de boxes</th>
            <br>
            <br>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <%
                    for(int i = 0; i < lesVentes.size();i++)
                    {
                        
                        Vente uneVente = lesVentes.get(i);
                        out.println("<tr><td>");
                        out.println(uneVente.getId());
                        out.println("</a></td>");

                        out.println("<td>");
                        out.println(uneVente.getNom());
                        out.println("</td>");

                        out.println("<td>");
                        out.println(uneVente.getDateDebutVente());
                        out.println("</td>");

                        out.println("<td>");
                        out.println(uneVente.getCategVente().getLibelle());
                        out.println("</td>");
                        
                        out.println("<td>");
                        out.println(uneVente.getLieuVente().getVille());
                        out.println("</td>");
                        
                        out.println("<td>");
                        out.println(uneVente.getLieuVente().getNbBoxes());
                        out.println("</td>");
                        
                        out.println("<td><a href ='../ServletClient/listerLesClientsParCategVente?codeCat="+ uneVente.getCategVente().getCode()+ "'>");
                        out.println("Lister les clients interessés");
                        out.println("</td>");
                        
                        out.println("<td><a href ='../ServletCourriel/listerLesCourrielsParVente?idVente="+ uneVente.getId()+ "'>");
                        out.println("Lister les mails de la vente");
                        out.println("</td>");
                        
                        out.println("<td><a href ='../ServletLot/listerLesLotsParVente?idVente="+ uneVente.getId()+ "'>");
                        out.println("Lister les Chevaux");
                        out.println("</td>");
                    }
                    %>
                </tr>
            </tbody>
        </table>
    </body>
</html>
