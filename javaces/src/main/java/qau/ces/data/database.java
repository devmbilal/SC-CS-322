package qau.ces.data;

import java.sql.Connection;
import java.sql.DriverManager;

public class database {
    
    public static Connection connectDb(){
        
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/ces", "devmbilal", "63013");

            return connect;
        }catch(Exception e){e.printStackTrace();}
        return null;
    }
    
}