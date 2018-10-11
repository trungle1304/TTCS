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
import javax.swing.table.DefaultTableModel;
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
            String[] tieuDe = new String[]{"Mã khoa", "Tên khoa", "Mô tả khoa"};
        DefaultTableModel bangKhoa = new DefaultTableModel(tieuDe, 0);
      
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            tb.setModel(bangKhoa);
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
    public static  void ThemKhoa(String tenKhoa, String moTa){
        String sql="INSERT INTO Khoa(TenKhoa,MoTaKhoa) VALUES (?,?)";
        try {
            pst=conn.prepareStatement(sql);
            pst.setString(1, tenKhoa);
            pst.setString(2, moTa);
            pst.execute();
           // JOptionPane.showMessageDialog(null, "Đã thêm khoa "+tenKhoa+" thành công","Thông báo",1);
            
        } catch (Exception e) {
        }
        
    }
    public static void CapNhatKhoa(String idKhoa, String tenKhoa,String moTa){
        String sql="UPDATE Khoa SET TenKhoa = N'"+tenKhoa+"', MoTaKhoa =N'"+moTa+"' WHERE IDKhoa='"+idKhoa+"'";
        try {
            pst=conn.prepareStatement(sql);
            pst.execute();
            
        } catch (Exception e) {
        }
    }
    public static void XoaKhoa(String idKhoa){
        String sql="DELETE FROM Khoa Where IDKhoa='"+idKhoa+"'";
        try {
            pst=conn.prepareStatement(sql);
            pst.execute();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Khoa "+idKhoa+" có thể đã được sử dụng ở thực thể khác nên không thể xóa", "Thông báo", 1);
        }
    }

}
