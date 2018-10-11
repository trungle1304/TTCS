/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NguyenAnhPhan
 */
public class Connect {
    public static Connection getConnect() {
        Connection conn=null;
        try {
            String uRL="jdbc:sqlserver://localhost:1433;databaseName=TTCS";
            String user="sa";
            String pass="sa";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(uRL,user,pass);
            System.out.println("Kết nối Database thành công");
        } catch (Exception e) {
            System.out.println("Kết nối Database thất bại!!!");
            return  null;
        }
        return conn;
    }
  
}
