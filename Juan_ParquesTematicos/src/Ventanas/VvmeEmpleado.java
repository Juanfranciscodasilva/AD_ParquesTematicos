package Ventanas;

import Clases.Empleado;
import Clases.Response;
import java.awt.event.MouseListener;
import juan_parquestematicos.Main;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.InputMap;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

public class VvmeEmpleado extends javax.swing.JFrame {
    private Empleado e;
    private List<Empleado> listaEmpleados;
    private List<Empleado> listaEmpleFiltrados;
    private int opcion;
    public VvmeEmpleado() {
        initComponents();
        setLocationRelativeTo(null);
        tNombre.setEditable(false);
        tApellido.setEditable(false);
        tNacimiento.setEditable(false);
        tNacionalidad.setEditable(false);
        tContratacion.setEditable(false);
        tCargo.setEditable(false);
        MouseListener[] ml = (MouseListener[])ckBaja.getListeners(MouseListener.class);
        for (int i = 0; i < ml.length; i++)
            ckBaja.removeMouseListener( ml[i] );
        InputMap im = ckBaja.getInputMap();
        im.put(KeyStroke.getKeyStroke("SPACE"), "none");
        im.put(KeyStroke.getKeyStroke("released SPACE"), "none");
        this.listaEmpleados = new ArrayList<>();
        listaEmpleFiltrados = new ArrayList<>();
        bEliminarModificar.setEnabled(false);
    }
    
    public VvmeEmpleado(int opcion, List<Empleado> listaEmpleados) {
        initComponents();
        setLocationRelativeTo(null);
        tNombre.setEditable(false);
        tApellido.setEditable(false);
        tNacimiento.setEditable(false);
        tNacionalidad.setEditable(false);
        tContratacion.setEditable(false);
        tCargo.setEditable(false);
        MouseListener[] ml = (MouseListener[])ckBaja.getListeners(MouseListener.class);
        for (int i = 0; i < ml.length; i++)
            ckBaja.removeMouseListener( ml[i] );
        InputMap im = ckBaja.getInputMap();
        im.put(KeyStroke.getKeyStroke("SPACE"), "none");
        im.put(KeyStroke.getKeyStroke("released SPACE"), "none");
        this.opcion = opcion;
        this.listaEmpleados = listaEmpleados;
        listaEmpleFiltrados = new ArrayList<>();
        AjustarVentanaOpcion();
        rellenarComboEmpleados();
        bEliminarModificar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbDNI = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tApellido = new javax.swing.JTextField();
        tNacimiento = new javax.swing.JTextField();
        bEliminarModificar = new javax.swing.JButton();
        bCancelarCerrar = new javax.swing.JButton();
        eTitulo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tNacionalidad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tContratacion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tCargo = new javax.swing.JTextField();
        ckBaja = new javax.swing.JCheckBox();
        ckMostrarBaja = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDNIActionPerformed(evt);
            }
        });

        jLabel2.setText("DNI");

        jLabel3.setText("Nombre");

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
        eTitulo.setText("Info. empleados registrados");

        jLabel7.setText("Nacionalidad");

        jLabel8.setText("Contratación");

        jLabel9.setText("Cargo");

        ckBaja.setText("Dado de baja");
        ckBaja.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        ckMostrarBaja.setText("Mostrar también empleados dados de baja");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(eTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bEliminarModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addComponent(bCancelarCerrar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tCargo)
                                .addComponent(tContratacion)))
                        .addComponent(ckBaja)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ckMostrarBaja)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tNacimiento)
                                    .addComponent(cbDNI, 0, 242, Short.MAX_VALUE)
                                    .addComponent(tNombre)
                                    .addComponent(tApellido)
                                    .addComponent(tNacionalidad, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(eTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tContratacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addComponent(ckBaja)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bEliminarModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCancelarCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCancelarCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarCerrarActionPerformed
        Main.cerrarVMEEmpleado();
    }//GEN-LAST:event_bCancelarCerrarActionPerformed

    private void bEliminarModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarModificarActionPerformed
        if(this.opcion==0){
            if(e.getListaEspectaculos() != null && !e.getListaEspectaculos().isEmpty()){
                JOptionPane.showMessageDialog(null, "Este empleado tiene espectáculos a cargo, reemplácelo antes de dar de baja.","", JOptionPane.WARNING_MESSAGE);
                return;
            }
            int eleccion = JOptionPane.showConfirmDialog(null, "Se va a dar de baja el empleado ¿Prefieres dar de baja eliminando completamente al empleado? ", "Dar de baja o eliminar completamente", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
            if(eleccion == 0){
                Response respuesta = Main.eliminarEmpleado(e); 
                if(respuesta != null){
                    if(!respuesta.isCorrecto()){
                        JOptionPane.showMessageDialog(null, respuesta.getMensajeError(),"", JOptionPane.ERROR_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(null, "Se ha eliminado el empleado correctamente.");
                        Main.cerrarVMEEmpleado();
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error inesperado. Vuelve a intentarlo.","", JOptionPane.ERROR_MESSAGE);
                }
            }else if(eleccion == 1){
                e.setBaja(true);
                Response respuesta = Main.modificarEmpleado(e); 
                if(respuesta != null){
                    if(!respuesta.isCorrecto()){
                        JOptionPane.showMessageDialog(null,respuesta.getMensajeError(),"", JOptionPane.ERROR_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(null, "Se ha dado de baja el empleado correctamente.");
                        Main.cerrarVMEEmpleado();
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error inesperado. Vuelve a intentarlo.","", JOptionPane.ERROR_MESSAGE);
                }
            }
        }else if(opcion==1){
            Main.abrirModificarEmpleado(e);
        }
    }//GEN-LAST:event_bEliminarModificarActionPerformed

    private void cbDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDNIActionPerformed
        int index = cbDNI.getSelectedIndex()-1;
        Empleado emple = null;
        if(index > -1){
            emple = this.listaEmpleFiltrados.get(index);
        }
        if(emple == null){
            LimpiarCampos();
            bEliminarModificar.setEnabled(false);
        }else{
            this.e = emple;
            AutocompletarDatos();
            bEliminarModificar.setEnabled(true);
        }
    }//GEN-LAST:event_cbDNIActionPerformed

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
            java.util.logging.Logger.getLogger(VvmeEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VvmeEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VvmeEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VvmeEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new VvmeEmpleado().setVisible(true);
            }
        });
    }
    
    public void AjustarVentanaOpcion(){
        if(this.opcion == 0){
            eTitulo.setText("Baja de empleado");
            bEliminarModificar.setText("Dar de baja");
        }else if(this.opcion == 1){
            eTitulo.setText("Modificar empleado");
            bEliminarModificar.setText("Modificar");
        }else{
            bEliminarModificar.setVisible(false);
            bCancelarCerrar.setText("Cerrar");
            eTitulo.setText("Info. empleados registrados");
        }
    }
    
    public void rellenarComboEmpleados(){
        cbDNI.removeAllItems();
        listaEmpleFiltrados = new ArrayList<>();
        if(this.listaEmpleados != null && !this.listaEmpleados.isEmpty()){
             cbDNI.addItem("-----Elegir empleado-----");
            try{
                for(Empleado emple : this.listaEmpleados){
                    if((emple.isBaja() && ckMostrarBaja.isSelected()) || !emple.isBaja()){
                        cbDNI.addItem(emple.getDni());
                        listaEmpleFiltrados.add(emple);
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
        tNacionalidad.setText("");
        tContratacion.setText("");
        tCargo.setText("");
        ckBaja.setSelected(false);
    }
    
    public void AutocompletarDatos(){
        DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        tNombre.setText(e.getNombre());
        tApellido.setText(e.getApellido1());
        tNacimiento.setText(formato.format(e.getFechaNacimiento()));
        tNacionalidad.setText(e.getNacionalidad());
        tContratacion.setText(formato.format(e.getFechaContratacion()));
        tCargo.setText(e.getCargo());
        ckBaja.setSelected(e.isBaja());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancelarCerrar;
    private javax.swing.JButton bEliminarModificar;
    private javax.swing.JComboBox<String> cbDNI;
    private javax.swing.JCheckBox ckBaja;
    private javax.swing.JCheckBox ckMostrarBaja;
    private javax.swing.JLabel eTitulo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField tApellido;
    private javax.swing.JTextField tCargo;
    private javax.swing.JTextField tContratacion;
    private javax.swing.JTextField tNacimiento;
    private javax.swing.JTextField tNacionalidad;
    private javax.swing.JTextField tNombre;
    // End of variables declaration//GEN-END:variables

}
