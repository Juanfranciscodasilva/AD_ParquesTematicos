package Ventanas;

import Clases.Empleado;
import Clases.Espectaculo;
import Clases.Response;
import java.util.ArrayList;
import juan_parquestematicos.Main;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class VvmeEspectaculo extends javax.swing.JFrame {
    
    private Espectaculo espec;
    private List<Espectaculo> listaEspectaculos;
    private List<Espectaculo> listaEspectaculosFiltrada;
    private int opcion;
   
    public VvmeEspectaculo() {
        initComponents();
        setLocationRelativeTo(null);
        this.listaEspectaculos =  new ArrayList<>();
        bModificarBaja.setEnabled(false);
    }
    
    public VvmeEspectaculo(int opcion, List<Espectaculo> listaEspectaculos) {
        initComponents();
        setLocationRelativeTo(null);
        this.opcion = opcion;
        this.listaEspectaculos = listaEspectaculos;
        AjustarVentanaOpcion();
        RellenarComboEspectaculos();
        bModificarBaja.setEnabled(false);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        tTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        eNombre = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tAforo = new javax.swing.JTextField();
        bModificarBaja = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tDescripcion = new javax.swing.JTextArea();
        eNombre1 = new javax.swing.JLabel();
        tLugar = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        tNombreEmpleado = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tApellidoEmpleado = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        JLabel = new javax.swing.JLabel();
        tCargoEmpleado = new javax.swing.JTextField();
        tDniEmpleado = new javax.swing.JTextField();
        cbNombre = new javax.swing.JComboBox<>();
        ckMostrarBaja = new javax.swing.JCheckBox();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tTitulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        tTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tTitulo.setText("Modificar espectáculo");

        jLabel2.setText("Nombre:");

        eNombre.setText("Aforo:");

        jLabel6.setText("Descripción:");

        tAforo.setEditable(false);

        bModificarBaja.setText("Dar de baja");
        bModificarBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModificarBajaActionPerformed(evt);
            }
        });

        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        tDescripcion.setEditable(false);
        tDescripcion.setColumns(20);
        tDescripcion.setLineWrap(true);
        tDescripcion.setRows(5);
        jScrollPane2.setViewportView(tDescripcion);

        eNombre1.setText("Lugar:");

        tLugar.setEditable(false);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Encargado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N

        jLabel8.setText("DNI:");

        tNombreEmpleado.setEditable(false);

        jLabel7.setText("Nombre:");

        tApellidoEmpleado.setEditable(false);

        jLabel9.setText("Apellido:");

        JLabel.setText("Cargo:");

        tCargoEmpleado.setEditable(false);

        tDniEmpleado.setEditable(false);
        tDniEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tDniEmpleadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tApellidoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel7))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tDniEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(JLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tCargoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tDniEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tApellidoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabel)
                    .addComponent(tCargoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        cbNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNombreActionPerformed(evt);
            }
        });

        ckMostrarBaja.setText("Mostrar también espectáculos dados de baja");
        ckMostrarBaja.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ckMostrarBajaItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(eNombre1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(32, 32, 32)
                                    .addComponent(eNombre))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel2)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ckMostrarBaja)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tAforo, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbNombre, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(bModificarBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(ckMostrarBaja)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tAforo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eNombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel6)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eNombre1))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bModificarBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        Main.cerrarVMEEspectaculo();
    }//GEN-LAST:event_bCancelarActionPerformed

    private void bModificarBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificarBajaActionPerformed
        if(this.opcion==0){
            int eleccion = JOptionPane.showConfirmDialog(null, "Se va a dar de baja el espectáculo ¿Prefieres dar de baja eliminandolo completamente? ", "Dar de baja o eliminar completamente", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
            if(eleccion == 0){
                Response respuesta = Main.eliminarEspectaculo(espec); 
                if(respuesta != null){
                    if(!respuesta.isCorrecto()){
                        JOptionPane.showMessageDialog(null, respuesta.getMensajeError(),"", JOptionPane.ERROR_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(null, "Se ha eliminado el espectáculo correctamente.");
                        Main.cerrarVMEEspectaculo();
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error inesperado. Vuelve a intentarlo.","", JOptionPane.ERROR_MESSAGE);
                }
            }else if(eleccion == 1){
                espec.setBaja(true);
                Response respuesta = Main.modificarEspectaculo(espec); 
                if(respuesta != null){
                    if(!respuesta.isCorrecto()){
                        JOptionPane.showMessageDialog(null,respuesta.getMensajeError(),"", JOptionPane.ERROR_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(null, "Se ha dado de baja el espectáculo correctamente.");
                        Main.cerrarVMEEspectaculo();
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error inesperado. Vuelve a intentarlo.","", JOptionPane.ERROR_MESSAGE);
                }
            }
        }else if(opcion==1){
            Main.abrirModificarEspectaculo(espec);
        }
    }//GEN-LAST:event_bModificarBajaActionPerformed

    private void cbNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNombreActionPerformed
        int index = cbNombre.getSelectedIndex()-1;
        Espectaculo es = null;
        if(index > -1){
            es = this.listaEspectaculosFiltrada.get(index);
        }
        if(es == null){
            LimpiarCampos();
            bModificarBaja.setEnabled(false);
        }else{
            this.espec = es;
            AutocompletarDatosEspectaculo();
            bModificarBaja.setEnabled(true);
        }
    }//GEN-LAST:event_cbNombreActionPerformed

    private void tDniEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tDniEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tDniEmpleadoActionPerformed

    private void ckMostrarBajaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ckMostrarBajaItemStateChanged
        RellenarComboEspectaculos();
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
            java.util.logging.Logger.getLogger(VvmeEspectaculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VvmeEspectaculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VvmeEspectaculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VvmeEspectaculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new VvmeEspectaculo().setVisible(true);
            }
        });
    }
     
     private void AjustarVentanaOpcion(){
         if(this.opcion == 0){
            tTitulo.setText("Baja de espectáculo");
            bModificarBaja.setText("Dar de baja");
        }else if(this.opcion == 1){
            tTitulo.setText("Modificar espectáculo");
            bModificarBaja.setText("Modificar");
        }else{
            bModificarBaja.setVisible(false);
            bCancelar.setText("Cerrar");
            tTitulo.setText("Info. espectáculos registrados");
        }
     }
    
    public void LimpiarCampos(){
        tAforo.setText("");
        tDescripcion.setText("");
        tLugar.setText("");
        tDniEmpleado.setText("");
        tNombreEmpleado.setText("");
        tApellidoEmpleado.setText("");
        tCargoEmpleado.setText("");
    }
    
    public void AutocompletarDatosEspectaculo(){
        
        tAforo.setText(String.valueOf(this.espec.getAforo()));
        tDescripcion.setText(this.espec.getDescripcion());
        tLugar.setText(this.espec.getLugar());
        if(this.espec.getEncargado() != null){
            Empleado emple = this.espec.getEncargado();
            tDniEmpleado.setText(emple.getDni());
            tNombreEmpleado.setText(emple.getNombre());
            tApellidoEmpleado.setText(emple.getApellido1());
            tCargoEmpleado.setText(emple.getCargo());
        }
    }
    
    public void RellenarComboEspectaculos(){
        cbNombre.removeAllItems();
        listaEspectaculosFiltrada = new ArrayList<>();
        if(this.listaEspectaculos != null && !this.listaEspectaculos.isEmpty()){
             cbNombre.addItem("-----Elegir espectáculo-----");
            try{
                for(Espectaculo e : this.listaEspectaculos){
                    if((e.isBaja() && ckMostrarBaja.isSelected()) || !e.isBaja()){
                        String nombre = e.getNombre();
                        String nombreOriginal = nombre;
                        int countRepetido = 0;
                        for(int x = 0;x<cbNombre.getItemCount();x++){
                            String item = cbNombre.getItemAt(x);
                            if(item.equalsIgnoreCase(nombre)){
                                nombre = nombreOriginal+" ("+countRepetido+")";
                                countRepetido++;
                            }
                        }
                        cbNombre.addItem(nombre);
                        listaEspectaculosFiltrada.add(e);
                    }
                }
            }catch(Exception e){
                System.out.println("ha ocurrido un error "+ e.getMessage());
            } 
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel;
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bModificarBaja;
    private javax.swing.JComboBox<String> cbNombre;
    private javax.swing.JCheckBox ckMostrarBaja;
    private javax.swing.JLabel eNombre;
    private javax.swing.JLabel eNombre1;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextField tAforo;
    private javax.swing.JTextField tApellidoEmpleado;
    private javax.swing.JTextField tCargoEmpleado;
    private javax.swing.JTextArea tDescripcion;
    private javax.swing.JTextField tDniEmpleado;
    private javax.swing.JTextField tLugar;
    private javax.swing.JTextField tNombreEmpleado;
    private javax.swing.JLabel tTitulo;
    // End of variables declaration//GEN-END:variables
}
