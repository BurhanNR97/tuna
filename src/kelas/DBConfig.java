/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelas;
    import com.mysql.jdbc.Driver;
    import java.sql.DriverManager;
    import java.sql.Connection;
    import java.sql.SQLException;
    import java.sql.Statement;
    import javax.swing.JOptionPane;

/**
 *
 * @author BURHAN NASIR RAUF
 */
public class DBConfig {
    private static Connection konek;
    
    public static Connection getKoneksi(){
        String database = "jdbc:mysql://localhost/tuna";
        String user = "root";
        String password = ""; 
        
        if (konek==null) {
            try {
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                konek = (Connection) DriverManager.getConnection(database,user,password);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Koneksi Gagal !"+e);
            }
        }        
        return konek;
    }
}
