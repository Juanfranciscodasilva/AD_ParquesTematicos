package Ventanas;

import Clases.Cliente;
import Clases.Espectaculo;
import Clases.Response;
import juan_parquestematicos.Main;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class VRetirarClienteEspectaculo extends javax.swing.JFrame {
    Cliente clienteSeleccionado;
    Espectaculo espectaculoSeleccionado;
    private List<Espectaculo> listaAllEspectaculos;
    private List<Cliente> listaAllClientes;
    private List<Cliente> listaClientesFiltrados;
    
    public VRetirarClienteEspectaculo() {
        initComponents();
        setLocationRelativeTo(null);
        cbNombre.setEnabled(false);
        cbDni.setEnabled(false);
        btRetirar.setVisible(false);
    }
    
    public VRetirarClienteEspectaculo(List<Espectaculo> espectaculos, List<Cliente> clientes) {
        initComponents();
        setLocationRelativeTo(null);
        this.listaAllEspectaculos = espectaculos;
        this.listaAllClientes = clientes;
        RellenarCombos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbNombre = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        tAforo = new javax.swing.JTextField();
        eLugar = new javax.swing.JLabel();
        tLugar = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tDescripcion = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cbDni = new javax.swing.JComboBox<>();
        tNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tApellido1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        eApellido2 = new javax.swing.JLabel();
        tNacimiento = new javax.swing.JTextField();
        btRetirar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titulo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Retirar cliente");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Espect??culo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N

        jLabel2.setText("Nombre:");

        cbNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNombreActionPerformed(evt);
            }
        });

        jLabel3.setText("Aforo:");

        tAforo.setEditable(false);

        eLugar.setText("Lugar:");

        tLugar.setEditable(false);

        jLabel9.setText("Descripci??n:");

        tDescripcion.setEditable(false);
        tDescripcion.setColumns(20);
        tDescripcion.setLineWrap(true);
        tDescripcion.setRows(5);
        jScrollPane2.setViewportView(tDescripcion);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(eLugar)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addComponent(cbNombre, javax.swing.GroupLayout.Alignment.LEADING, 0, 274, Short.MAX_VALUE)
                    .addComponent(tAforo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tLugar, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tAforo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eLugar)
                    .addComponent(tLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(40, 40, 40)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N

        jLabel8.setText("DNI:");

        cbDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDniActionPerformed(evt);
            }
        });

        tNombre.setEditable(false);
        tNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNombreActionPerformed(evt);
            }
        });

        jLabel6.setText("Nombre:");

        tApellido1.setEditable(false);

        jLabel7.setText("Primer apellido:");

        eApellido2.setText("Nacimiento");

        tNacimiento.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(36, 36, 36)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel6))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tNombre)
                                .addComponent(cbDni, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(eApellido2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eApellido2)
                    .addComponent(tNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btRetirar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btRetirar.setText("Retirar");
        btRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRetirarActionPerformed(evt);
            }
        });

        Cancelar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(btRetirar)
                        .addGap(49, 49, 49)
                        .addComponent(Cancelar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(titulo)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btRetirar)
                    .addComponent(Cancelar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNombreActionPerformed
        int index = cbNombre.getSelectedIndex()-1;
        Espectaculo espec = null;
        if(index > -1){
            espec = this.listaAllEspectaculos.get(index);
        }
        if(espec == null){
            LimpiarCamposEspectaculo();
            this.espectaculoSeleccionado = null;
        }else{
            this.espectaculoSeleccionado = espec;
            AutocompletarDatosEspectaculo();
        }
        rellenarComboClientes();
        
    }//GEN-LAST:event_cbNombreActionPerformed

    private void cbDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDniActionPerformed
        int index = cbDni.getSelectedIndex()-1;
        Cliente cli = null;
        if(index > -1){
            cli = this.listaAllClientes.get(index);
        }
        if(cli == null){
            LimpiarCamposCliente();
            this.clienteSeleccionado = null;
        }else{
            this.clienteSeleccionado = cli;
            AutocompletarDatosCliente();
        }
        
    }//GEN-LAST:event_cbDniActionPerformed

    private void tNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNombreActionPerformed

    private void btRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRetirarActionPerformed
        if(this.espectaculoSeleccionado != null && this.clienteSeleccionado != null){
            Response respuesta = null;
            respuesta = Main.retirarInscripcionClienteEspectaculo(espectaculoSeleccionado, clienteSeleccionado);
            if(respuesta != null){
                if(respuesta.isCorrecto()){
                    JOptionPane.showMessageDialog(null, "Se ha retirado al cliente seleccionado del espect??culo seleccionado.");
                    Main.cerrarRetirarClienteEspectaculo();
                }else{
                    JOptionPane.showMessageDialog(null, respuesta.getMensajeError(),"", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error inesperado. Intenalo de nuevo.","", JOptionPane.ERROR_MESSAGE);
            }

        }else{
            JOptionPane.showMessageDialog(null, "Tanto el espect??culo como el cliente son datos obligatorios.","", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btRetirarActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        Main.cerrarRetirarClienteEspectaculo();
    }//GEN-LAST:event_CancelarActionPerformed

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
            java.util.logging.Logger.getLogger(VRetirarClienteEspectaculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VRetirarClienteEspectaculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VRetirarClienteEspectaculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VRetirarClienteEspectaculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VRetirarClienteEspectaculo().setVisible(true);
            }
        });
    }
    
    public void LimpiarCamposEspectaculo(){
        tAforo.setText("");
        tLugar.setText("");
        tDescripcion.setText("");
    }
    
    public void LimpiarCamposCliente(){
        tNombre.setText("");
        tApellido1.setText("");
        tNacimiento.setText("");
    }
    
    public void AutocompletarDatosEspectaculo(){
        tLugar.setText(espectaculoSeleccionado.getLugar());
        tAforo.setText(String.valueOf(espectaculoSeleccionado.getAforo()));
        tDescripcion.setText(espectaculoSeleccionado.getDescripcion());
    }
    
    public void AutocompletarDatosCliente(){
        tNombre.setText(clienteSeleccionado.getNombre());
        tApellido1.setText(clienteSeleccionado.getApellido1());
        tNacimiento.setText(clienteSeleccionado.getFechaNacimiento().toString());
    }
    
    public void RellenarCombos(){
        rellenarComboEspectaculos();
        rellenarComboClientes();
    }
    
    public void rellenarComboEspectaculos(){
        cbNombre.removeAllItems();
        if(this.listaAllEspectaculos != null && !this.listaAllEspectaculos.isEmpty()){
            cbNombre.addItem("-----Elegir espect??culo-----");
            try{
                for(Espectaculo espec : this.listaAllEspectaculos){
                    String nombre = espec.getNombre();
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
                }
            }catch(Exception e){
                System.out.println("ha ocurrido un error "+ e.getMessage());
            } 
        }
    }
    
    public void rellenarComboClientes(){
        this.listaClientesFiltrados = new ArrayList<>();
        cbDni.removeAllItems();
        if(this.listaAllClientes != null && !this.listaAllClientes.isEmpty()){
            try{
                filtrarListaClientes();
                cbDni.addItem("-----Elegir cliente-----");
                for(Cliente cli : this.listaClientesFiltrados){
                    cbDni.addItem(cli.getDni());
                }
            }catch(Exception e){
                System.out.println("ha ocurrido un error "+ e.getMessage());
            } 
        }
    }
    
    public void filtrarListaClientes(){
        if(this.espectaculoSeleccionado != null){
            if(this.espectaculoSeleccionado.getListaClientes() != null){
                for(Cliente cli : this.espectaculoSeleccionado.getListaClientes()){
                    Cliente cliEncontrado = this.listaAllClientes.stream().filter(c -> c.getDni().equalsIgnoreCase(cli.getDni())).findFirst().orElse(null);
                    if(cliEncontrado != null){
                        this.listaClientesFiltrados.add(cliEncontrado);
                    }
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton btRetirar;
    private javax.swing.JComboBox<String> cbDni;
    private javax.swing.JComboBox<String> cbNombre;
    private javax.swing.JLabel eApellido2;
    private javax.swing.JLabel eLugar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField tAforo;
    private javax.swing.JTextField tApellido1;
    private javax.swing.JTextArea tDescripcion;
    private javax.swing.JTextField tLugar;
    private javax.swing.JTextField tNacimiento;
    private javax.swing.JTextField tNombre;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
