package Ventanas;

import Clases.Empleado;
import Clases.Espectaculo;
import Clases.Response;
import juan_parquestematicos.Main;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class VCrearEspectaculo extends javax.swing.JFrame {
    
    private final String dniChars="TRWAGMYFPDXBNJZSQVHLCKE";   
    
    private int opcion;
    private Espectaculo e;
    private List<Empleado> listaEmpleados;
    private Empleado emp;
   
    public VCrearEspectaculo() {
        initComponents();
        setLocationRelativeTo(null);
        NoNombre.setVisible(false);
        NoAforo.setVisible(false);
        NoDescripcion.setVisible(false);
        NoLugar.setVisible(false);
    }
    
    public VCrearEspectaculo(int opcion, Espectaculo espectaculo, List<Empleado> listaEmpleados) {
        initComponents();
        setLocationRelativeTo(null);
        NoNombre.setVisible(false);
        NoAforo.setVisible(false);
        NoDescripcion.setVisible(false);
        NoLugar.setVisible(false);
        this.opcion = opcion;
        this.e = espectaculo;
        this.listaEmpleados = listaEmpleados;
        RellenarComboEmpleados();
        AdaptarVentanaOpcion();
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
        tNombre = new javax.swing.JTextField();
        tAforo = new javax.swing.JTextField();
        bAceptar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        NoDescripcion = new javax.swing.JLabel();
        NoNombre = new javax.swing.JLabel();
        NoAforo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tDescripcion = new javax.swing.JTextArea();
        eNombre1 = new javax.swing.JLabel();
        tLugar = new javax.swing.JTextField();
        NoLugar = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cbDniEmpleado = new javax.swing.JComboBox<>();
        tNombreEmpleado = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tApellidoEmpleado = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        JLabel = new javax.swing.JLabel();
        tCargoEmpleado = new javax.swing.JTextField();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tTitulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        tTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tTitulo.setText("Crear Espectáculo");

        jLabel2.setText("Nombre:");

        eNombre.setText("Aforo:");

        jLabel6.setText("Descripción:");

        bAceptar.setText("Aceptar y crear");
        bAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAceptarActionPerformed(evt);
            }
        });

        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        NoDescripcion.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        NoDescripcion.setForeground(new java.awt.Color(255, 0, 0));
        NoDescripcion.setText("*Descripción no válida");

        NoNombre.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        NoNombre.setForeground(new java.awt.Color(255, 0, 0));
        NoNombre.setText("*Nombre no válido");

        NoAforo.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        NoAforo.setForeground(new java.awt.Color(255, 0, 0));
        NoAforo.setText("*Aforo no válido");

        tDescripcion.setColumns(20);
        tDescripcion.setLineWrap(true);
        tDescripcion.setRows(5);
        jScrollPane2.setViewportView(tDescripcion);

        eNombre1.setText("Lugar:");

        NoLugar.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        NoLugar.setForeground(new java.awt.Color(255, 0, 0));
        NoLugar.setText("*Lugar no válido");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Encargado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N

        jLabel8.setText("DNI:");

        cbDniEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDniEmpleadoActionPerformed(evt);
            }
        });

        tNombreEmpleado.setEditable(false);
        tNombreEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNombreEmpleadoActionPerformed(evt);
            }
        });

        jLabel7.setText("Nombre:");

        tApellidoEmpleado.setEditable(false);

        jLabel9.setText("Apellido:");

        JLabel.setText("Cargo:");

        tCargoEmpleado.setEditable(false);

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
                                .addComponent(cbDniEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                    .addComponent(cbDniEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(bAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(eNombre1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(NoLugar)
                                        .addComponent(tLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(57, 57, 57)
                                            .addComponent(eNombre))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addContainerGap()
                                            .addComponent(jLabel2)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(NoNombre)
                                        .addComponent(NoAforo)
                                        .addComponent(tAforo, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(NoDescripcion)
                                        .addComponent(jScrollPane2))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 21, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NoNombre)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tAforo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NoAforo)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NoDescripcion)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eNombre1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NoLugar)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        Main.cerrarCrearEspectaculo(opcion);
    }//GEN-LAST:event_bCancelarActionPerformed

    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed
        if(this.emp != null){
            if(validarDatos()){
                String nombre = tNombre.getText();
                String aforo = tAforo.getText();
                String descricpion = tDescripcion.getText();
                String lugar = tLugar.getText();

                Espectaculo espectaculo = new Espectaculo();
                espectaculo.setNombre(nombre);
                espectaculo.setAforo(Integer.parseInt(aforo));
                espectaculo.setDescripcion(descricpion);
                espectaculo.setLugar(lugar);
                espectaculo.setEncargado(this.emp);
                Response respuesta = null;


                if(this.opcion == 1){
                    espectaculo.setId(this.e.getId());
                    respuesta = Main.modificarEspectaculo(espectaculo);
                    if(respuesta.isCorrecto()){
                        JOptionPane.showMessageDialog(null, "Se ha modificado el espectáculo correctamente.");
                    }
                }else{
                    respuesta = Main.insertarEspectaculo(espectaculo);
                    if(respuesta.isCorrecto()){
                        JOptionPane.showMessageDialog(null, "Se ha insertado el espectáculo correctamente.");
                    }
                }
                if(respuesta != null){
                    if(!respuesta.isCorrecto()){
                        JOptionPane.showMessageDialog(null,respuesta.getMensajeError(),"", JOptionPane.ERROR_MESSAGE);
                    }else{
                        Main.cerrarCrearEspectaculo(this.opcion);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error inesperado. Vuelve a intentarlo.","", JOptionPane.ERROR_MESSAGE);
                }

            }
        }else{
            JOptionPane.showMessageDialog(null, "El encargado es obligatorio.","", JOptionPane.ERROR_MESSAGE);            
        }
    }//GEN-LAST:event_bAceptarActionPerformed

    private void cbDniEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDniEmpleadoActionPerformed
        int index = cbDniEmpleado.getSelectedIndex()-1;
        Empleado empleado = null;
        if(index > -1){
            empleado = this.listaEmpleados.get(index);
        }
        if(empleado == null){
            LimpiarCamposEmpleado();
            this.emp = null;
        }else{
            this.emp = empleado;
            AutocompletarDatosEmpleado();
        }
    }//GEN-LAST:event_cbDniEmpleadoActionPerformed

    private void tNombreEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNombreEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNombreEmpleadoActionPerformed

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
            java.util.logging.Logger.getLogger(VCrearEspectaculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VCrearEspectaculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VCrearEspectaculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VCrearEspectaculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VCrearEspectaculo().setVisible(true);
            }
        });
    }
    
    public boolean validarDatos(){
        NoNombre.setVisible(false);
        NoAforo.setVisible(false);
        NoDescripcion.setVisible(false);
        NoLugar.setVisible(false);
        boolean valido = true;
        String nombre = tNombre.getText();
        String aforo = tAforo.getText();
        String descripcion = tDescripcion.getText();
        String lugar = tLugar.getText();
        if(nombre == null || nombre.isBlank()){
            NoNombre.setText("*El nombre es obligatorio.");
            NoNombre.setVisible(true);
            valido = false;
        }
        if(aforo == null || aforo.isBlank()){
            NoAforo.setText("*El aforo es obligatorio.");
            NoAforo.setVisible(true);
            valido = false;
        }else if(!isNumeric(aforo)){
            NoAforo.setText("*El aforo no es válido.");
            NoAforo.setVisible(true);
            valido = false;
        }
        if(descripcion == null || descripcion.isBlank()){
            NoDescripcion.setText("*La descripción es obligatoria.");
            NoDescripcion.setVisible(true);
            valido = false;
        }
        if(lugar == null || lugar.isBlank()){
            NoLugar.setText("*El lugar es obligatorio.");
            NoLugar.setVisible(true);
            valido = false;
        }
        return valido;
    }
     
     private boolean isNumeric(String numeroString){
         try{
             int numeroConvertido = Integer.parseInt(numeroString);
             return true;
         }catch(Exception ex){
             return false;
         }
     }
     
     private void AdaptarVentanaOpcion(){
         if(opcion == 1){
            tTitulo.setText("Modificar Espectáculo");
            tNombre.setEditable(false);
            bAceptar.setText("Aceptar y modificar");
            RellenarDatosDelEspectaculo();
        }else{
            tTitulo.setText("Crear Espectáculo");
            bAceptar.setText("Aceptar y crear");
            tNombre.setEditable(true);
        }
     }
     
     private void RellenarDatosDelEspectaculo(){
         if(e != null){
            tNombre.setText(e.getNombre());
            tAforo.setText(String.valueOf(e.getAforo()));
            tDescripcion.setText(e.getDescripcion());
            tLugar.setText(e.getLugar());
            for(int x = 0; x<this.listaEmpleados.size();x++){
                Empleado emple = this.listaEmpleados.get(x);
                if(e.getEncargado().getDni().equalsIgnoreCase(emple.getDni())){
                    cbDniEmpleado.setSelectedIndex(x+1);
                }
            }
        }
     }
    
    public void LimpiarCamposEmpleado(){
        tNombreEmpleado.setText("");
        tApellidoEmpleado.setText("");
        tCargoEmpleado.setText("");
    }
    
    public void AutocompletarDatosEmpleado(){
        tNombreEmpleado.setText(this.emp.getNombre());
        tApellidoEmpleado.setText(this.emp.getApellido1());
        tCargoEmpleado.setText(this.emp.getCargo());
    }
    
    public void RellenarComboEmpleados(){
        cbDniEmpleado.removeAllItems();
        if(this.listaEmpleados != null && !this.listaEmpleados.isEmpty()){
             cbDniEmpleado.addItem("-----Elegir empleado-----");
            try{
                for(Empleado emp : this.listaEmpleados){
                    cbDniEmpleado.addItem(emp.getDni());
                }
            }catch(Exception e){
                System.out.println("ha ocurrido un error "+ e.getMessage());
            } 
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel;
    private javax.swing.JLabel NoAforo;
    private javax.swing.JLabel NoDescripcion;
    private javax.swing.JLabel NoLugar;
    private javax.swing.JLabel NoNombre;
    private javax.swing.JButton bAceptar;
    private javax.swing.JButton bCancelar;
    private javax.swing.JComboBox<String> cbDniEmpleado;
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
    private javax.swing.JTextField tLugar;
    private javax.swing.JTextField tNombre;
    private javax.swing.JTextField tNombreEmpleado;
    private javax.swing.JLabel tTitulo;
    // End of variables declaration//GEN-END:variables
}
