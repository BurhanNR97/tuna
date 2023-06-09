/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import kelas.DBConfig;
import kelas.simpan;

/**
 *
 * @author BURHAN NASIR RAUF
 */
public class FUtamaAdmin extends javax.swing.JFrame {

    /**
     * Creates new form FUtamaAdmin
     */
    public FUtamaAdmin() {
        initComponents();
        akun();
        ekspor();
        sampel();
        String jenis;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    private void akun(){
        try {
            String sql = "SELECT COUNT(*) AS jml FROM user";
            Connection cn = DBConfig.getKoneksi();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()){
                txt_akun.setText(rs.getString("jml"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(FUtamaNelayan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void sampel(){
        try {
            String sql = "SELECT COUNT(*) AS jml FROM sampel";
            Connection cn = DBConfig.getKoneksi();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()){
                txt_sampel.setText(rs.getString("jml"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(FUtamaNelayan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void ekspor(){
        try {
            String sql = "SELECT COUNT(kd_tuna) AS jml FROM identifikasi WHERE ket='Layak Ekspor'";
            Connection cn = DBConfig.getKoneksi();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()){
                txt_ekspor.setText(rs.getString("jml"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(FUtamaNelayan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        statusbar = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txt_akun = new javax.swing.JLabel();
        txt_sampel = new javax.swing.JLabel();
        txt_ekspor = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1366, 768));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        statusbar.setBackground(new java.awt.Color(0, 138, 138));
        statusbar.setForeground(new java.awt.Color(0, 138, 138));
        statusbar.setPreferredSize(new java.awt.Dimension(1366, 29));
        statusbar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/minimize.jpg"))); // NOI18N
        jButton4.setAlignmentY(1.0F);
        jButton4.setMargin(new java.awt.Insets(2, 13, 2, 15));
        jButton4.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        statusbar.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1308, 2, -1, -1));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/close.png"))); // NOI18N
        jButton5.setAlignmentY(1.0F);
        jButton5.setMargin(new java.awt.Insets(2, 13, 2, 15));
        jButton5.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        statusbar.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1338, 2, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Halaman Utama Admin");
        statusbar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, 280, 29));

        getContentPane().add(statusbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 138, 138));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sistem", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/btn-logout.jpg"))); // NOI18N
        jButton6.setPreferredSize(new java.awt.Dimension(200, 50));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 119, -1, 45));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icons8-manual-book-55.png"))); // NOI18N
        jLabel12.setToolTipText("");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 52, 40, 40));

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Bantuan");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/btn.jpg"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 50, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 510, 300, 190));

        jPanel1.setBackground(new java.awt.Color(0, 138, 138));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/btn-laporan.jpg"))); // NOI18N
        jButton1.setPreferredSize(new java.awt.Dimension(200, 50));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/btn-akun.jpg"))); // NOI18N
        jButton3.setPreferredSize(new java.awt.Dimension(200, 50));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/btn-sampel.jpg"))); // NOI18N
        jButton2.setPreferredSize(new java.awt.Dimension(200, 50));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 200, 300, 210));

        txt_akun.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        txt_akun.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txt_akun, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 320, 210, 110));

        txt_sampel.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        txt_sampel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txt_sampel, new org.netbeans.lib.awtextra.AbsoluteConstraints(709, 320, 210, 110));

        txt_ekspor.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        txt_ekspor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txt_ekspor, new org.netbeans.lib.awtextra.AbsoluteConstraints(989, 320, 210, 110));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/teks-akun.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/teks-ekspor.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 280, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/teks-sampel.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 280, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("METODE GLCM DAN K-NN");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PENGOLAHAN CITRA DIGITAL UNTUK MENENTUKAN");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("IKAN TUNA KUALITAS EKSPOR MENGGUNAKAN");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(582, 120, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/panel.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/unnamed.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 780));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 150, 120));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setState(FUtamaAdmin.ICONIFIED);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int pilih = JOptionPane.showConfirmDialog(null, "Ingin Menutup Aplikasi ?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (pilih == JOptionPane.YES_OPTION) {
            System.exit(0); 
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int pilih = JOptionPane.showConfirmDialog(null, "Anda ingin keluar akun ?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (pilih == JOptionPane.YES_OPTION) {
            FLogin n = new FLogin();
            n.show();
            this.dispose();
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FLaporan n = new FLaporan();
        n.show();
        this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        FAkun n = new FAkun();
        n.show();
        this.hide();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        simpan m = new simpan();
        m.setJenis("admin");
        FBantuan n = new FBantuan();
        n.show();
        this.hide();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        FSampel n = new FSampel();
        n.show();
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FUtamaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FUtamaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FUtamaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FUtamaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FUtamaAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel statusbar;
    private javax.swing.JLabel txt_akun;
    private javax.swing.JLabel txt_ekspor;
    private javax.swing.JLabel txt_sampel;
    // End of variables declaration//GEN-END:variables
}
