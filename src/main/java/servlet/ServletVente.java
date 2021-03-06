/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import Database.CategVenteDAO;
import Database.CourrielDAO;
import Database.LieuDAO;
import Database.LotDAO;
import Database.VenteDAO;
import Database.VenteTypeChevalDAO;
import forms.FormAjoutVente;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.ArrayList;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.CategVente;
import model.Courriel;
import model.Lieu;
import model.Lot;
import model.Vente;
import model.VenteTypeCheval;

/**
 *
 * @author Zakina
 */
public class ServletVente extends HttpServlet {
    
    Connection connection ;
    
    @Override
    public void init()
    {     
        ServletContext servletContext=getServletContext();
        connection=(Connection)servletContext.getAttribute("connection");
    }
        
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletVente</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletVente at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String url = request.getRequestURI();
        // R??cup et affichage par date d??croissante de toutes les ventes    
        if(url.equals("/equida/ServletVente/listerLesVentes"))
        {  
            ArrayList<Vente> lesVentes = VenteDAO.getLesVentes(connection);
            request.setAttribute("pLesVentes", lesVentes);
            getServletContext().getRequestDispatcher("/vues/vente/listerLesVentes.jsp").forward(request, response);
      
        }
        
         if(url.equals("/equida/ServletVente/ajouterVente"))
        {
            
            ArrayList<CategVente> lesCategVentes = CategVenteDAO.getLesCategVentes(connection);
            request.setAttribute("pLesCategVentes", lesCategVentes);
            
            ArrayList<Lieu> lesLieux = LieuDAO.getLesLieux(connection);
            request.setAttribute("pLesLieux", lesLieux);
            
            /*
            ArrayList<Lot> lesLots = LotDAO.getLesLotsParVente(connection);
            request.setAttribute("pLesLots", lesLots);*/
            
            this.getServletContext().getRequestDispatcher("/vues/vente/ajouterVente.jsp" ).forward( request, response );
            
            }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            /* Pr??paration de l'objet formulaire */
        FormAjoutVente form = new FormAjoutVente();
		
        /* Appel au traitement et ?? la validation de la requ??te, et r??cup??ration du bean en r??sultant */
        Vente uneVente = form.ajouterVente(request);
        
        /* Stockage du formulaire et de l'objet dans l'objet request */
        request.setAttribute( "form", form );
        request.setAttribute( "pVente", uneVente );
		
        if (form.getErreurs().isEmpty()){
            // Il n'y a pas eu d'erreurs de saisie, donc on renvoie la vue affichant les infos du client 
            Vente venteInsere =  VenteDAO.ajouterVente(connection, uneVente);
            if (venteInsere != null ){
                this.getServletContext().getRequestDispatcher("/vues/vente/consulterVente.jsp" ).forward( request, response );
            }
            else 
            {
                // Cas o??l'insertion en bdd a ??chou??
                //renvoyer vers une page d'erreur 
            }
        }
        else
        { 
		// il y a des erreurs. On r??affiche le formulaire avec des messages d'erreurs
            ArrayList<Lieu> lesLieux = LieuDAO.getLesLieux(connection);
            request.setAttribute("pLesLieux", lesLieux);
            
            ArrayList<CategVente> lesCategVentes = CategVenteDAO.getLesCategVentes(connection);
            request.setAttribute("pLesCategVentes", lesCategVentes);
            
            /*ArrayList<Lot> lesLots = LotDAO.getLesLotsParVente(connection);
            request.setAttribute("pLesLots", lesLots);*/
            
           this.getServletContext().getRequestDispatcher("/vues/ajouterVente.jsp" ).forward( request, response );
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
