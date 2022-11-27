package Ventanas;

import Clases.Cliente;
import Clases.Response;
import juan_parquestematicos.Main;
import java.util.Date;
import javax.swing.JOptionPane;

public class VCrearCliente extends javax.swing.JFrame {
    
    private final String dniChars="TRWAGMYFPDXBNJZSQVHLCKE";   
    
    private int opcion;
    private Cliente c;
    
    public VCrearCliente() {
        initComponents();
        setLocationRelativeTo(null);
        NoDni.setVisible(false);
        NoNombre.setVisible(false);
        NoApellido1.setVisible(false);
        NoNacimiento.setVisible(false);
    }
    
    public VCrearCliente(int opcion, Cliente cli) {
        initComponents();
        setLocationRelativeTo(null);
        NoDni.setVisible(false);
        NoNombre.setVisible(false);
        NoApellido1.setVisible(false);
        NoNacimiento.setVisible(false);
        this.opcion = opcion;
        this.c = cli;
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

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tTitulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        tTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tTitulo.setText("Crear Cliente");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(bAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(eNombre)
                                            .addComponent(jLabel6)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap()
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
                                .addContainerGap()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NoNacimiento)
                                    .addComponent(tNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
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
            
            Cliente c = new Cliente();
            c.setDni(dni.toUpperCase());
            c.setNombre(nombre);
            c.setApellido1(apellido1);
            c.setFechaNacimiento(nacimiento);
            
            Response respuesta = null;
            
            
            if(this.opcion == 1){
                respuesta = Main.modificarCliente(c);
                if(respuesta.isCorrecto()){
                    JOptionPane.showMessageDialog(null, "Se ha modificado el cliente correctamente.");
                }
            }else{
                respuesta = Main.insertarCliente(c);
                if(respuesta.isCorrecto()){
                    JOptionPane.showMessageDialog(null, "Se ha insertado el cliente correctamente.");
                }
            }
            if(respuesta != null){
                if(!respuesta.isCorrecto()){
                    JOptionPane.showMessageDialog(null,respuesta.getMensajeError(),"", JOptionPane.ERROR_MESSAGE);
                }else{
                    Main.cerrarCrearCliente(this.opcion);
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
            java.util.logging.Logger.getLogger(VCrearCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VCrearCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VCrearCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VCrearCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new VCrearCliente().setVisible(true);
            }
        });
    }
    
    public boolean validarDatos(){
        NoDni.setVisible(false);
        NoNombre.setVisible(false);
        NoApellido1.setVisible(false);
        NoNacimiento.setVisible(false);
        boolean valido = true;
        String dni = tDni.getText();
        String nombre = tNombre.getText();
        String apellido1 = tApellido1.getText();
        Date nacimiento = tNacimiento.getDate();
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
            tTitulo.setText("Modificar Cliente");
            tDni.setEditable(false);
            bAceptar.setText("Aceptar y modificar");
            RellenarDatosDelCliente();
        }else{
            tTitulo.setText("Crear Cliente");
            bAceptar.setText("Aceptar y crear");
            tDni.setEditable(true);
        }
     }
     
     private void RellenarDatosDelCliente(){
         if(c != null){
            tDni.setText(c.getDni());
            tNombre.setText(c.getNombre());
            tApellido1.setText(c.getApellido1());
            tNacimiento.setDate(c.getFechaNacimiento());
        }
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NoApellido1;
    private javax.swing.JLabel NoDni;
    private javax.swing.JLabel NoNacimiento;
    private javax.swing.JLabel NoNombre;
    private javax.swing.JButton bAceptar;
    private javax.swing.JButton bCancelar;
    private javax.swing.JLabel eNombre;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextField tApellido1;
    private javax.swing.JTextField tDni;
    private com.toedter.calendar.JDateChooser tNacimiento;
    private javax.swing.JTextField tNombre;
    private javax.swing.JLabel tTitulo;
    // End of variables declaration//GEN-END:variables
}
