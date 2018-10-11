/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author NguyenAnhPhan
 */
public class KhoaDAO {

    public static PreparedStatement pst = null;
    public static ResultSet rs = null;
    public static Connection conn = Connect.getConnect();

    public static void LoadTableBangKhoa(String sql, JTable tb) {
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            tb.setModel((DbUtils.resultSetToTableModel(rs)));
            
            //ngay chỗ này là nạp dữ liệu lên bảng
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Thông báo lỗi", 1);
        }
    }
   

    //Tiếp theo viết 1 hàm đổ dòng dữ liệu
    public static ResultSet ShowTextField(String sql) {
        try {
            pst = conn.prepareStatement(sql);
            return pst.executeQuery();
            //trả về 1 dòng dữ liệu đọc được
        } catch (Exception e) {

            //    JOptionPane.showMessageDialog(null, e,"Thông báo lỗi",1);
            return null;
        }
    }
    public static void LoadCombobx(String sql, JComboBox comboBox, String tenCotTrongSql){
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
             while(rs.next()){
             comboBox.addItem(rs.getString(tenCotTrongSql));
          }
        } catch (SQLException ex) {
            Logger.getLogger(KhoaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
