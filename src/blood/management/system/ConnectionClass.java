package blood.management.system;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConnectionClass {
   Connection  c;
   Statement s;
   public ConnectionClass(){
       
try{
           Class.forName("com.mysql.jdbc.Driver");
           c =DriverManager.getConnection("jdbc:mysql://localhost:3306/blood?zeroDateTimeBehavior=convertToNull","root","");
           s =c.createStatement();
           
           }catch(Exception e){
           System.out.println(e);
       }
          }
   public static void main(String[] args) {
        // TODO code application logic here
    }
}
