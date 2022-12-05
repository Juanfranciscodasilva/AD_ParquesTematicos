/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.Cliente;
import Clases.Empleado;
import Clases.Espectaculo;
import juan_parquestematicos.Main;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author iBaD
 */
public class VVerEspectaculosDeEmpleado extends javax.swing.JFrame {
    
    private Empleado empleadoSeleccionado;
    private List<Empleado> listaEmpleados;
    private List<Empleado> listaEmpleadosFiltrada;
    
    public VVerEspectaculosDeEmpleado() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public VVerEspectaculosDeEmpleado(List<Empleado> empleados){
        initComponents();
        setLocationRelativeTo(null);
        this.listaEmpleados = empleados;
        this.listaEmpleadosFiltrada = new ArrayList<>();
        RellenarComboEmpleados();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btCerrar = new javax.swing.JButton();
        ckMostrarBaja = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        cbDni = new javax.swing.JComboBox<>();
        eNombre = new javax.swing.JLabel();
        tApellido = new javax.swing.JTextField();
        eNombre1 = new javax.swing.JLabel();
        tNombre = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tEspectaculos = new javax.swing.JTextArea();
        eNombre2 = new javax.swing.JLabel();
        tNacimiento = new javax.swing.JTextField();
        eNombre3 = new javax.swing.JLabel();
        tContratacion = new javax.swing.JTextField();
        tNacionalidad = new javax.swing.JTextField();
        eNombre4 = new javax.swing.JLabel();
        eNombre5 = new javax.swing.JLabel();
        tCargo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Espectáculos del empleado");

        btCerrar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btCerrar.setText("Cerrar");
        btCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCerrarActionPerformed(evt);
            }
        });

        ckMostrarBaja.setText("Mostrar también empleados dados de baja");
        ckMostrarBaja.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ckMostrarBajaItemStateChanged(evt);
            }
        });

        jLabel2.setText("DNI:");

        cbDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDniActionPerformed(evt);
            }
        });

        eNombre.setText("Apellido:");

        tApellido.setEditable(false);

        eNombre1.setText("Nombre:");

        tNombre.setEditable(false);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Espectáculos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N

        tEspectaculos.setEditable(false);
        tEspectaculos.setColumns(20);
        tEspectaculos.setRows(5);
        jScrollPane1.setViewportView(tEspectaculos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                .addContainerGap())
        );

        eNombre2.setText("Nacimiento:");

        tNacimiento.setEditable(false);

        eNombre3.setText("Fecha contrato:");

        tContratacion.setEditable(false);

        tNacionalidad.setEditable(false);

        eNombre4.setText("Nacionalidad:");

        eNombre5.setText("Cargo:");

        tCargo.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(eNombre1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tNombre))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(eNombre)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(eNombre2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(eNombre3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tContratacion, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(eNombre5)
                                    .addComponent(eNombre4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(btCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ckMostrarBaja)
                    .addComponent(cbDni, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(ckMostrarBaja)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eNombre1)
                    .addComponent(eNombre3)
                    .addComponent(tContratacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eNombre)
                    .addComponent(tApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eNombre4)
                    .addComponent(tNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(eNombre2)
                        .addComponent(tNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(eNombre5)
                        .addComponent(tCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btCerrar)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCerrarActionPerformed
        Main.cerrarVerEspectaculosDeEmpleado();
    }//GEN-LAST:event_btCerrarActionPerformed

    private void ckMostrarBajaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ckMostrarBajaItemStateChanged
        RellenarComboEmpleados();
    }//GEN-LAST:event_ckMostrarBajaItemStateChanged

    private void cbDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDniActionPerformed
        int index = cbDni.getSelectedIndex()-1;
        Empleado emple = null;
        if(index > -1){
            emple = this.listaEmpleadosFiltrada.get(index);
        }
        if(emple == null){
            LimpiarCampos();
        }else{
            this.empleadoSeleccionado = emple;
            AutocompletarDatosEmpleado();
        }
    }//GEN-LAST:event_cbDniActionPerformed

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
            java.util.logging.Logger.getLogger(VVerEspectaculosDeEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VVerEspectaculosDeEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VVerEspectaculosDeEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VVerEspectaculosDeEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new VVerEspectaculosDeEmpleado().setVisible(true);
            }
        });
    }
    
    public void LimpiarCampos(){
        tNombre.setText("");
        tApellido.setText("");
        tNacimiento.setText("");
        tContratacion.setText("");
        tNacionalidad.setText("");
        tCargo.setText("");
        tEspectaculos.setText("");
    }
    
     public void AutocompletarDatosEmpleado(){
         tNombre.setText(this.empleadoSeleccionado.getNombre());
        tApellido.setText(this.empleadoSeleccionado.getApellido1());
        tNacimiento.setText(this.empleadoSeleccionado.getFechaNacimiento().toString());
        tContratacion.setText(this.empleadoSeleccionado.getFechaContratacion().toString());
        tNacionalidad.setText(this.empleadoSeleccionado.getNacionalidad());
        tCargo.setText(this.empleadoSeleccionado.getCargo());
        StringBuilder textoEspectaculos = new StringBuilder();
        if(this.empleadoSeleccionado.getListaEspectaculos() != null && !this.empleadoSeleccionado.getListaEspectaculos().isEmpty()){
            textoEspectaculos.append("Espectáculos en responsabilidad del empleado:\n");
            for(Espectaculo espe : this.empleadoSeleccionado.getListaEspectaculos()){
                textoEspectaculos.append(espe.toString2());
                textoEspectaculos.append("\n");
            }
        }else{
            textoEspectaculos.append("Este empleado no está a cargo de ningún espectáculo.");
        }
        tEspectaculos.setText(textoEspectaculos.toString());
    }
     
     public void RellenarComboEmpleados(){
        cbDni.removeAllItems();
        listaEmpleadosFiltrada = new ArrayList<>();
        if(this.listaEmpleados != null && !this.listaEmpleados.isEmpty()){
             cbDni.addItem("-----Elegir empleado-----");
            try{
                for(Empleado e : this.listaEmpleados){
                    if((e.isBaja() && ckMostrarBaja.isSelected()) || !e.isBaja()){
                        cbDni.addItem(e.getDni());
                        listaEmpleadosFiltrada.add(e);
                    }
                }
            }catch(Exception e){
                System.out.println("ha ocurrido un error "+ e.getMessage());
            } 
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCerrar;
    private javax.swing.JComboBox<String> cbDni;
    private javax.swing.JCheckBox ckMostrarBaja;
    private javax.swing.JLabel eNombre;
    private javax.swing.JLabel eNombre1;
    private javax.swing.JLabel eNombre2;
    private javax.swing.JLabel eNombre3;
    private javax.swing.JLabel eNombre4;
    private javax.swing.JLabel eNombre5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tApellido;
    private javax.swing.JTextField tCargo;
    private javax.swing.JTextField tContratacion;
    private javax.swing.JTextArea tEspectaculos;
    private javax.swing.JTextField tNacimiento;
    private javax.swing.JTextField tNacionalidad;
    private javax.swing.JTextField tNombre;
    // End of variables declaration//GEN-END:variables
}
