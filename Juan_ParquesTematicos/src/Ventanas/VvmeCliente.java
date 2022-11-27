package Ventanas;

import Clases.Cliente;
import Clases.Response;
import juan_parquestematicos.Main;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class VvmeCliente extends javax.swing.JFrame {
    private Cliente cli;
    private List<Cliente> listaClientes;
    private List<Cliente> listaClientesFlitrada;
    private int opcion;
    public VvmeCliente() {
        initComponents();
        setLocationRelativeTo(null);
        tNombre.setEditable(false);
        tApellido.setEditable(false);
        tNacimiento.setEditable(false);
        ckBaja.setEnabled(false);
        this.listaClientes = new ArrayList<>();
        bEliminarModificar.setEnabled(false);
    }
    
    public VvmeCliente(int opcion, List<Cliente> listaClientes) {
        initComponents();
        setLocationRelativeTo(null);
        tNombre.setEditable(false);
        tApellido.setEditable(false);
        tNacimiento.setEditable(false);
        ckBaja.setEnabled(false);
        this.opcion = opcion;
        this.listaClientes = listaClientes;
        AjustarVentanaOpcion();
        rellenarComboClientes();
        bEliminarModificar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbDNI = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tApellido = new javax.swing.JTextField();
        tNacimiento = new javax.swing.JTextField();
        bEliminarModificar = new javax.swing.JButton();
        bCancelarCerrar = new javax.swing.JButton();
        eTitulo = new javax.swing.JLabel();
        ckBaja = new java.awt.Checkbox();
        ckMostrarBaja = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDNIActionPerformed(evt);
            }
        });

        jLabel2.setText("DNI");

        jLabel3.setText("Nombre");

        jLabel4.setText("Dado de baja");

        jLabel5.setText("Apellido");

        jLabel6.setText("Nacimiento");

        bEliminarModificar.setText("Dar de baja");
        bEliminarModificar.setPreferredSize(new java.awt.Dimension(109, 23));
        bEliminarModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarModificarActionPerformed(evt);
            }
        });

        bCancelarCerrar.setText("Cancelar");
        bCancelarCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarCerrarActionPerformed(evt);
            }
        });

        eTitulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        eTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eTitulo.setText("Info. clientes registrados");

        ckBaja.setEnabled(false);

        ckMostrarBaja.setText("Mostrar también clientes de baja");
        ckMostrarBaja.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ckMostrarBajaItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(eTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(bEliminarModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bCancelarCerrar)
                .addGap(57, 57, 57))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ckMostrarBaja)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tNacimiento)
                        .addComponent(cbDNI, 0, 242, Short.MAX_VALUE)
                        .addComponent(tNombre)
                        .addComponent(tApellido)
                        .addComponent(ckBaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(eTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(ckMostrarBaja)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(ckBaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bEliminarModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCancelarCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCancelarCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarCerrarActionPerformed
        Main.cerrarVMECliente();
    }//GEN-LAST:event_bCancelarCerrarActionPerformed

    private void bEliminarModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarModificarActionPerformed
        if(this.opcion==0){
            int eleccion = JOptionPane.showConfirmDialog(null, "Se va a dar de baja el cliente ¿Prefieres dar de baja eliminando completamente al cliente? ", "Dar de baja o eliminar completamente", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
            if(eleccion == 0){
                Response respuesta = Main.eliminarCliente(cli); 
                if(respuesta != null){
                    if(!respuesta.isCorrecto()){
                        JOptionPane.showMessageDialog(null, respuesta.getMensajeError(),"", JOptionPane.ERROR_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(null, "Se ha eliminado el cliente correctamente.");
                        Main.cerrarVMECliente();
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error inesperado. Vuelve a intentarlo.","", JOptionPane.ERROR_MESSAGE);
                }
            }else if(eleccion == 1){
                cli.setBaja(true);
                Response respuesta = Main.modificarCliente(cli); 
                if(respuesta != null){
                    if(!respuesta.isCorrecto()){
                        JOptionPane.showMessageDialog(null,respuesta.getMensajeError(),"", JOptionPane.ERROR_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(null, "Se ha dado de baja el cliente correctamente.");
                        Main.cerrarVMECliente();
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error inesperado. Vuelve a intentarlo.","", JOptionPane.ERROR_MESSAGE);
                }
            }
        }else if(opcion==1){
            Main.abrirModificarCliente(cli);
        }
    }//GEN-LAST:event_bEliminarModificarActionPerformed

    private void cbDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDNIActionPerformed
        int index = cbDNI.getSelectedIndex()-1;
        Cliente cli = null;
        if(index > -1){
            cli = this.listaClientesFlitrada.get(index);
        }
        if(cli == null){
            LimpiarCampos();
            bEliminarModificar.setEnabled(false);
        }else{
            this.cli = cli;
            AutocompletarDatos();
            bEliminarModificar.setEnabled(true);
        }
    }//GEN-LAST:event_cbDNIActionPerformed

    private void ckMostrarBajaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ckMostrarBajaItemStateChanged
        rellenarComboClientes();
    }//GEN-LAST:event_ckMostrarBajaItemStateChanged

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
            java.util.logging.Logger.getLogger(VvmeCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VvmeCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VvmeCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VvmeCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new VvmeCliente().setVisible(true);
            }
        });
    }
    
    public void AjustarVentanaOpcion(){
        if(this.opcion == 0){
            eTitulo.setText("Baja de cliente");
            bEliminarModificar.setText("Dar de baja");
        }else if(this.opcion == 1){
            eTitulo.setText("Modificar cliente");
            bEliminarModificar.setText("Modificar");
        }else{
            bEliminarModificar.setVisible(false);
            bCancelarCerrar.setText("Cerrar");
            eTitulo.setText("Info. clientes registrados");
        }
    }
    
    public void rellenarComboClientes(){
        cbDNI.removeAllItems();
        listaClientesFlitrada = new ArrayList<>();
        if(this.listaClientes != null && !this.listaClientes.isEmpty()){
             cbDNI.addItem("-----Elegir cliente-----");
            try{
                for(Cliente cli : this.listaClientes){
                    if(cli.isBaja()){
                        if(ckMostrarBaja.isSelected()){
                            cbDNI.addItem(cli.getDni());
                            listaClientesFlitrada.add(cli);
                        }
                    }else{
                        cbDNI.addItem(cli.getDni());
                        listaClientesFlitrada.add(cli);
                    }
                }
            }catch(Exception e){
                System.out.println("ha ocurrido un error "+ e.getMessage());
            } 
        }
    }
    
    public void LimpiarCampos(){
        tNombre.setText("");
        tApellido.setText("");
        tNacimiento.setText("");
        ckBaja.setState(false);
    }
    
    public void AutocompletarDatos(){
        DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        tNombre.setText(cli.getNombre());
        tApellido.setText(cli.getApellido1());
        tNacimiento.setText(formato.format(cli.getFechaNacimiento()));
        ckBaja.setState(cli.isBaja());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancelarCerrar;
    private javax.swing.JButton bEliminarModificar;
    private javax.swing.JComboBox<String> cbDNI;
    private java.awt.Checkbox ckBaja;
    private javax.swing.JCheckBox ckMostrarBaja;
    private javax.swing.JLabel eTitulo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField tApellido;
    private javax.swing.JTextField tNacimiento;
    private javax.swing.JTextField tNombre;
    // End of variables declaration//GEN-END:variables

}
