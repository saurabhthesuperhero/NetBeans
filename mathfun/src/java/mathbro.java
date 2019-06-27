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
public class mathbro extends HttpServlet {

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
            out.println("<title>Servlet mathbro</title>");    
            out.println("   <style>\n" +
"            \n" +
"             {\n" +
"  box-sizing: border-box;\n" +
"}\n" +
"\n" +
"/* Create three equal columns that floats next to each other */\n" +
".column {\n" +
"  float: left;\n" +
"  width: 30.33%;\n" +
"  padding: 10px;\n" +
"  height: 450px; /* Should be removed. Only for demonstration */\n" +
"}\n" +
"\n" +
"/* Clear floats after the columns */\n" +
".row:after {\n" +
"  content: \"\";\n" +
"  display: table;\n" +
"  clear: both;\n" +
""
                    + ""
                    + ""
                    + "} .ok{margin-left:40px;}"
                    + ""
                    + ""
                    + "</style>");
            out.println("</head>");
            out.println("<body>");
            
            //Now coding part bro.
            //here add first code for table part
            //;later..for squares and cube...
            //table....
            
            out.println(" <nav style=\"background-color: black;color:white;height: 40px;padding-left:10px;  \">\n" +
"            <a href=\"#\" style=\"color:white;font-size: 30px;text-decoration: none;padding-left: 30px;\">Home</a>\n" +
"            <a href=\"http://itsaboutyou.rf.gd/about.html\" style=\"color:white;font-size: 30px;text-decoration: none;padding-left: 30px;\">About</a>\n" +
"            <a href=\"http://itsaboutyou.rf.gd/contact.html\" style=\"color:white;font-size: 30px;text-decoration: none;padding-left: 30px;\">Contact</a>\n" +
" \n" +
"        </nav>\n" +
"        <header>\n" +
"            <h3 style=\"background-color: #980000;color: white;text-align: center;height: 25px;font-size:18px;padding: auto; \">Math Is Love</h3>\n" +
"        </header>");
            int x=Integer.parseInt(request.getParameter("n1"));
            
            
            
            
            
            out.println("  <div class=\"ok\">  <div class=\"row\">\n" +
"  <div class=\"column\" style=\"background-color:#aaa;\">\n" +
"    <h2>Table</h2>\n" +
"    <p style='    font-family: sans-serif;\n" +
"    color: #562d2d;'>");
                    for(int i=1;i<=10;i++){
            out.println(x+" x "+i+" = "+(x*i)+"<br><br>");
            }
                    
                //Squares////////and cube....
                
                int square=x*x;
                int cube=x*x*x;
                
                    
                    out.println("</p>");
out.println("  </div>\n" +
"  <div class=\"column\" style=\"background-color:#bbb;left-margin:20px;\">\n" +
"    <h2>Square and Cubes</h2>\n" +
"    <p style='    font-family: sans-serif;\n" +
"    color: #562d2d;'>Square :   "+square+"<br><br>Cube :  "+cube+"</p>\n" +
"  </div>\n" );

//operatiin to [perfrom on number......like armastarong num etc
int revnum=x;
int reverse=0;
while(revnum!=0)
{
    int digit=revnum%10;
    reverse=reverse*10+digit;
    revnum=revnum/10;
}

int  armx=x;
int armtemp=0;
while(armx!=0)
{
    int xxx=armx%10;
    armtemp=armtemp+(xxx*xxx*xxx);
    armx=armx/10;
}
int arm;
if(x==armtemp)
{
arm=1;
}
else{
arm=0;
}






out.println("  <div class=\"column\" style=\"background-color:#ccc;\">\n" +
"    <h2>Operations</h2>\n" +
"    <p style='    font-family: sans-serif;\n" +
"    color: #562d2d;'> Reverse Number : "+reverse+"<br><br>"+""
        + ""
        + ""
        + "Armstrong Test Result :<br>"+armtemp+" is resultant Number So<br>");
if(arm==1){
out.println("<br>It is an armstrong number.");
}
else{
out.println("<br>It is not an armstrong number.");
}

if(x==reverse){
out.println("<br><br>"+x+" is a palendrome Number.");
}
else{
out.println("<br><br>"+x+" is not a palendrome Number.");
}
        out.println("</p>\n" +
"  </div>\n" +
"</div>\n" +
"       \n" +
"       ");
           
            out.println(" <footer>\n" +
"        <h3 style=\"background-color: #4c3945;color: white;text-align: center;height: 25px;font-size:18px;padding: auto; \">Made By Saurabh 2019</h3>\n" +
"    \n" +
"        </footer>\n" +
"        ");
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
