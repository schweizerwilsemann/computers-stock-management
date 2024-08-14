/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class JDBCUtil {
	private static String connectionUrl = "jdbc:sqlserver://Qian\\SQLEXPRESS:1433;databaseName=QuanLyKhoMayTinh;user=sa;password=123456;encrypt = false";
    
    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(connectionUrl);
            System.out.println("Ket noi thanh cong\n");
        } catch (SQLException ex) {
            Logger.getLogger(JDBCUtil.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Không thể kết nối đến cơ sở dữ liệu !", "Lỗi", JOptionPane.ERROR_MESSAGE);
            System.out.println("Ket noi that bai");
        }
        return conn;
    }

    public static void closeConnection(Connection c) {
        try {
            if (c != null) {
                c.close();
            }
        } catch (SQLException ex) {
            // TODO: handle exception
            Logger.getLogger(JDBCUtil.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
    }
}
