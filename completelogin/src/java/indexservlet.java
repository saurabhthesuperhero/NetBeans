/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author saurabhthesuperhero
 */
public class indexservlet extends HttpServlet {

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
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet indexservlet</title>");
            out.println("</head>");
            out.println("<body>");
//            1
//            :db connect;
//            2
//            :get data;
//            3
//            :check and login;
//            4
//            :show info from db;
            out.println(" <nav style=\"background-color: black;color:white;height: 40px;padding-left:10px;  \">\n" +
"            <a href=\"index.html\" style=\"color:white;font-size: 30px;text-decoration: none;padding-left: 30px;\">Home</a>\n" +
"            <a href=\"http://itsaboutyou.rf.gd/about.html\" style=\"color:white;font-size: 30px;text-decoration: none;padding-left: 30px;\">About</a>\n" +
"            <a href=\"http://itsaboutyou.rf.gd/contact.html\" style=\"color:white;font-size: 30px;text-decoration: none;padding-left: 30px;\">Contact</a>\n" +
" \n" +
"        </nav>");
           Class.forName("org.apache.derby.jdbc.ClientDriver");
           String url="jdbc:derby://localhost:1527/fbwala";
           Connection conn=DriverManager.getConnection(url,"username","password");
            
           Statement stmt=conn.createStatement();
           
           ResultSet rset=stmt.executeQuery("select * from accountdata ");
           
          
            boolean validate=false;
           String u1=request.getParameter("n1");
           String u2=request.getParameter("n2");
            
           String finalu1 = null,finalu2,finalu3 = null,finalu4 = null;
           while(rset.next())
            {
                
                String uu1=rset.getString("username");
                String uu2=rset.getString("password");
          
                if(uu1.equals(u1) && u2.equals(uu2))
                {
                
                   validate=true;
                    finalu1=rset.getString("username");
                finalu2=rset.getString("password");
                finalu3=rset.getString("email");
                finalu4=rset.getString("name");
                
                }
                
            
            }
           
           if(validate==true)
           {
           
           
           
           out.println("<br><h3>Login Successful</h3>");
           out.println("<div style='text-align:center;'><br><h3 style='background-color:green;color:white;text-align:center;'>Your Bio Data</h3><br>");
           out.println("<br>Username : "+finalu1);
           out.println("<br>Name: "+finalu4);
           out.println("<br>Email : "+finalu3);
           out.println("</div>");
           }
           else
           {
           out.println("<br><h3>The Username or Password is Incorrect.</h3>");
           
           }
           
           out.println("\n" +
"        <footer>\n" +
"        <h3 style=\"background-color: slategray;color: white;text-align: center;height: 25px;font-size:18px;padding: auto; \">Made By Saurabh 2019</h3>\n" +
"    \n" +
"        </footer>\n" +
" ");
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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(indexservlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(indexservlet.class.getName()).log(Level.SEVERE, null, ex);
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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(indexservlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(indexservlet.class.getName()).log(Level.SEVERE, null, ex);
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
