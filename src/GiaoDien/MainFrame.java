package GiaoDien;

import javax.swing.JOptionPane;

/**
 *
 * @author NguyenAnhPhan
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spltPane = new javax.swing.JSplitPane();
        scrlpaneLeftAdmin = new javax.swing.JScrollPane();
        pnlLeft = new javax.swing.JPanel();
        btnKhoa = new javax.swing.JButton();
        btnQLGiangVien = new javax.swing.JButton();
        btnThongKeGioDay = new javax.swing.JButton();
        btnBaoCao = new javax.swing.JButton();
        btnMonHoc = new javax.swing.JButton();
        pnlHome = new javax.swing.JPanel();
        menuBarMain = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuiLogout = new javax.swing.JMenuItem();
        menuiExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Thống kê khối lượng giảng dạy");
        setPreferredSize(new java.awt.Dimension(1100, 700));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        spltPane.setDividerLocation(220);
        spltPane.setDividerSize(0);
        spltPane.setEnabled(false);
        spltPane.setMaximumSize(null);
        spltPane.setPreferredSize(new java.awt.Dimension(1024, 543));

        scrlpaneLeftAdmin.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrlpaneLeftAdmin.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        scrlpaneLeftAdmin.setMaximumSize(null);
        scrlpaneLeftAdmin.setPreferredSize(new java.awt.Dimension(219, 541));

        pnlLeft.setMaximumSize(new java.awt.Dimension(185, 539));
        pnlLeft.setMinimumSize(new java.awt.Dimension(185, 539));

        btnKhoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon_khoa.png"))); // NOI18N
        btnKhoa.setText(" Quản lý khoa ");
        btnKhoa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnKhoa.setMaximumSize(new java.awt.Dimension(101, 41));
        btnKhoa.setMinimumSize(new java.awt.Dimension(101, 41));
        btnKhoa.setPreferredSize(new java.awt.Dimension(79, 25));
        btnKhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhoaActionPerformed(evt);
            }
        });

        btnQLGiangVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/employee.png"))); // NOI18N
        btnQLGiangVien.setText(" Quản lý giảng viên");
        btnQLGiangVien.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnQLGiangVien.setMaximumSize(new java.awt.Dimension(101, 41));
        btnQLGiangVien.setMinimumSize(new java.awt.Dimension(101, 41));
        btnQLGiangVien.setPreferredSize(new java.awt.Dimension(79, 25));
        btnQLGiangVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLGiangVienActionPerformed(evt);
            }
        });

        btnThongKeGioDay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/table.png"))); // NOI18N
        btnThongKeGioDay.setText(" Thống kê giờ dạy");
        btnThongKeGioDay.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnThongKeGioDay.setMaximumSize(new java.awt.Dimension(101, 41));
        btnThongKeGioDay.setMinimumSize(new java.awt.Dimension(101, 41));
        btnThongKeGioDay.setPreferredSize(new java.awt.Dimension(79, 25));
        btnThongKeGioDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeGioDayActionPerformed(evt);
            }
        });

        btnBaoCao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons_baocaonew.png"))); // NOI18N
        btnBaoCao.setText(" Báo cáo");
        btnBaoCao.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBaoCao.setMaximumSize(new java.awt.Dimension(101, 41));
        btnBaoCao.setMinimumSize(new java.awt.Dimension(101, 41));
        btnBaoCao.setPreferredSize(new java.awt.Dimension(79, 25));
        btnBaoCao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaoCaoActionPerformed(evt);
            }
        });

        btnMonHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon_bomon.png"))); // NOI18N
        btnMonHoc.setText("Môn Học");
        btnMonHoc.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMonHoc.setMaximumSize(new java.awt.Dimension(101, 41));
        btnMonHoc.setMinimumSize(new java.awt.Dimension(101, 41));
        btnMonHoc.setPreferredSize(new java.awt.Dimension(79, 25));
        btnMonHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMonHocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLeftLayout = new javax.swing.GroupLayout(pnlLeft);
        pnlLeft.setLayout(pnlLeftLayout);
        pnlLeftLayout.setHorizontalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLeftLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBaoCao, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThongKeGioDay, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQLGiangVien, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        pnlLeftLayout.setVerticalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLeftLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(btnKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnQLGiangVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnThongKeGioDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBaoCao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(549, Short.MAX_VALUE))
        );

        scrlpaneLeftAdmin.setViewportView(pnlLeft);

        spltPane.setLeftComponent(scrlpaneLeftAdmin);

        pnlHome.setMaximumSize(null);
        pnlHome.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout pnlHomeLayout = new javax.swing.GroupLayout(pnlHome);
        pnlHome.setLayout(pnlHomeLayout);
        pnlHomeLayout.setHorizontalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        pnlHomeLayout.setVerticalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
        );

        spltPane.setRightComponent(pnlHome);

        menuFile.setText("File");

        menuiLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        menuiLogout.setText("Logout");
        menuiLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuiLogoutActionPerformed(evt);
            }
        });
        menuFile.add(menuiLogout);

        menuiExit.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        menuiExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_delete.png"))); // NOI18N
        menuiExit.setText("Exit Application");
        menuiExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuiExitActionPerformed(evt);
            }
        });
        menuFile.add(menuiExit);

        menuBarMain.add(menuFile);

        setJMenuBar(menuBarMain);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spltPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 814, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spltPane, javax.swing.GroupLayout.PREFERRED_SIZE, 792, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhoaActionPerformed
        QLKhoa pnlKhoa = new QLKhoa();
        spltPane.setRightComponent(pnlKhoa);
    }//GEN-LAST:event_btnKhoaActionPerformed

    private void btnThongKeGioDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeGioDayActionPerformed
        QLGioDay pnlThongKeGioDay = new QLGioDay();
        spltPane.setRightComponent(pnlThongKeGioDay);
    }//GEN-LAST:event_btnThongKeGioDayActionPerformed

    private void btnQLGiangVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLGiangVienActionPerformed
        QLGiangVienMoi pnlGiangVien = new QLGiangVienMoi();
        spltPane.setRightComponent(pnlGiangVien);
    }//GEN-LAST:event_btnQLGiangVienActionPerformed

    private void menuiExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuiExitActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Bạn thực sự muốn thoát khỏi chương trình?", "Đã thoát", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_menuiExitActionPerformed

    private void menuiLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuiLogoutActionPerformed
        logOut();
    }//GEN-LAST:event_menuiLogoutActionPerformed

    private void btnBaoCaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaoCaoActionPerformed
        QLBaoCao pnlBaoCao=new QLBaoCao();
        spltPane.setRightComponent(pnlBaoCao);
    }//GEN-LAST:event_btnBaoCaoActionPerformed

    private void btnMonHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMonHocActionPerformed
        // TODO add your handling code here:
        QLMonHoc pnlMonHoc = new QLMonHoc();
        spltPane.setRightComponent(pnlMonHoc);
    }//GEN-LAST:event_btnMonHocActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        
    }//GEN-LAST:event_formWindowOpened

    /*Xác nhận và đăng nhập hệ thống*/
    private void logOut() {
        if (JOptionPane.showConfirmDialog(null, "Bạn có muốn đăng xuất khỏi hệ thống ?", "Thoát", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.OK_OPTION) {
            TTCSCN.frmLogin.setVisible(true);
            this.dispose();
        }
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBaoCao;
    private javax.swing.JButton btnKhoa;
    private javax.swing.JButton btnMonHoc;
    private javax.swing.JButton btnQLGiangVien;
    private javax.swing.JButton btnThongKeGioDay;
    private javax.swing.JMenuBar menuBarMain;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenuItem menuiExit;
    private javax.swing.JMenuItem menuiLogout;
    private javax.swing.JPanel pnlHome;
    private javax.swing.JPanel pnlLeft;
    private javax.swing.JScrollPane scrlpaneLeftAdmin;
    private javax.swing.JSplitPane spltPane;
    // End of variables declaration//GEN-END:variables
}
