/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Adnan & Arman
 */
public class JDBC_con_ds {
    private Connection conn;
    private ResultSet rs;
    private Statement st;
    
    public JDBC_con_ds()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/diseaseinfo","root","");
            st=conn.createStatement();
        }
        catch(Exception ex){
            System.out.println("Error: "+ex);
        }
        
    }
    
    
    
        
    
    
    
    public void getData()
    {
        try{
            String query="SELECT * FROM student";
            rs=st.executeQuery(query);
            System.out.println("Results from the query:\n ");
            while(rs.next())
            {
                int id=rs.getInt("ID");
                String name=rs.getString("name");
                String address=rs.getString("address");
                String section=rs.getString("section");
                System.out.println("ID: " + id + " Name: " + name + " Address: " + address + " Section: " + section);
            }
        }
        catch(Exception ex)
        {
            System.out.println("Error 2 :" + ex);
        }
            
    }
    
    
    
    public void insertData()
    {
        try{
            int id=6;
            String name="abc";
            String address="Chittagong";
            String section="D";
            String query="INSERT INTO student VALUES("+id+",'"+ name +"','"+address+"','"+section+"')";
            st.execute(query);    
        }
        catch(Exception ex)
        {
            System.out.println("Error 3 :" + ex);
        }
    }
    
    
    
    public void updateData()
    {
        try{
            int id=6;
            String name="Rina";
            String query="UPDATE student SET name= '" + name + "' Where id=" +id;
            st.execute(query);
            
        }
         catch(Exception ex)
        {
            System.out.println("Error 4 :" + ex);
        }
    }
    
    
    
    public void deleteData()
    {
        try{
            int id=5;
            String query="DELETE FROM student WHERE id =" + id;
            st.execute(query);
        }
         catch(Exception ex)
        {
            System.out.println("Error 5 :" + ex);
        }
    }
    
}
