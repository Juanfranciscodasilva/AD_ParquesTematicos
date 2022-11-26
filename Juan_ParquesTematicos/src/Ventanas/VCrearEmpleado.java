package Ventanas;

import Clases.Empleado;
import Clases.Response;
import juan_parquestematicos.Main;
import java.util.Date;
import javax.swing.JOptionPane;

public class VCrearEmpleado extends javax.swing.JFrame {
    
    private final String dniChars="TRWAGMYFPDXBNJZSQVHLCKE";   
    
    private static int opcion;
    private static Empleado e;
    
    public VCrearEmpleado() {
        initComponents();
        setLocationRelativeTo(null);
        NoDni.setVisible(false);
        NoNombre.setVisible(false);
        NoApellido1.setVisible(false);
        NoNacimiento.setVisible(false);
        NoNacionalidad.setVisible(false);
        NoContratacion.setVisible(false);
        NoCargo.setVisible(false);
    }
    
    public VCrearEmpleado(int opcion, Empleado emple) {
        initComponents();
        setLocationRelativeTo(null);
        NoDni.setVisible(false);
        NoNombre.setVisible(false);
        NoApellido1.setVisible(false);
        NoNacimiento.setVisible(false);
        NoNacionalidad.setVisible(false);
        NoContratacion.setVisible(false);
        NoCargo.setVisible(false);
        this.opcion = opcion;
        this.e = emple;
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
        tDni = new javax.swing.JTextField();
        tNombre = new javax.swing.JTextField();
        bAceptar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        NoApellido1 = new javax.swing.JLabel();
        NoDni = new javax.swing.JLabel();
        NoNombre = new javax.swing.JLabel();
        tApellido1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tNacimiento = new com.toedter.calendar.JDateChooser();
        NoNacimiento = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tContrato = new com.toedter.calendar.JDateChooser();
        NoContratacion = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tCargo = new javax.swing.JTextField();
        NoCargo = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tNacionalidad = new javax.swing.JTextField();
        NoNacionalidad = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tTitulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        tTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tTitulo.setText("Crear Empleado");

        jLabel2.setText("DNI:");

        eNombre.setText("Nombre:");

        jLabel6.setText("Apellido:");

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

        NoApellido1.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        NoApellido1.setForeground(new java.awt.Color(255, 0, 0));
        NoApellido1.setText("*Apellido no válido");

        NoDni.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        NoDni.setForeground(new java.awt.Color(255, 0, 0));
        NoDni.setText("*DNI no válido");

        NoNombre.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        NoNombre.setForeground(new java.awt.Color(255, 0, 0));
        NoNombre.setText("*Nombre no válido");

        jLabel7.setText("Nacimiento:");

        NoNacimiento.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        NoNacimiento.setForeground(new java.awt.Color(255, 0, 0));
        NoNacimiento.setText("*Fecha no válida (dd/mm/aaaa)");

        jLabel8.setText("Contratación:");

        NoContratacion.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        NoContratacion.setForeground(new java.awt.Color(255, 0, 0));
        NoContratacion.setText("*Fecha no válida (dd/mm/aaaa)");

        jLabel9.setText("Cargo:");

        NoCargo.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        NoCargo.setForeground(new java.awt.Color(255, 0, 0));
        NoCargo.setText("*Cargo no válido");

        jLabel10.setText("Nacionalidad:");

        NoNacionalidad.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        NoNacionalidad.setForeground(new java.awt.Color(255, 0, 0));
        NoNacionalidad.setText("*Nacionalidad no válida");

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
                        .addGap(50, 50, 50)
                        .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 47, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(19, 19, 19)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(eNombre)
                                        .addComponent(jLabel6)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel2)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(NoApellido1)
                                .addComponent(tNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tDni, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(NoDni)
                                .addComponent(NoNombre)
                                .addComponent(tApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(NoNacimiento)
                                .addComponent(tNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NoContratacion)
                            .addComponent(tContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NoCargo)
                            .addComponent(tCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NoNacionalidad)
                            .addComponent(tNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NoDni)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NoNombre)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NoApellido1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NoNacimiento)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NoNacionalidad)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NoContratacion)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NoCargo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        Main.cerrarCrearCliente(opcion);
    }//GEN-LAST:event_bCancelarActionPerformed

    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed
        if(validarDatos()){
            String dni = tDni.getText();
            String nombre = tNombre.getText();
            String apellido1 = tApellido1.getText();
            Date nacimiento = tNacimiento.getDate();
            String nacionalidad = tNacionalidad.getText();
            Date contratacion = tContrato.getDate();
            String cargo = tCargo.getText();
            
            Empleado emple = new Empleado();
            emple.setDni(dni.toUpperCase());
            emple.setNombre(nombre);
            emple.setApellido1(apellido1);
            emple.setFechaNacimiento(nacimiento);
            emple.setNacionalidad(nacionalidad);
            emple.setFechaContratacion(contratacion);
            emple.setCargo(cargo);
            
            Response respuesta = null;
            
            if(this.opcion == 1){
                respuesta = Main.modificarEmpleado(emple);
                if(respuesta.isCorrecto()){
                    JOptionPane.showMessageDialog(null, "Se ha modificado el empleado correctamente.");
                }
            }else{
                respuesta = Main.insertarEmpleado(emple);
                if(respuesta.isCorrecto()){
                    JOptionPane.showMessageDialog(null, "Se ha insertado el empleado correctamente.");
                }
            }
            if(respuesta != null){
                if(!respuesta.isCorrecto()){
                    JOptionPane.showMessageDialog(null,respuesta.getMensajeError(),"", JOptionPane.ERROR_MESSAGE);
                }else{
                    Main.cerrarCrearEmpleado(this.opcion);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error inesperado. Vuelve a intentarlo.","", JOptionPane.ERROR_MESSAGE);
            }
            
        }
    }//GEN-LAST:event_bAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(VCrearEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VCrearEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VCrearEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VCrearEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new VCrearEmpleado().setVisible(true);
            }
        });
    }
    
    public boolean validarDatos(){
        NoDni.setVisible(false);
        NoNombre.setVisible(false);
        NoApellido1.setVisible(false);
        NoNacimiento.setVisible(false);
        NoNacionalidad.setVisible(false);
        NoContratacion.setVisible(false);
        NoCargo.setVisible(false);
        boolean valido = true;
        String dni = tDni.getText();
        String nombre = tNombre.getText();
        String apellido1 = tApellido1.getText();
        Date nacimiento = tNacimiento.getDate();
        String nacionalidad = tNacionalidad.getText();
        Date contratacion = tContrato.getDate();
        String cargo = tCargo.getText();
        if(dni == null || dni.isBlank()){
            NoDni.setText("*El DNI es obligatorio.");
            NoDni.setVisible(true);
            valido = false;
        }else if(!validarDNI(dni)){
            NoDni.setText("*El DNI no es correcto.");
            NoDni.setVisible(true);
            valido = false;
        }
        if(nombre == null || nombre.isBlank()){
            NoNombre.setText("*El nombre es obligatorio.");
            NoNombre.setVisible(true);
            valido = false;
        }
        if(apellido1 == null || apellido1.isBlank()){
            NoApellido1.setText("*Los apellidos son obligatorios.");
            NoApellido1.setVisible(true);
            valido = false;
        }
        if(nacimiento == null){
            NoNacimiento.setText("*La fecha de nacimiento es obligatoria.");
            NoNacimiento.setVisible(true);
            valido = false;
        }else if(nacimiento.compareTo((new Date())) > 0){
            NoNacimiento.setText("*La fecha de nacimiento es posterior a hoy.");
            NoNacimiento.setVisible(true);
            valido = false;
        }
        if(nacionalidad == null || nacionalidad.isBlank()){
            NoNacionalidad.setText("*La nacionalidad es obligatoria.");
            NoNacionalidad.setVisible(true);
            valido = false;
        }
        if(contratacion == null){
            NoContratacion.setText("*La fecha de contratación es obligatoria.");
            NoContratacion.setVisible(true);
            valido = false;
        }else if(contratacion.compareTo(nacimiento) < 0){
            NoContratacion.setText("*Contratación anterior a nacimiento.");
            NoContratacion.setVisible(true);
            valido = false;
        }
        if(cargo == null || cargo.isBlank()){
            NoCargo.setText("*El cargo es obligatorio.");
            NoCargo.setVisible(true);
            valido = false;
        }
        return valido;
    }
    
     private boolean validarDNI(String dni) {
        dni = dni.toUpperCase();
        String intPartDNI = dni.trim().replaceAll(" ", "").substring(0, 8);
        if(dni.length() == 9){
            char ltrDNI = dni.charAt(8);
            if(isNumeric(intPartDNI)){
                int valNumDni = Integer.parseInt(intPartDNI) % 23;
                if(dniChars.charAt(valNumDni)== ltrDNI){
                    return true;
                }
            }
        }
        return false;
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
            tTitulo.setText("Modificar Empleado");
            tDni.setEditable(false);
            bAceptar.setText("Aceptar y modificar");
            RellenarDatosDelEmpleado();
        }else{
            tTitulo.setText("Crear Empleado");
            bAceptar.setText("Aceptar y crear");
            tDni.setEditable(true);
        }
     }
     
     private void RellenarDatosDelEmpleado(){
         if(e != null){
            tDni.setText(e.getDni());
            tNombre.setText(e.getNombre());
            tApellido1.setText(e.getApellido1());
            tNacimiento.setDate(e.getFechaNacimiento());
            tNacionalidad.setText(e.getNacionalidad());
            tContrato.setDate(e.getFechaContratacion());
            tCargo.setText(e.getCargo());
        }
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NoApellido1;
    private javax.swing.JLabel NoCargo;
    private javax.swing.JLabel NoContratacion;
    private javax.swing.JLabel NoDni;
    private javax.swing.JLabel NoNacimiento;
    private javax.swing.JLabel NoNacionalidad;
    private javax.swing.JLabel NoNombre;
    private javax.swing.JButton bAceptar;
    private javax.swing.JButton bCancelar;
    private javax.swing.JLabel eNombre;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextField tApellido1;
    private javax.swing.JTextField tCargo;
    private com.toedter.calendar.JDateChooser tContrato;
    private javax.swing.JTextField tDni;
    private com.toedter.calendar.JDateChooser tNacimiento;
    private javax.swing.JTextField tNacionalidad;
    private javax.swing.JTextField tNombre;
    private javax.swing.JLabel tTitulo;
    // End of variables declaration//GEN-END:variables
}
