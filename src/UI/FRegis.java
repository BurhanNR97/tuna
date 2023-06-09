/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import kelas.DBConfig;
import kelas.simpan;

/**
 *
 * @author LENOVO
 */
public class FRegis extends javax.swing.JFrame {

    /**
     * Creates new form FRegis
     */
    public FRegis() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    public void hilang(JTextField tf){
        Font font = tf.getFont();
        font = font.deriveFont(Font.PLAIN);
        tf.setFont(font);
        tf.setForeground(Color.black);
    }
    
    public void muncul(JTextField tf){ 
        Font font = tf.getFont();
        font = font.deriveFont(Font.ITALIC);
        tf.setFont(font);
        tf.setForeground(Color.gray);
    }
    
    public void tambahData(){
        try {
            Connection cn = DBConfig.getKoneksi();
            Statement st = cn.createStatement();
            String sql = "INSERT INTO nelayan SET nik='"+txt_nik.getText()+"', nama='"+
                        txt_nama.getText()+"', alamat='"+txt_alamat.getText()+"', telp='"+txt_telepon.getText()+
                        "', username;"
                    + "INSERT INTO user SET username='"+txt_username.getText()+"', password='"+txt_password.getText()+"', level='2'";
            st.executeQuery(sql);
        } catch (Exception e) {
        }
    }
    
    public void cekuser() {
        try {
                Connection cn = DBConfig.getKoneksi();
                Statement st = cn.createStatement();
                String sql = "SELECT * FROM user WHERE username='"+txt_username.getText()+"'";
                ResultSet rs = st.executeQuery(sql);
                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "username sudah digunakan");
                    txt_username.requestFocus();
                    txt_username.selectAll();
                } else {
                    try {
                            Connection cnn = DBConfig.getKoneksi();
                            Statement stt = cnn.createStatement();
                            String sqll = "SELECT * FROM nelayan WHERE nik='"+txt_nik.getText()+"'";
                            ResultSet rss = stt.executeQuery(sqll);
                            if (rss.next()) {
                                JOptionPane.showMessageDialog(null, "NIK sudah digunakan");
                                txt_nik.requestFocus();
                                txt_nik.selectAll();
                            } else {
                                
                            }
                        } catch (Exception e) {
                            JOptionPane.showConfirmDialog(this, e);
                        }
                }
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(this, e);
            }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        txt_nik = new javax.swing.JTextField();
        txt_nama = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_alamat = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_telepon = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_password = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("HALAMAN REGISTRASI");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        txt_nik.setBackground(new java.awt.Color(0, 255, 255));
        txt_nik.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_nik.setText("nik");
        txt_nik.setBorder(null);
        txt_nik.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_nikFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_nikFocusLost(evt);
            }
        });
        txt_nik.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nikKeyTyped(evt);
            }
        });
        getContentPane().add(txt_nik, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 320, 40));

        txt_nama.setBackground(new java.awt.Color(0, 255, 255));
        txt_nama.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_nama.setText("nama");
        txt_nama.setBorder(null);
        txt_nama.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_namaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_namaFocusLost(evt);
            }
        });
        getContentPane().add(txt_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 320, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/textbox.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 350, -1));

        txt_alamat.setBackground(new java.awt.Color(0, 255, 255));
        txt_alamat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_alamat.setText("alamat");
        txt_alamat.setBorder(null);
        txt_alamat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_alamatFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_alamatFocusLost(evt);
            }
        });
        getContentPane().add(txt_alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 320, 40));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/textbox.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 350, -1));

        txt_telepon.setBackground(new java.awt.Color(0, 255, 255));
        txt_telepon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_telepon.setText("telepon");
        txt_telepon.setBorder(null);
        txt_telepon.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_teleponFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_teleponFocusLost(evt);
            }
        });
        getContentPane().add(txt_telepon, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 320, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/textbox.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 350, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/textbox.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 350, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/btn-daftar.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, -1, -1));

        txt_username.setBackground(new java.awt.Color(0, 255, 255));
        txt_username.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_username.setText("username");
        txt_username.setBorder(null);
        txt_username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_usernameFocusLost(evt);
            }
        });
        getContentPane().add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 320, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/textbox.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 350, -1));

        txt_password.setBackground(new java.awt.Color(0, 255, 255));
        txt_password.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_password.setText("password");
        txt_password.setBorder(null);
        txt_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_passwordFocusLost(evt);
            }
        });
        getContentPane().add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 320, 40));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/textbox.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 350, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/unnamed.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 564, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nikFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_nikFocusGained
        if (txt_nik.getText().equals("nik")){
            txt_nik.setText(null);
            txt_nik.requestFocus();
            hilang(txt_nik);
        }
    }//GEN-LAST:event_txt_nikFocusGained

    private void txt_nikFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_nikFocusLost
        if (txt_nik.getText().length()==0){
            muncul(txt_nik);
            txt_nik.setText("nik");
        }
    }//GEN-LAST:event_txt_nikFocusLost

    private void txt_namaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_namaFocusGained
        if (txt_nama.getText().equals("nama")){
            txt_nama.setText(null);
            txt_nama.requestFocus();
            hilang(txt_nama);
        }
    }//GEN-LAST:event_txt_namaFocusGained

    private void txt_namaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_namaFocusLost
        if (txt_nama.getText().length()==0){
            muncul(txt_nama);
            txt_nama.setText("nama");
        }
    }//GEN-LAST:event_txt_namaFocusLost

    private void txt_alamatFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_alamatFocusGained
        if (txt_alamat.getText().equals("alamat")){
            txt_alamat.setText(null);
            txt_alamat.requestFocus();
            hilang(txt_alamat);
        }
    }//GEN-LAST:event_txt_alamatFocusGained

    private void txt_alamatFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_alamatFocusLost
        if (txt_alamat.getText().length()==0){
            muncul(txt_alamat);
            txt_alamat.setText("alamat");
        }
    }//GEN-LAST:event_txt_alamatFocusLost

    private void txt_teleponFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_teleponFocusGained
        if (txt_telepon.getText().equals("telepon")){
            txt_telepon.setText(null);
            txt_telepon.requestFocus();
            hilang(txt_telepon);
        }
    }//GEN-LAST:event_txt_teleponFocusGained

    private void txt_teleponFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_teleponFocusLost
        if (txt_telepon.getText().length()==0){
            muncul(txt_telepon);
            txt_telepon.setText("telepon");
        }
    }//GEN-LAST:event_txt_teleponFocusLost

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        if (txt_nik.getText().equals("nik")){
            JOptionPane.showMessageDialog(null, "Masukkan nik");
            txt_nik.requestFocus();
        } else
        if (txt_nama.getText().equals("nama")){
            JOptionPane.showMessageDialog(null, "Masukkan nama");
            txt_nama.requestFocus();
        } else
        if (txt_alamat.getText().equals("alamat")){
            JOptionPane.showMessageDialog(null, "Masukkan alamat");
            txt_alamat.requestFocus();
        } else
        if (txt_telepon.getText().equals("telepon")){
            JOptionPane.showMessageDialog(null, "Masukkan telepon");
            txt_telepon.requestFocus();
        } else
        if (txt_username.getText().equals("username")) {
            JOptionPane.showMessageDialog(null, "Masukkan username");
            txt_username.requestFocus();
        } else
        if (txt_password.getText().equals("password")) {
            JOptionPane.showMessageDialog(null, "Masukkan password");
            txt_password.requestFocus();
        } else
        if (txt_nik.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Masukkan nik");
            txt_nik.requestFocus();
        } else
        if (txt_nama.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Masukkan nama");
            txt_nama.requestFocus();
        } else
        if (txt_alamat.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Masukkan alamat");
            txt_alamat.requestFocus();
        } else
        if (txt_telepon.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Masukkan telepon");
            txt_telepon.requestFocus();
        } else
        if (txt_password.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Masukkan password");
            txt_password.requestFocus();
        } else
        {
            cekuser();
            tambahData();
            JOptionPane.showMessageDialog(null, "Pendaftaran Berhasil");
            this.dispose();
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void txt_usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_usernameFocusGained
        if (txt_username.getText().equals("username")){
            txt_username.setText(null);
            txt_username.requestFocus();
            hilang(txt_username);
        }
    }//GEN-LAST:event_txt_usernameFocusGained

    private void txt_usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_usernameFocusLost
        if (txt_username.getText().length()==0){
            muncul(txt_username);
            txt_username.setText("username");
        }
    }//GEN-LAST:event_txt_usernameFocusLost

    private void txt_passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_passwordFocusGained
        if (txt_password.getText().equals("password")){
            txt_password.setText(null);
            txt_password.requestFocus();
            hilang(txt_password);
        }
    }//GEN-LAST:event_txt_passwordFocusGained

    private void txt_passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_passwordFocusLost
        if (txt_password.getText().length()==0){
            muncul(txt_password);
            txt_password.setText("password");
        }
    }//GEN-LAST:event_txt_passwordFocusLost

    private void txt_nikKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nikKeyTyped
        char karakter = evt.getKeyChar();
        if (!(Character.isDigit(karakter))){
            evt.consume();
        }
    }//GEN-LAST:event_txt_nikKeyTyped

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
            java.util.logging.Logger.getLogger(FRegis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRegis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRegis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRegis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRegis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txt_alamat;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_nik;
    private javax.swing.JTextField txt_password;
    private javax.swing.JTextField txt_telepon;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
