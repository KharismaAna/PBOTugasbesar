/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author ASUS
 */
public class Koneksi {
   private static Connection koneksi;
    public static Connection GetConnection()throws SQLException{
        if (koneksi==null){
            new Driver();
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/pkn","root","");
        }
        return koneksi;
    }

    
    
/*  public static Connection tryConnect(){
	
	if(connect ==null)
{ 
try {
	String url ="jdbc:mysql://localhost/tubes_pbo";
	String user ="root";
	String pass="";
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	connect = DriverManager.getConnection(url,user,pass);
} catch (SQLException ex){
    System.out.println("gg"+ex);
}
}
    return connect;
  }*/
}

