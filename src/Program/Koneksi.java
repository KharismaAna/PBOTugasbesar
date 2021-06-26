/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
 */
public class Koneksi {
    private static Connection mysqlkonek;
    public static Connection koneksiDB()throws SQLException{
        if(mysqlkonek==null){
        try{
        String DB ="jdbc:mysql://localhost/tubes_pbo";
	String user ="root";
	String pass="";
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	mysqlkonek = (Connection)DriverManager.getConnection(DB,user,pass);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null," gagal koneksi");
        }    
        
        }
        return mysqlkonek;
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
