/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author saurabhthesuperhero
 */
public class loveman extends HttpServlet {

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
            out.println("<title>Servlet loveman</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println(" <nav style=\"background-color: black;color:white;height: 40px;padding-left:10px;  \">\n" +
"            <a href=\"#\" style=\"color:white;font-size: 30px;text-decoration: none;padding-left: 30px;\">Home</a>\n" +
"            <a href=\"#\" style=\"color:white;font-size: 30px;text-decoration: none;padding-left: 30px;\">About</a>\n" +
"            <a href=\"#\" style=\"color:white;font-size: 30px;text-decoration: none;padding-left: 30px;\">Contact</a>\n" +
" \n" +
"        </nav>\n" +
"        <header>\n" +
"            <h3 style=\"background-color: slategray;color: white;text-align: center;height: 25px;font-size:18px;padding: auto; \">Awe Calculator</h3>\n" +
"        </header>\n" +
"     ");
            
            //now code for logic bro....
            String n1=request.getParameter("n1");
            String n2=request.getParameter("n2");
            String combine=n1.concat(n2);
            
            int sum=0;
            for(int i=0;i<combine.length();i++)
            {   
                char ch=combine.charAt(i);
                sum=(int) ch+sum;
            }
            int per;
            if(n1.equalsIgnoreCase("prachi") || n2.equalsIgnoreCase("prachi"))
            {   out.println("<h4>Ghost Haunts <br>never love !</h4>");
               out.println("<img src=\"https://gallery.yopriceville.com/var/resizes/Free-Clipart-Pictures/Halloween-PNG-Pictures/Halloween_Ghost_PNG_Clip_Art_Image.png?m=1507172109 height=\"70\">\n");
            }
            else if(n1.equalsIgnoreCase("Saurabh") || n2.equalsIgnoreCase("Saurabh")){
                 per=100;
                   
           out.println(" <div style=\"text-align: center;\">\n" +
"            \n" +
"            <label style=\"font-size: 30px;color:#675555;\">Your name "+n1+"</label>\n" +
"            <br>\n" +
"            <img src=\"http://pngimg.com/uploads/heart/heart_PNG51352.png\" height=\"100\">\n" +
"            <br>\n" +
"            <label style=\"font-size: 30px;color:#423636;\">Your love "+n2+" </label>\n" +
"            <br>\n" +
"            <br>\n" +
"            <br>\n" +
"            <div>\n" +
"                <label style=\"font-size: 30px;color:red;\"> Your Love Match is</label> <br>\n" +
"                <label style=\"font-size: 60px;color: #b10707\">"+per+" %"+"</label>\n" +
"            </div>\n" +
"            \n" +
"        </div>");
                
        }
           else
            {
           per=sum%100;
              
           out.println(" <div style=\"text-align: center;\">\n" +
"            \n" +
"            <label style=\"font-size: 30px;color:#675555;\">Your name "+n1+"</label>\n" +
"            <br>\n" +
"            <img src=\"http://pngimg.com/uploads/heart/heart_PNG51352.png\" height=\"100\">\n" +
"            <br>\n" +
"            <label style=\"font-size: 30px;color:#423636;\">Your love "+n2+" </label>\n" +
"            <br>\n" +
"            <br>\n" +
"            <br>\n" +
"            <div>\n" +
"                <label style=\"font-size: 30px;color:red;\"> Your Love Match is</label> <br>\n" +
"                <label style=\"font-size: 60px;color: #b10707\">"+per+" %"+"</label>\n" +
"            </div>\n" +
"            \n" +
"        </div>");
            }
           
           
           
        
           
           out.println("<footer>            <h3 style=\"background-color: slategray;color: white;text-align: center;height: 25px;font-size:18px;padding: auto; \">Made By saurabh Jadhav</h3>\n" +
"</footer>");
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
