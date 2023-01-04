/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sd;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Adnan & Arman
 */
public class dbConLR {
    
    public static Connection getconnection() throws SQLException {
        Connection cn = null;
        
        try(FileInputStream f = new FileInputStream("db.properties")){
            
            // load the properties file
            Properties prop = new Properties();
            prop.load(f);
        
            String url = prop.getProperty("url");
            String user = prop.getProperty("root");
            String pass = prop.getProperty("");
        
            cn = DriverManager.getConnection(url,user,pass);
        
        } catch (IOException ex) {
            Logger.getLogger(dbConLR.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return cn;
        
    }
    
    
    
}
