/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mydiary;

import com.mycompany.mydiary.model.Post;
import com.mycompany.mydiary.model.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author RENT
 */
@WebServlet(name = "NewPostServ", urlPatterns = {"/NewPostServ"})
public class NewPostServ extends HttpServlet {

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
            out.println("<title>Servlet NewPostServ</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet NewPostServ at " + request.getContextPath() + "</h1>");
            //out.println("<p>"+test+"</p>");
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
        processRequest(request, response);
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
        //processRequest(request, response);
        
        User user = new User();
        Post post = new Post();
        
        SessionFactory instance = ConfigHibernate.getInstance();
        Session session = instance.openSession();
        
        Query query = session.createQuery("from User where nick='"+request.getParameter("nick")+"'");
        List<User> list = query.list();
        
        if(!list.isEmpty()){
            user = list.stream().findFirst().get();
        }
        else
        {
            user.setFirstname(request.getParameter("firstname"));
            user.setLastname(request.getParameter("lastname"));
            user.setNick(request.getParameter("nick"));
        }
        
        session.close();
        
        //SessionFactory instance = ConfigHibernate.getInstance();
        Session openSession = instance.openSession();
        Transaction beginTransaction = openSession.beginTransaction();
        
        
        post.setTitle(request.getParameter("title"));
        post.setText(request.getParameter("content"));
        post.setCreateDate(new Date());
        post.setUser(user);
        openSession.save(post);
        beginTransaction.commit();
        request.getRequestDispatcher("/index.jsp").forward(request, response);
        
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
