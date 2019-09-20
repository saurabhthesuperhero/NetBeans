/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jason;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
/**
 *
 * @author USER
 */
public class Jason {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ParseException, ClassNotFoundException, SQLException {
        
        
         JSONParser parser = new JSONParser();
                 
                
                  
                  ResultSet rset;
                  int NumberId;
                 String Name;
                 String course;
              
                  
         Object obj = parser.parse(new FileReader("C://Users/USER/Documents/prachiii_saurabh/jsonfile.json"));
        
         JSONArray countrydata=(JSONArray) obj; 
        JSONObject cnt;
        for (Iterator it = countrydata.iterator(); it.hasNext();) {
            cnt = (JSONObject) it.next();
            Object ObjName=cnt.get("Name");
            Object ObjPop=cnt.get("Population");
            Object ObjStates=cnt.get("States");
             Class.forName("org.apache.derby.jdbc.ClientDriver");
                  
                  Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/jsonDB","root","root");
          
            String sqlquery="INSERT INTO ROOT.peopleofhome (\"NAME\", POPULATION, STATES) \n" +
"	VALUES (?, ?, ?)";
            try{
            PreparedStatement pst= con.prepareStatement(sqlquery);
            String someName=ObjName.toString();
            pst.setString(1,someName);
            String somePop=ObjPop.toString();
            pst.setString(2,somePop);
            String someStates=ObjStates.toString();
            pst.setString(3,someStates);
            
            pst.executeUpdate();
            }
            catch(Exception e)
            {
            System.out.println(e);
            }
            }
         
         
        
    }
    
}
