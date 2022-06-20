/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package capapresentacion;

/**
 *
 * @author rubiw
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
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

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnAutomovil = new javax.swing.JMenu();
        btnMantenimiento = new javax.swing.JMenu();
        btnCliente = new javax.swing.JMenu();
        btnRegistroVenta = new javax.swing.JMenu();
        Factura = new javax.swing.JMenuItem();
        btnOpcionPago = new javax.swing.JMenu();
        btnPaquete = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 102));
        jPanel1.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 736, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 354, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(24, 24, 24));
        jMenuBar1.setMargin(new java.awt.Insets(15, 15, 15, 15));

        btnAutomovil.setBackground(new java.awt.Color(204, 255, 204));
        btnAutomovil.setText("Vendedor");
        btnAutomovil.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btnAutomovil.setMargin(new java.awt.Insets(3, 10, 3, 10));
        btnAutomovil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAutomovilMouseClicked(evt);
            }
        });
        jMenuBar1.add(btnAutomovil);

        btnMantenimiento.setText("Reserva");
        btnMantenimiento.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btnMantenimiento.setMargin(new java.awt.Insets(3, 10, 3, 10));
        btnMantenimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMantenimientoMouseClicked(evt);
            }
        });

        btnCliente.setText("Cliente");
        btnCliente.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btnCliente.setMargin(new java.awt.Insets(3, 10, 3, 10));
        btnCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClienteMouseClicked(evt);
            }
        });
        btnMantenimiento.add(btnCliente);

        btnRegistroVenta.setText("Registro de Venta");
        btnRegistroVenta.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btnRegistroVenta.setMargin(new java.awt.Insets(3, 10, 3, 10));
        btnRegistroVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistroVentaMouseClicked(evt);
            }
        });

        Factura.setText("Factura");
        Factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacturaActionPerformed(evt);
            }
        });
        btnRegistroVenta.add(Factura);

        btnMantenimiento.add(btnRegistroVenta);

        btnOpcionPago.setText("Opcion de Pago");
        btnOpcionPago.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btnOpcionPago.setMargin(new java.awt.Insets(3, 10, 3, 10));
        btnMantenimiento.add(btnOpcionPago);

        btnPaquete.setText("Paquete");
        btnPaquete.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btnPaquete.setMargin(new java.awt.Insets(3, 10, 3, 10));
        btnPaquete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPaqueteMouseClicked(evt);
            }
        });
        btnMantenimiento.add(btnPaquete);

        jMenuBar1.add(btnMantenimiento);

        jMenu1.setText("Gestion");

        jMenu2.setText("Gerente Operaciones");
        jMenu1.add(jMenu2);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Proveedores");

        jMenu4.setText("Administrador");
        jMenu3.add(jMenu4);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteMouseClicked
        capapresentacion.Mantenimiento.frmCliente cliente = new capapresentacion.Mantenimiento.frmCliente();
        cliente.show();
    }//GEN-LAST:event_btnClienteMouseClicked

    private void btnAutomovilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAutomovilMouseClicked
        capapresentacion.Mantenimiento.frmPaquete automovil = new capapresentacion.Mantenimiento.frmPaquete();
        automovil.show();
    }//GEN-LAST:event_btnAutomovilMouseClicked

    private void btnRegistroVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistroVentaMouseClicked
        capapresentacion.Mantenimiento.frmRegistro registro = new capapresentacion.Mantenimiento.frmRegistro();
        registro.show();
    }//GEN-LAST:event_btnRegistroVentaMouseClicked

    private void btnMantenimientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMantenimientoMouseClicked
        capapresentacion.Mantenimiento.frmMantenimiento mantenimiento = new capapresentacion.Mantenimiento.frmMantenimiento();
        mantenimiento.show();
    }//GEN-LAST:event_btnMantenimientoMouseClicked

    private void FacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FacturaActionPerformed

    private void btnPaqueteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPaqueteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPaqueteMouseClicked

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Factura;
    private javax.swing.JMenu btnAutomovil;
    private javax.swing.JMenu btnCliente;
    private javax.swing.JMenu btnMantenimiento;
    private javax.swing.JMenu btnOpcionPago;
    private javax.swing.JMenu btnPaquete;
    private javax.swing.JMenu btnRegistroVenta;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
