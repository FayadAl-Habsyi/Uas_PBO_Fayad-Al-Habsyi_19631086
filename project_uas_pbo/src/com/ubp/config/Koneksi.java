package com.ubp.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Koneksi {
    
    private static Connection mysqlkonek;
    
    public static Connection koneksiDB() {
        if(mysqlkonek==null){
            try {
                String nama_database = "uas_pbo_FayadAl-Habsyi"; 
                String DB="jdbc:mysql://localhost:3306/"+nama_database;
                String user="root"; 
                String pass=""; 
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                mysqlkonek = (Connection) DriverManager.getConnection(DB,user,pass);
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null,"Koneksi Gagal, pastikan MySQL berjalan !");
            }
        }
        return mysqlkonek;
    }
}
