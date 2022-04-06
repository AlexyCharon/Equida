<%-- 
    Document   : listerChevauxParVente
    Created on : 22 sept. 2021, 10:23:02
    Author     : HP-OMEN
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.Lot"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="StyleSheet" href="./../css/style.css" type="text/css" />
    </head>
    <body>
        <%@ include file="../component/Menu.jsp" %>
        <h1>LISTE DES CHEVAUX</h1>
         <%
        ArrayList<Lot> lesLots = (ArrayList)request.getAttribute("pLesLots");
        %>
        <table  class="table table-bordered table-striped table-condensed">  
            <thead>
                <tr>
                    <th>nom</th>
                    <th>date de naissance</th>
                    <th>sexe</th> 
                    <th>type</th>
                    <th>Sire</th>
                    <th>prix</th>
                    <th>pere</th>
                    <th>mere</th>
            <br>
            <br>
                </tr>
            </thead>
            <tbody>
                    <%
                    for(int i = 0; i < lesLots.size();i++)
                    {
                        out.println("<tr>");
                        
                        Lot unLot = lesLots.get(i);

                        out.println("<td>");
                        out.println(unLot.getLeCheval().getNom());
                        out.println("</td>");

                        out.println("<td>");
                        out.println(unLot.getLeCheval().getDateNaissance());
                        out.println("</td>");

                        out.println("<td>");
                        out.println(unLot.getLeCheval().getSexe());
                        out.println("</td>");
                        
                        out.println("<td>");
                        out.println(unLot.getLeCheval().getLeType().getLibelle());
                        out.println("</td>");
                        
                        out.println("<td>");
                        out.println(unLot.getLeCheval().getSire());
                        out.println("</td>");
                        
                        out.println("<td>");
                        out.println(unLot.getPrixDepart()+"€");
                        out.println("</td>");
                        /*
                        out.println("<td>");
                        out.println(unLot.getLeCheval().getPere().getNom());
                        out.println("</td>");
                        
                        out.println("<td>");
                        out.println(unLot.getLeCheval().getMere().getNom());
                        out.println("</td>");*/
                        
                        out.println("</tr>");
                    }
                    %>
            </tbody>
        </table>
    </body>
</html>
