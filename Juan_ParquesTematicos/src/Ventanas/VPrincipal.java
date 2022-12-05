
package Ventanas;

import Enum.PARQUES;
import juan_parquestematicos.Main;
import javax.swing.JOptionPane;


public class VPrincipal extends javax.swing.JFrame {

    public PARQUES agenciaSeleccionada;
    
    public VPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public VPrincipal(PARQUES agencia) {
        initComponents();
        setLocationRelativeTo(null);
        this.agenciaSeleccionada = agencia;
        if(agencia == PARQUES.Warner){
            eTitulo1.setText("Warner");
        }else if(agencia == PARQUES.Disney){
            eTitulo1.setText("Disney");
        }else{
            eTitulo1.setText("Universal");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        eTitulo1 = new javax.swing.JLabel();
        Salir = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        NuevoEspectaculo = new javax.swing.JMenuItem();
        ModificarEspectaculo = new javax.swing.JMenuItem();
        BajaEspectaculo = new javax.swing.JMenuItem();
        VerEspectaculo = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        AltaEmpleado = new javax.swing.JMenuItem();
        ModificarEmpleado = new javax.swing.JMenuItem();
        BajaEmpleado = new javax.swing.JMenuItem();
        EmpleadoVisitas = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        AltaCliente = new javax.swing.JMenuItem();
        ModificarCliente = new javax.swing.JMenuItem();
        BajaCliente = new javax.swing.JMenuItem();
        VerVisitasGuiadasDelCliente = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        DatosAgencia = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        eTitulo1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        eTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eTitulo1.setText("Universal");
        eTitulo1.setMaximumSize(new java.awt.Dimension(45, 62));

        Salir.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton3.setText("Cerrar Sesión");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jMenu1.setText("Espectáculos");

        NuevoEspectaculo.setText("Nuevo espectáculo");
        NuevoEspectaculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoEspectaculoActionPerformed(evt);
            }
        });
        jMenu1.add(NuevoEspectaculo);

        ModificarEspectaculo.setText("Modificar espectáculo");
        ModificarEspectaculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarEspectaculoActionPerformed(evt);
            }
        });
        jMenu1.add(ModificarEspectaculo);

        BajaEspectaculo.setText("Baja de espectáculo");
        BajaEspectaculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BajaEspectaculoActionPerformed(evt);
            }
        });
        jMenu1.add(BajaEspectaculo);

        VerEspectaculo.setText("Ver clientes del espectáculo");
        VerEspectaculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerEspectaculoActionPerformed(evt);
            }
        });
        jMenu1.add(VerEspectaculo);

        jMenuItem4.setText("Inscribir cliente en espectáculo");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu5.setText("Empleados");

        AltaEmpleado.setText("Alta de empleado");
        AltaEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltaEmpleadoActionPerformed(evt);
            }
        });
        jMenu5.add(AltaEmpleado);

        ModificarEmpleado.setText("Modificar empleado");
        ModificarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarEmpleadoActionPerformed(evt);
            }
        });
        jMenu5.add(ModificarEmpleado);

        BajaEmpleado.setText("Baja de empleado");
        BajaEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BajaEmpleadoActionPerformed(evt);
            }
        });
        jMenu5.add(BajaEmpleado);

        EmpleadoVisitas.setText("Espectáculos en responsabilidad");
        EmpleadoVisitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpleadoVisitasActionPerformed(evt);
            }
        });
        jMenu5.add(EmpleadoVisitas);

        jMenuBar1.add(jMenu5);

        jMenu2.setText("Clientes");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        AltaCliente.setText("Alta de cliente");
        AltaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltaClienteActionPerformed(evt);
            }
        });
        jMenu2.add(AltaCliente);

        ModificarCliente.setText("Modificar cliente");
        ModificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarClienteActionPerformed(evt);
            }
        });
        jMenu2.add(ModificarCliente);

        BajaCliente.setText("Baja de cliente");
        BajaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BajaClienteActionPerformed(evt);
            }
        });
        jMenu2.add(BajaCliente);

        VerVisitasGuiadasDelCliente.setText("Ver espectáculos del cliente");
        VerVisitasGuiadasDelCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerVisitasGuiadasDelClienteActionPerformed(evt);
            }
        });
        jMenu2.add(VerVisitasGuiadasDelCliente);

        jMenuItem5.setText("Inscribir en espectáculo");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        DatosAgencia.setText("Parque");

        jMenuItem3.setText("Datos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        DatosAgencia.add(jMenuItem3);

        jMenuBar1.add(DatosAgencia);

        jMenu3.setText("Salir");

        jMenuItem1.setText("Cerrar sesión");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 222, Short.MAX_VALUE)
                        .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(eTitulo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(eTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        Main.cerrarPrograma();
    }//GEN-LAST:event_SalirActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Main.cerrarSesion();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void BajaEspectaculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BajaEspectaculoActionPerformed
        Main.abrirVMEEspectaculo(0);
    }//GEN-LAST:event_BajaEspectaculoActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Main.cerrarPrograma();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Main.cerrarSesion();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void NuevoEspectaculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoEspectaculoActionPerformed
        Main.abrirCrearEspectaculo();
    }//GEN-LAST:event_NuevoEspectaculoActionPerformed

    private void ModificarEspectaculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarEspectaculoActionPerformed
        Main.abrirVMEEspectaculo(1);
    }//GEN-LAST:event_ModificarEspectaculoActionPerformed

    private void VerEspectaculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerEspectaculoActionPerformed
        Main.abrirVerClientesDeEspectaculo();
    }//GEN-LAST:event_VerEspectaculoActionPerformed

    private void ModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarClienteActionPerformed
        Main.abrirVMECliente(1);
    }//GEN-LAST:event_ModificarClienteActionPerformed

    private void BajaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BajaClienteActionPerformed
        Main.abrirVMECliente(0);
    }//GEN-LAST:event_BajaClienteActionPerformed

    private void VerVisitasGuiadasDelClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerVisitasGuiadasDelClienteActionPerformed
        Main.abrirVerEspectaculosDeCliente();
    }//GEN-LAST:event_VerVisitasGuiadasDelClienteActionPerformed

    private void AltaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AltaClienteActionPerformed
        Main.abrirCrearCliente();
    }//GEN-LAST:event_AltaClienteActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Main.abrirVentanaDatosParque();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void AltaEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AltaEmpleadoActionPerformed
        Main.abrirCrearEmpleado();
    }//GEN-LAST:event_AltaEmpleadoActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        Main.abrirVMECliente(0);
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void ModificarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarEmpleadoActionPerformed
        Main.abrirVMEEmpleado(1);
    }//GEN-LAST:event_ModificarEmpleadoActionPerformed

    private void BajaEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BajaEmpleadoActionPerformed
        Main.abrirVMEEmpleado(0);
    }//GEN-LAST:event_BajaEmpleadoActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        Main.abrirInscribirClienteEspectaculo();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        Main.abrirInscribirClienteEspectaculo();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void EmpleadoVisitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpleadoVisitasActionPerformed
        Main.abrirVerEspectaculosDeEmpleado();
    }//GEN-LAST:event_EmpleadoVisitasActionPerformed

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
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AltaCliente;
    private javax.swing.JMenuItem AltaEmpleado;
    private javax.swing.JMenuItem BajaCliente;
    private javax.swing.JMenuItem BajaEmpleado;
    private javax.swing.JMenuItem BajaEspectaculo;
    private javax.swing.JMenu DatosAgencia;
    private javax.swing.JMenuItem EmpleadoVisitas;
    private javax.swing.JMenuItem ModificarCliente;
    private javax.swing.JMenuItem ModificarEmpleado;
    private javax.swing.JMenuItem ModificarEspectaculo;
    private javax.swing.JMenuItem NuevoEspectaculo;
    private javax.swing.JButton Salir;
    private javax.swing.JMenuItem VerEspectaculo;
    private javax.swing.JMenuItem VerVisitasGuiadasDelCliente;
    private javax.swing.JLabel eTitulo1;
    private javax.swing.JButton jButton3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    // End of variables declaration//GEN-END:variables

    public void NoCampamentos() {
        JOptionPane.showMessageDialog(this,"No hay campamentos","", JOptionPane.WARNING_MESSAGE);
    }
    
    public void NoPersonas() {
        JOptionPane.showMessageDialog(this,"No hay personas registradas","", JOptionPane.WARNING_MESSAGE);
    }
}
