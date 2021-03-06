/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;
import javax.swing.SwingUtilities;
import main.CalonTerpilih;
/**
 *
 * @author akhfa
 */
public class FormAdmin extends javax.swing.JFrame{

    /**
     * Creates new form FormAdmin
     */
    private CalonTerpilih DaftarPilihan;
    private Object AWTUtilities;
    
    public FormAdmin() {
        initComponents();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TombolDapil = new javax.swing.JButton();
        TombolDPR = new javax.swing.JButton();
        TombolDPD = new javax.swing.JButton();
        TombolDPRDProv = new javax.swing.JButton();
        TombolDPRDKotKab = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/shutterstock_47142253.jpg"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/shutterstock_47142253.jpg"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/shutterstock_47142253.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TombolDapil.setBackground(java.awt.SystemColor.inactiveCaptionText);
        TombolDapil.setFont(new java.awt.Font("Belwe Bd BT", 0, 18)); // NOI18N
        TombolDapil.setForeground(new java.awt.Color(255, 153, 102));
        TombolDapil.setText("Daerah Pemilihan");
        TombolDapil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolDapilActionPerformed(evt);
            }
        });
        getContentPane().add(TombolDapil, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 240, 40));

        TombolDPR.setBackground(java.awt.SystemColor.inactiveCaptionText);
        TombolDPR.setFont(new java.awt.Font("Belwe Bd BT", 0, 18)); // NOI18N
        TombolDPR.setForeground(new java.awt.Color(255, 153, 102));
        TombolDPR.setText("DPR");
        TombolDPR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolDPRActionPerformed(evt);
            }
        });
        getContentPane().add(TombolDPR, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 240, 40));

        TombolDPD.setBackground(java.awt.SystemColor.inactiveCaptionText);
        TombolDPD.setFont(new java.awt.Font("Belwe Bd BT", 0, 18)); // NOI18N
        TombolDPD.setForeground(new java.awt.Color(255, 153, 102));
        TombolDPD.setText("DPD");
        TombolDPD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolDPDActionPerformed(evt);
            }
        });
        getContentPane().add(TombolDPD, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 240, 40));

        TombolDPRDProv.setBackground(java.awt.SystemColor.inactiveCaptionText);
        TombolDPRDProv.setFont(new java.awt.Font("Belwe Bd BT", 0, 18)); // NOI18N
        TombolDPRDProv.setForeground(new java.awt.Color(255, 153, 102));
        TombolDPRDProv.setText("DPRD Provinsi");
        TombolDPRDProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolDPRDProvActionPerformed(evt);
            }
        });
        getContentPane().add(TombolDPRDProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 240, 40));

        TombolDPRDKotKab.setBackground(java.awt.SystemColor.inactiveCaptionText);
        TombolDPRDKotKab.setFont(new java.awt.Font("Belwe Bd BT", 0, 18)); // NOI18N
        TombolDPRDKotKab.setForeground(new java.awt.Color(255, 153, 102));
        TombolDPRDKotKab.setText("DPRD Kota/Kabupaten");
        TombolDPRDKotKab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolDPRDKotKabActionPerformed(evt);
            }
        });
        getContentPane().add(TombolDPRDKotKab, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, 240, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/shutterstock_47142253.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 140));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/shutterstock_47142253.jpg"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 590, 460));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/shutterstock_47142253.jpg"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 590, 110));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TombolDPRDKotKabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolDPRDKotKabActionPerformed
        // TODO add your handling code here:
        this.dispose();
        FormCaleg FC = new FormCaleg("DPRDKabupaten");
        FC.setVisible(true);
    }//GEN-LAST:event_TombolDPRDKotKabActionPerformed

    private void TombolDPRDProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolDPRDProvActionPerformed
        // TODO add your handling code here:
        this.dispose();
        FormCaleg FC = new FormCaleg("DPRDProvinsi");
        FC.setVisible(true);
    }//GEN-LAST:event_TombolDPRDProvActionPerformed

    private void TombolDPDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolDPDActionPerformed
        // TODO add your handling code here:
        this.dispose();
        FormCaleg FC = new FormCaleg("DPD");
        FC.setVisible(true);
    }//GEN-LAST:event_TombolDPDActionPerformed

    private void TombolDPRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolDPRActionPerformed
        // TODO add your handling code here:
        this.dispose();
        FormCaleg FC = new FormCaleg("DPR");
        FC.setVisible(true);
    }//GEN-LAST:event_TombolDPRActionPerformed

    private void TombolDapilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolDapilActionPerformed
        // TODO add your handling code here:
        this.dispose();
        FormDapil FD = new FormDapil();
        FD.setVisible(true);
        //this.setVisible(true);

    }//GEN-LAST:event_TombolDapilActionPerformed

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
            java.util.logging.Logger.getLogger(FormAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton TombolDPD;
    private javax.swing.JButton TombolDPR;
    private javax.swing.JButton TombolDPRDKotKab;
    private javax.swing.JButton TombolDPRDProv;
    private javax.swing.JButton TombolDapil;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
