/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentación;

/**
 *
 * @author micae
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
       
        Main M = new Main();
        M.setVisible(true);
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGestionarUsuarios = new javax.swing.JButton();
        lblGestionarUsuarios = new javax.swing.JLabel();
        btnGestionarBD = new javax.swing.JButton();
        lblGestionarBD = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGestionarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentación/Imágenes/íconoUsuario.png"))); // NOI18N
        getContentPane().add(btnGestionarUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 43, -1, -1));

        lblGestionarUsuarios.setText("Gestionar usuarios");
        getContentPane().add(lblGestionarUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 187, -1, -1));

        btnGestionarBD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentación/Imágenes/íconoBD.png"))); // NOI18N
        btnGestionarBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarBDActionPerformed(evt);
            }
        });
        getContentPane().add(btnGestionarBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 43, -1, 132));

        lblGestionarBD.setText("Gestionar BD");
        lblGestionarBD.setToolTipText("");
        getContentPane().add(lblGestionarBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 187, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGestionarBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarBDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionarBDActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGestionarBD;
    private javax.swing.JButton btnGestionarUsuarios;
    private javax.swing.JLabel lblGestionarBD;
    private javax.swing.JLabel lblGestionarUsuarios;
    // End of variables declaration//GEN-END:variables
}
