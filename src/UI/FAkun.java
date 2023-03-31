/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import kelas.*;

/**
 *
 * @author BURHAN NASIR RAUF
 */
public class FAkun extends javax.swing.JFrame {
    String OPSI = "";

    /**
     * Creates new form FUtamaAdmin
     */
    public FAkun() {
        initComponents();
        jTable1.setEnabled(false);
        btn_smpan.setEnabled(false);
        btn_tambah.setEnabled(true);
        btn_ubah.setEnabled(true);
        btn_hapus.setEnabled(true);
        txt_id.setVisible(false);
        jLabel1.setVisible(false);
        try {
            tampil();
        } catch (SQLException ex) {
            Logger.getLogger(FAkun.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    public void mati(){
        jTable1.setEnabled(false);
        btn_smpan.setEnabled(false);
        btn_tambah.setEnabled(true);
        btn_ubah.setEnabled(true);
        btn_hapus.setEnabled(true);
        txt_username.setEnabled(false);
        txt_password.setEnabled(false);
        txt_password.setEnabled(false);
        jTable1.setEnabled(false);
        txt_username.setEnabled(false);
        CB_level.setEnabled(false);
        txt_username.setText("");
        txt_password.setText("");
        CB_level.setSelectedIndex(0);
    }   
    
    private DefaultTableModel tampil() throws SQLException {
        Object header[] ={"ID User", "Username", "Password", "Level", "Login Terakhir"};
        DefaultTableModel tabel = new DefaultTableModel(null, header);
        String sql = "SELECT * FROM user ORDER BY id_user ASC";
        Connection conn = DBConfig.getKoneksi();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            String a = rs.getString("id_user");
            String b = rs.getString("username");
            String c = rs.getString("password");
            String d = rs.getString("level");
            String e = rs.getString("sesi");
            String kolom[] = {a, b, c, d, e};
            tabel.addRow(kolom);
            jTable1.setModel(tabel);
        }
        return tabel;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_tambah = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btn_batal = new javax.swing.JLabel();
        btn_smpan = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        CB_level = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btn_hapus = new javax.swing.JLabel();
        btn_ubah = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txt_password = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        statusbar = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("TAMBAH");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 267, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID User");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 66, -1, -1));

        btn_tambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/btn-simpan.png"))); // NOI18N
        btn_tambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_tambahMouseClicked(evt);
            }
        });
        getContentPane().add(btn_tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, -1, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("BATAL");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 267, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("SIMPAN");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(775, 267, -1, -1));

        btn_batal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/btn-simpan.png"))); // NOI18N
        btn_batal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_batalMouseClicked(evt);
            }
        });
        getContentPane().add(btn_batal, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 260, -1, 30));

        btn_smpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/btn-simpan.png"))); // NOI18N
        getContentPane().add(btn_smpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 260, -1, 30));

        txt_id.setEditable(false);
        txt_id.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 200, 30));

        CB_level.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- PILIH -", "Admin", "Nelayan" }));
        CB_level.setEnabled(false);
        getContentPane().add(CB_level, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 200, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Hak Akses");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 216, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("UBAH");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 267, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("HAPUS");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 267, -1, -1));

        btn_hapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/btn-simpan.png"))); // NOI18N
        btn_hapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_hapusMouseClicked(evt);
            }
        });
        getContentPane().add(btn_hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 260, -1, 30));

        btn_ubah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/btn-simpan.png"))); // NOI18N
        btn_ubah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ubahMouseClicked(evt);
            }
        });
        getContentPane().add(btn_ubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, -1, 30));

        txt_username.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_username.setEnabled(false);
        getContentPane().add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 200, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 1010, 410));

        txt_password.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_password.setEnabled(false);
        getContentPane().add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, 200, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 165, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 116, -1, -1));

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
        jLabel3.setText("Akun Pengguna");
        statusbar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, 280, 29));

        getContentPane().add(statusbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/unnamed.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 780));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setState(FAkun.ICONIFIED);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int pilih = JOptionPane.showConfirmDialog(null, "Ingin kembali ke halaman utama ?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (pilih == JOptionPane.YES_OPTION) {
            FUtamaAdmin n = new FUtamaAdmin();
            n.show();
            this.dispose();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btn_tambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambahMouseClicked
        if (btn_tambah.isEnabled()){
            OPSI = "TAMBAH";
            txt_username.setEnabled(true);
            txt_password.setEnabled(true);
            txt_username.requestFocus();
            btn_tambah.setEnabled(false);
            btn_ubah.setEnabled(false);
            btn_hapus.setEnabled(false);
            btn_smpan.setEnabled(true);
            txt_username.setEnabled(true);
            txt_password.setEnabled(true);
            CB_level.setEnabled(true);
            txt_username.requestFocus();
        }
    }//GEN-LAST:event_btn_tambahMouseClicked

    private void btn_ubahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ubahMouseClicked
        if (btn_ubah.isEnabled()){
            OPSI = "UBAH";
            btn_smpan.setEnabled(true);
            btn_tambah.setEnabled(false);
            btn_ubah.setEnabled(false);
            btn_hapus.setEnabled(false);
            jTable1.setEnabled(true);
            JOptionPane.showMessageDialog(null,"Silahkan Pilih data pada tabel");
        }
    }//GEN-LAST:event_btn_ubahMouseClicked

    private void btn_hapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_hapusMouseClicked
        if (btn_hapus.isEnabled()){
            OPSI = "HAPUS";
            btn_smpan.setEnabled(true);
            btn_tambah.setEnabled(false);
            btn_ubah.setEnabled(false);
            btn_hapus.setEnabled(false);
            jTable1.setEnabled(true);
            JOptionPane.showMessageDialog(null,"Silahkan Pilih data pada tabel");
        }
    }//GEN-LAST:event_btn_hapusMouseClicked

    private void btn_batalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_batalMouseClicked
        int pilih = JOptionPane.showConfirmDialog(null, "Ingin membatalkan semua perintah ?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (pilih == JOptionPane.YES_OPTION) {
            mati();
        }
    }//GEN-LAST:event_btn_batalMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (jTable1.isEnabled()){
            int row = jTable1.getSelectedRow();
            txt_id.setText(jTable1.getValueAt(row, 0).toString());
            txt_username.setText(jTable1.getValueAt(row, 1).toString());
            txt_password.setText(jTable1.getValueAt(row, 2).toString());
            if (jTable1.getValueAt(row, 3).toString().equals("1")){
                CB_level.setSelectedIndex(1);
            } else
            if (jTable1.getValueAt(row, 3).toString().equals("2")){
                CB_level.setSelectedIndex(2);
            }    
        }
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(FAkun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FAkun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FAkun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FAkun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FAkun().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CB_level;
    private javax.swing.JLabel btn_batal;
    private javax.swing.JLabel btn_hapus;
    private javax.swing.JLabel btn_smpan;
    private javax.swing.JLabel btn_tambah;
    private javax.swing.JLabel btn_ubah;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel statusbar;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
