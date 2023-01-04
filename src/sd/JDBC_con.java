/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sd;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Adnan & Arman
 */
public class JDBC_con {
    
    private static String serverName = "localhost";
    private static String userName = "root";
    private static String DbName = "test";
    private static int portNo = 3306;
    private static String pass = "";
    
    public static Connection getconnection() {
        Connection cn = null;
        
        MysqlDataSource dataSrc = new MysqlDataSource();
        dataSrc.setServerName(serverName);
        dataSrc.setUser(userName);
        dataSrc.setPassword(pass);
        dataSrc.setDatabaseName(DbName);
        dataSrc.setPortNumber(portNo);
        
        try {
            cn = dataSrc.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger("get connection : "+JDBC_con.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        return cn;
    }
    
}
