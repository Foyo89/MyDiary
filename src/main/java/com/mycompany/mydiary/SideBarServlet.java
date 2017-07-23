/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mydiary;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Grzegorz
 */
@WebServlet(name = "SideBarServlet", urlPatterns = {"/MyDiary/SideBarServlet"})
public class SideBarServlet extends HttpServlet {
    
    private static String url = "jdbc:mysql://localhost/diary?serverTimezone=CET&useSSL=false";
    private static String userName = "root";
    private static String password = "root";

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
//        SessionFactory instance = ConfigHibernate.getInstance();
//        Session session = instance.openSession();
        
//        Query query = session.createQuery("SELECT DISTINCT MONTH(adddate), YEAR(adddate) from Post Where YEAR(adddate)='2016' or YEAR(adddate)='2017'");
//        List<Date> list = query.list();
//        Date temp = new Date();
//        //temp.getTime();
       
        //List<Post> list = query.list();
        
//        for (Month element : list){
//            System.out.println(element.getDisplayName(TextStyle.FULL, Locale.getDefault()));
//        }
        
//        List<Date> dateList = new ArrayList<>();
//        for (Post element : list){
//            dateList.add(element.getCreateDate());
//        }
//        dateList.stream().
//                .distinct().

//            List<String> test = new ArrayList<>();
//            try{
//                DBConnectionManager dbConnectionManager = new DBConnectionManager(url, userName, password);
//                Connection connection = dbConnectionManager.getConnection();
//                PreparedStatement preparedStatement = null;
//                String sql = "SELECT DISTINCT MONTH(adddate) as month, YEAR(adddate) as year from posts Order BY adddate";
//                preparedStatement = connection.prepareStatement(sql);
//
//                ResultSet resultSet = preparedStatement.executeQuery();
//                
//                while (resultSet.next()){
//                    test.add(resultSet.getString("year")+ "-"+resultSet.getString("month"));
//                }
//            }catch (ClassNotFoundException ex) {
//              
//            } catch (SQLException ex) {
//                
//            }
//            
//        
//          
//        request.setAttribute("archive", test);
//        
//        
//        request.getRequestDispatcher("/index.jsp").forward(request, response);
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
        processRequest(request, response);
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
