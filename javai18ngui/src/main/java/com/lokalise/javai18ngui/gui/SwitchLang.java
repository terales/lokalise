/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lokalise.javai18ngui.gui;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author Dasun Nirmitha
 */
public class SwitchLang extends javax.swing.JFrame {

    /**
     * Creates new form SwitchLang
     */
    public SwitchLang() {
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

        jLabelHello = new javax.swing.JLabel();
        jLabelWelcome = new javax.swing.JLabel();
        jButtonOk = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jButtonSwitchLang = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Form"); // NOI18N

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("bundle"); // NOI18N
        jLabelHello.setText(bundle.getString("SwitchLang.jLabelHello.text")); // NOI18N
        jLabelHello.setName("jLabelHello"); // NOI18N

        jLabelWelcome.setText(bundle.getString("SwitchLang.jLabelWelcome.text")); // NOI18N
        jLabelWelcome.setName("jLabelWelcome"); // NOI18N

        jButtonOk.setText(bundle.getString("SwitchLang.jButtonOk.text")); // NOI18N
        jButtonOk.setName("jButtonOk"); // NOI18N

        jButtonCancel.setText(bundle.getString("SwitchLang.jButtonCancel.text")); // NOI18N
        jButtonCancel.setName("jButtonCancel"); // NOI18N

        jButtonSwitchLang.setText(bundle.getString("SwitchLang.jButtonSwitchLang.text")); // NOI18N
        jButtonSwitchLang.setName("jButtonSwitchLang"); // NOI18N
        jButtonSwitchLang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSwitchLangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(206, 206, 206)
                            .addComponent(jLabelHello)
                            .addGap(46, 46, 46))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(181, 181, 181)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButtonSwitchLang)
                                .addComponent(jButtonCancel))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jButtonOk))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jLabelWelcome)))
                .addContainerGap(168, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabelHello)
                .addGap(18, 18, 18)
                .addComponent(jLabelWelcome)
                .addGap(27, 27, 27)
                .addComponent(jButtonOk)
                .addGap(18, 18, 18)
                .addComponent(jButtonCancel)
                .addGap(43, 43, 43)
                .addComponent(jButtonSwitchLang)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSwitchLangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSwitchLangActionPerformed
        Locale locale_it_IT = new Locale("it", "IT");
        ResourceBundle resourceBundleIT = ResourceBundle.getBundle("bundle", locale_it_IT);
        
        jLabelHello.setText(resourceBundleIT.getString("SwitchLang.jLabelHello.text"));
        jLabelWelcome.setText(resourceBundleIT.getString("SwitchLang.jLabelWelcome.text"));
        jButtonOk.setText(resourceBundleIT.getString("SwitchLang.jButtonOk.text"));
        jButtonCancel.setText(resourceBundleIT.getString("SwitchLang.jButtonCancel.text"));
        jButtonSwitchLang.setText(resourceBundleIT.getString("SwitchLang.jButtonSwitchLang.text"));
    }//GEN-LAST:event_jButtonSwitchLangActionPerformed

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
            java.util.logging.Logger.getLogger(SwitchLang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SwitchLang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SwitchLang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SwitchLang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SwitchLang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonOk;
    private javax.swing.JButton jButtonSwitchLang;
    private javax.swing.JLabel jLabelHello;
    private javax.swing.JLabel jLabelWelcome;
    // End of variables declaration//GEN-END:variables
}
