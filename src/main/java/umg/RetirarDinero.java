/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package umg;

import logicaInterna.LogicaInternaRetirarDinero;

/**
 *
 * @author PC
 */
public class RetirarDinero extends javax.swing.JFrame {

    /**
     * Creates new form RetirarDinero
     */
    public RetirarDinero() {
        initComponents();
        this.setTitle("Retirar Dinero");
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        RetirarDinero = new javax.swing.JButton();
        RegresarMenu = new javax.swing.JButton();
        retirarMontoDinero = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        NumeroCuenta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TitularCuenta = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Retirar Dinero");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setText("Monto a retirar");

        RetirarDinero.setText("Retirar");
        RetirarDinero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetirarDineroActionPerformed(evt);
            }
        });

        RegresarMenu.setText("Regresar al menú");
        RegresarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarMenuActionPerformed(evt);
            }
        });

        jLabel3.setText("Numero de cuenta");

        NumeroCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumeroCuentaActionPerformed(evt);
            }
        });

        jLabel4.setText("Titular de la cuenta");

        TitularCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TitularCuentaActionPerformed(evt);
            }
        });

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RegresarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RetirarDinero)
                .addGap(68, 68, 68))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                                .addComponent(TitularCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(37, 37, 37))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(retirarMontoDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(buscar)
                        .addGap(13, 13, 13)))
                .addGap(48, 48, 48))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(jLabel3)
                    .addContainerGap(333, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(240, Short.MAX_VALUE)
                    .addComponent(NumeroCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(41, 41, 41)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TitularCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(buscar)
                .addGap(46, 46, 46)
                .addComponent(jLabel2)
                .addGap(3, 3, 3)
                .addComponent(retirarMontoDinero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RetirarDinero)
                    .addComponent(RegresarMenu))
                .addGap(42, 42, 42))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(111, 111, 111)
                    .addComponent(jLabel3)
                    .addContainerGap(266, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(108, 108, 108)
                    .addComponent(NumeroCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(263, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarMenuActionPerformed


       MenuPrincipalCo menu = new  MenuPrincipalCo ();
       this.setVisible(false);
       menu.setVisible(true);

    }//GEN-LAST:event_RegresarMenuActionPerformed

    private void NumeroCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumeroCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumeroCuentaActionPerformed

    private void TitularCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TitularCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TitularCuentaActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        LogicaInternaRetirarDinero buscar = new LogicaInternaRetirarDinero();
        buscar.buscarNumeroCuenta(NumeroCuenta.getText());
        if (buscar.getClienteEncontrado() == true) {
            String parte1 = buscar.getNombreCliente();
            String parte2 = buscar.getApellidoCliente();
            TitularCuenta.setText(parte1 + " " + parte2);
        }else{
            TitularCuenta.setText("Cuenta  no encontrado");
        }

    }//GEN-LAST:event_buscarActionPerformed

    private void RetirarDineroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetirarDineroActionPerformed
       LogicaInternaRetirarDinero retirar = new LogicaInternaRetirarDinero();
       retirar.retirar(NumeroCuenta.getText(), retirarMontoDinero.getText());
    
    }//GEN-LAST:event_RetirarDineroActionPerformed

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
            java.util.logging.Logger.getLogger(RetirarDinero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RetirarDinero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RetirarDinero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RetirarDinero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RetirarDinero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NumeroCuenta;
    private javax.swing.JButton RegresarMenu;
    private javax.swing.JButton RetirarDinero;
    private javax.swing.JTextField TitularCuenta;
    private javax.swing.JButton buscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField retirarMontoDinero;
    // End of variables declaration//GEN-END:variables
}
