/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GiaoDien;

import DAO.Connect;
import DAO.KhoaDAO;
import Model.BoMon;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NguyenAnhPhan
 */
public class QLKhoa extends javax.swing.JPanel {

    public static Connection conn = Connect.getConnect();
    PreparedStatement pst;
    ResultSet rs;
    Statement st;

    public static String sql = "SELECT*FROM Khoa";
    String query1 = "select * from BoMon";
    String query2 = "select TenKhoa from Khoa order by TenKhoa asc";

    public static String makhoa;


    public QLKhoa() {
        initComponents();
        KhoaDAO.LoadTableBangKhoa(sql, jTableDanhsachKhoa);
        KhoaDAO.LoadTableBangKhoa(query1, jTableDanhsachBoMon);
        KhoaDAO.LoadCombobx(query2, cbxTaoTenKhoa_BM, "TenKhoa");
  
    }
    
    
//    public static ArrayList<BoMon> listBoMon(){
//        ArrayList<BoMon> listBM = new ArrayList<>();
//        try {
//            String query1 = "select * from BoMon";
//             st = conn.createStatement();
//             rs = st.executeQuery(query1);
//            BoMon boMon;
//            while(rs.next()){
//                boMon = new BoMon(rs.getInt("IDBM"), rs.getString("TenBM"), rs.getString("TenKhoa"));
//                listBM.add(boMon);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(QLKhoa.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return listBM;
//       
//    }
//    public void show_BoMon(){
//        ArrayList<BoMon> list = listBoMon();
//        DefaultTableModel model = (DefaultTableModel)jTableDanhsachBoMon.getModel();
//        Object[] row = new Object[3];
//         for(BoMon objBoMon: list){
//            row[0] = objBoMon.getmIDBoMon();
//            row[1] = objBoMon.getmTenBoMon();
//            row[2] = objBoMon.getmTenKhoa();
//            model.addRow(row);
//            
//        }
//        jTableDanhsachBoMon.setModel(model);
//        
//                }
//    public void loadTenKhoa(){
//        try {
//            String query2 = "select TenKhoa from Khoa order by TenKhoa asc";
//             pst = conn.prepareStatement(query2);
//             rs = pst.executeQuery();
//            while(rs.next()){
//               cbxTaoTenKhoa_BM.addItem(rs.getString("TenKhoa"));
//            }
//             
//        }  catch (SQLException ex) {
//            Logger.getLogger(QLKhoa.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        pnlTaoKhoa = new javax.swing.JPanel();
        btnThemKhoa = new javax.swing.JButton();
        txtTaoTenKhoa = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaMoTaThem = new javax.swing.JTextArea();
        pnlSuaKhoa = new javax.swing.JPanel();
        btnCapNhatKhoa = new javax.swing.JButton();
        txtSuaMaKhoa = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtSuaTenKhoa = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        btnXoaKhoa = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtAreaSuaMoTaKhoa = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableDanhsachKhoa = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        pnlTaoKhoa1 = new javax.swing.JPanel();
        btnThemBoMon = new javax.swing.JButton();
        txtTaoTenBoMon = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        cbxTaoTenKhoa_BM = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableDanhsachBoMon = new javax.swing.JTable();
        pnlTaoKhoa2 = new javax.swing.JPanel();
        txtSuaMaBoMon = new javax.swing.JTextField();
        txtSuaTenBoMon = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        cbxSuaTenKhoa_BM = new javax.swing.JComboBox<>();
        btnCapNhatBoMon = new javax.swing.JButton();
        btnXoaBoMon = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(600, 500));

        pnlTaoKhoa.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tạo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        btnThemKhoa.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnThemKhoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_add.png"))); // NOI18N
        btnThemKhoa.setText("Tạo mới");
        btnThemKhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemKhoaActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setText("Tên khoa");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Mô tả");

        txtAreaMoTaThem.setColumns(20);
        txtAreaMoTaThem.setRows(5);
        jScrollPane1.setViewportView(txtAreaMoTaThem);

        javax.swing.GroupLayout pnlTaoKhoaLayout = new javax.swing.GroupLayout(pnlTaoKhoa);
        pnlTaoKhoa.setLayout(pnlTaoKhoaLayout);
        pnlTaoKhoaLayout.setHorizontalGroup(
            pnlTaoKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTaoKhoaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTaoKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(pnlTaoKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                    .addComponent(txtTaoTenKhoa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThemKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        pnlTaoKhoaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel12});

        pnlTaoKhoaLayout.setVerticalGroup(
            pnlTaoKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTaoKhoaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTaoKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtTaoTenKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(pnlTaoKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThemKhoa))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlTaoKhoaLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnThemKhoa, jLabel1, jLabel12, txtTaoTenKhoa});

        pnlSuaKhoa.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sửa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        btnCapNhatKhoa.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnCapNhatKhoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_save.png"))); // NOI18N
        btnCapNhatKhoa.setText("Lưu");
        btnCapNhatKhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatKhoaActionPerformed(evt);
            }
        });

        txtSuaMaKhoa.setEditable(false);
        txtSuaMaKhoa.setEnabled(false);
        txtSuaMaKhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSuaMaKhoaActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel13.setText("Mã khoa");

        txtSuaTenKhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSuaTenKhoaActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel14.setText("Tên khoa");

        btnXoaKhoa.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnXoaKhoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_delete.png"))); // NOI18N
        btnXoaKhoa.setText("Xóa");
        btnXoaKhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaKhoaActionPerformed(evt);
            }
        });

        txtAreaSuaMoTaKhoa.setColumns(20);
        txtAreaSuaMoTaKhoa.setRows(5);
        jScrollPane4.setViewportView(txtAreaSuaMoTaKhoa);

        jLabel2.setText("Mô tả");

        javax.swing.GroupLayout pnlSuaKhoaLayout = new javax.swing.GroupLayout(pnlSuaKhoa);
        pnlSuaKhoa.setLayout(pnlSuaKhoaLayout);
        pnlSuaKhoaLayout.setHorizontalGroup(
            pnlSuaKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSuaKhoaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSuaKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel2))
                .addGap(24, 24, 24)
                .addGroup(pnlSuaKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlSuaKhoaLayout.createSequentialGroup()
                        .addComponent(txtSuaMaKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSuaTenKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(pnlSuaKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnXoaKhoa, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCapNhatKhoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        pnlSuaKhoaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel13, jLabel2});

        pnlSuaKhoaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCapNhatKhoa, btnXoaKhoa});

        pnlSuaKhoaLayout.setVerticalGroup(
            pnlSuaKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSuaKhoaLayout.createSequentialGroup()
                .addGroup(pnlSuaKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSuaKhoaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlSuaKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtSuaMaKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(txtSuaTenKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlSuaKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(pnlSuaKhoaLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnCapNhatKhoa)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoaKhoa)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlSuaKhoaLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCapNhatKhoa, btnXoaKhoa, jLabel13, jLabel14, jLabel2, txtSuaMaKhoa, txtSuaTenKhoa});

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách khoa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        jTableDanhsachKhoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "       Mã khoa", "                                   Tên khoa", "                                        Mô tả"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableDanhsachKhoa.setPreferredSize(new java.awt.Dimension(700, 300));
        jTableDanhsachKhoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDanhsachKhoaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableDanhsachKhoa);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(pnlSuaKhoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlTaoKhoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlTaoKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlSuaKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Khoa", new javax.swing.ImageIcon(getClass().getResource("/Images/khoa2.png")), jPanel1); // NOI18N

        pnlTaoKhoa1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tạo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        btnThemBoMon.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnThemBoMon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_add.png"))); // NOI18N
        btnThemBoMon.setText("Tạo mới");
        btnThemBoMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemBoMonActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel16.setText("Tên bộ môn");

        jLabel19.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel19.setText("Tên khoa");

        javax.swing.GroupLayout pnlTaoKhoa1Layout = new javax.swing.GroupLayout(pnlTaoKhoa1);
        pnlTaoKhoa1.setLayout(pnlTaoKhoa1Layout);
        pnlTaoKhoa1Layout.setHorizontalGroup(
            pnlTaoKhoa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTaoKhoa1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTaoKhoa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlTaoKhoa1Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addComponent(cbxTaoTenKhoa_BM, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlTaoKhoa1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(txtTaoTenBoMon, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(65, 65, 65)
                .addComponent(btnThemBoMon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlTaoKhoa1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel16, jLabel19});

        pnlTaoKhoa1Layout.setVerticalGroup(
            pnlTaoKhoa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTaoKhoa1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlTaoKhoa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(cbxTaoTenKhoa_BM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlTaoKhoa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtTaoTenBoMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThemBoMon))
                .addContainerGap())
        );

        pnlTaoKhoa1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnThemBoMon, cbxTaoTenKhoa_BM, jLabel16, jLabel19, txtTaoTenBoMon});

        jScrollPane3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách bộ môn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        jTableDanhsachBoMon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "     Mã bộ môn", "                                   Tên bộ môn", "                                     Tên khoa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableDanhsachBoMon.setPreferredSize(new java.awt.Dimension(700, 300));
        jTableDanhsachBoMon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDanhsachBoMonMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableDanhsachBoMon);

        pnlTaoKhoa2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sửa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        txtSuaMaBoMon.setEditable(false);
        txtSuaMaBoMon.setEnabled(false);

        jLabel20.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel20.setText("Mã bộ môn");

        jLabel21.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel21.setText("Tên bộ môn");

        jLabel22.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel22.setText("Tên khoa");

        cbxSuaTenKhoa_BM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSuaTenKhoa_BMActionPerformed(evt);
            }
        });

        btnCapNhatBoMon.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnCapNhatBoMon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_save.png"))); // NOI18N
        btnCapNhatBoMon.setText("Lưu");
        btnCapNhatBoMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatBoMonActionPerformed(evt);
            }
        });

        btnXoaBoMon.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnXoaBoMon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_delete.png"))); // NOI18N
        btnXoaBoMon.setText("Xóa");
        btnXoaBoMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaBoMonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTaoKhoa2Layout = new javax.swing.GroupLayout(pnlTaoKhoa2);
        pnlTaoKhoa2.setLayout(pnlTaoKhoa2Layout);
        pnlTaoKhoa2Layout.setHorizontalGroup(
            pnlTaoKhoa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTaoKhoa2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTaoKhoa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlTaoKhoa2Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSuaMaBoMon, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSuaTenBoMon))
                    .addGroup(pnlTaoKhoa2Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(18, 18, 18)
                        .addComponent(cbxSuaTenKhoa_BM, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(68, 68, 68)
                .addGroup(pnlTaoKhoa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCapNhatBoMon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoaBoMon))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pnlTaoKhoa2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCapNhatBoMon, btnXoaBoMon});

        pnlTaoKhoa2Layout.setVerticalGroup(
            pnlTaoKhoa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTaoKhoa2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTaoKhoa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(cbxSuaTenKhoa_BM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCapNhatBoMon))
                .addGap(18, 18, 18)
                .addGroup(pnlTaoKhoa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtSuaMaBoMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(txtSuaTenBoMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoaBoMon))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlTaoKhoa2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCapNhatBoMon, cbxSuaTenKhoa_BM, jLabel20, jLabel21, jLabel22, txtSuaMaBoMon, txtSuaTenBoMon});

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlTaoKhoa1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlTaoKhoa2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlTaoKhoa1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlTaoKhoa2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Bộ môn", new javax.swing.ImageIcon(getClass().getResource("/Images/icon_bomon.png")), jPanel5); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 636, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jTabbedPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jTabbedPane1))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemKhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemKhoaActionPerformed
        if (txtTaoTenKhoa.getText().length() == 0 || txtAreaMoTaThem.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Bạn không được để trường trống");
        } else {
            KhoaDAO.ThemKhoa(this.txtTaoTenKhoa.getText().trim(), this.txtAreaMoTaThem.getText().trim());
            JOptionPane.showMessageDialog(null, "Thêm thành công khoa " + txtTaoTenKhoa.getText().toString().trim());
            KhoaDAO.LoadTableBangKhoa(sql, jTableDanhsachKhoa);
         
        }
    }//GEN-LAST:event_btnThemKhoaActionPerformed

    private void btnCapNhatKhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatKhoaActionPerformed
        KhoaDAO.CapNhatKhoa(makhoa, this.txtSuaTenKhoa.getText().toString().trim(), this.txtAreaSuaMoTaKhoa.getText().toString().trim());
        JOptionPane.showMessageDialog(null, "Cập nhật thông tin thành công", "Thông báo", 1);
        txtSuaMaKhoa.setText("");
        txtSuaTenKhoa.setText("");
        txtAreaSuaMoTaKhoa.setText("");
        KhoaDAO.LoadTableBangKhoa(sql, jTableDanhsachKhoa);
    }//GEN-LAST:event_btnCapNhatKhoaActionPerformed

    private void btnXoaKhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaKhoaActionPerformed
        if ((JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa khoa " + makhoa + " hay không?", "Thông báo", 2)) == 0) {
            KhoaDAO.XoaKhoa(makhoa);
            txtSuaMaKhoa.setText("");
            txtSuaTenKhoa.setText("");
            txtAreaSuaMoTaKhoa.setText("");

            KhoaDAO.LoadTableBangKhoa(sql, jTableDanhsachKhoa);
        }
    }//GEN-LAST:event_btnXoaKhoaActionPerformed

    private void btnThemBoMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemBoMonActionPerformed
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String uRL = "jdbc:sqlserver://localhost:1433;databaseName=TTCS;user=sa;password=sa";
            conn = DriverManager.getConnection(uRL);
            String query3 = "insert into BoMon values (?,?)";
            pst = conn.prepareStatement(query3);
            String choose;
            choose = cbxTaoTenKhoa_BM.getSelectedItem().toString();
            pst.setString(1, choose);
            pst.setString(2, txtTaoTenBoMon.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Thêm thành công!");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QLKhoa.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(QLKhoa.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnThemBoMonActionPerformed

    private void btnCapNhatBoMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatBoMonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCapNhatBoMonActionPerformed

    private void btnXoaBoMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaBoMonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaBoMonActionPerformed

    private void jTableDanhsachKhoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDanhsachKhoaMouseClicked
        try {
            txtTaoTenKhoa.setText("");
            txtAreaMoTaThem.setText("");
            int row = this.jTableDanhsachKhoa.getSelectedRow();//Lấy dòng hiện tại mình đang nhấn chuột
            String IDrow = (this.jTableDanhsachKhoa.getModel().getValueAt(row, 0)).toString();//Lấy giá trị ở dòng 1 nhấn

            //và lấy giá trị đó đổi ra string
            String sql1 = "SELECT * FROM Khoa WHERE IDKhoa='" + IDrow + "'";
            ResultSet rs = KhoaDAO.ShowTextField(sql1);
            //đọc dữ liệu tại dòng có mã được chọn
            if (rs.next())//nếu có dữ liệu
            {
                makhoa = rs.getString("IDKhoa");
                this.txtSuaMaKhoa.setText(rs.getString("IDKhoa"));
                this.txtSuaTenKhoa.setText(rs.getString("TenKhoa"));
                this.txtAreaSuaMoTaKhoa.setText(rs.getString("MoTaKhoa"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Bạn phải chọn vào 1 dòng dữ liệu!");
        }
    }//GEN-LAST:event_jTableDanhsachKhoaMouseClicked

    private void txtSuaTenKhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSuaTenKhoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSuaTenKhoaActionPerformed

    private void txtSuaMaKhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSuaMaKhoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSuaMaKhoaActionPerformed

    private void jTableDanhsachBoMonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDanhsachBoMonMouseClicked
        try {
            int row1 = this.jTableDanhsachBoMon.getSelectedRow();
            String IDrow1 = (this.jTableDanhsachBoMon.getModel().getValueAt(row1, 0)).toString();
            
            String query3 = "select * from BoMon where IDBM='"+IDrow1+"'";
            rs = KhoaDAO.ShowTextField(query3);
            if(rs.next()){
                this.txtSuaMaBoMon.setText(rs.getString("IDBM"));
                this.txtSuaTenBoMon.setText(rs.getString("TenBM"));
                this.cbxSuaTenKhoa_BM.setSelectedItem(rs.getString("TenKhoa"));
            }
             KhoaDAO.LoadCombobx(query2, cbxSuaTenKhoa_BM, "TenKhoa");
           
             
        } catch (SQLException ex) {
            Logger.getLogger(QLKhoa.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jTableDanhsachBoMonMouseClicked

    private void cbxSuaTenKhoa_BMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSuaTenKhoa_BMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxSuaTenKhoa_BMActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhatBoMon;
    private javax.swing.JButton btnCapNhatKhoa;
    private javax.swing.JButton btnThemBoMon;
    private javax.swing.JButton btnThemKhoa;
    private javax.swing.JButton btnXoaBoMon;
    private javax.swing.JButton btnXoaKhoa;
    private javax.swing.JComboBox<String> cbxSuaTenKhoa_BM;
    private javax.swing.JComboBox<String> cbxTaoTenKhoa_BM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableDanhsachBoMon;
    private javax.swing.JTable jTableDanhsachKhoa;
    private javax.swing.JPanel pnlSuaKhoa;
    private javax.swing.JPanel pnlTaoKhoa;
    private javax.swing.JPanel pnlTaoKhoa1;
    private javax.swing.JPanel pnlTaoKhoa2;
    private javax.swing.JTextArea txtAreaMoTaThem;
    private javax.swing.JTextArea txtAreaSuaMoTaKhoa;
    private javax.swing.JTextField txtSuaMaBoMon;
    private javax.swing.JTextField txtSuaMaKhoa;
    private javax.swing.JTextField txtSuaTenBoMon;
    private javax.swing.JTextField txtSuaTenKhoa;
    private javax.swing.JTextField txtTaoTenBoMon;
    private javax.swing.JTextField txtTaoTenKhoa;
    // End of variables declaration//GEN-END:variables
}
