package Ventanas;

import Enum.PARQUES;
import juan_parquestematicos.Main;

public class VSeleccionParque extends javax.swing.JFrame {

    public VSeleccionParque() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btWarner = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btDisney = new javax.swing.JButton();
        btUniversal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btWarner.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btWarner.setText("Warner");
        btWarner.setMaximumSize(new java.awt.Dimension(103, 45));
        btWarner.setMinimumSize(new java.awt.Dimension(103, 45));
        btWarner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btWarnerActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Selecciona la Agencia");
        jLabel3.setToolTipText("");

        btDisney.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btDisney.setText("Disney");
        btDisney.setMaximumSize(new java.awt.Dimension(103, 45));
        btDisney.setMinimumSize(new java.awt.Dimension(103, 45));
        btDisney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDisneyActionPerformed(evt);
            }
        });

        btUniversal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btUniversal.setText("Universal");
        btUniversal.setMaximumSize(new java.awt.Dimension(103, 45));
        btUniversal.setMinimumSize(new java.awt.Dimension(103, 45));
        btUniversal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUniversalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btWarner, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btDisney, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btUniversal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btWarner, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDisney, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btUniversal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btWarnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btWarnerActionPerformed
        Main.SeleccionarParque(PARQUES.Warner);
    }//GEN-LAST:event_btWarnerActionPerformed

    private void btDisneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDisneyActionPerformed
        Main.SeleccionarParque(PARQUES.Disney);
    }//GEN-LAST:event_btDisneyActionPerformed

    private void btUniversalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUniversalActionPerformed
        Main.SeleccionarParque(PARQUES.Universal);
    }//GEN-LAST:event_btUniversalActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VSeleccionParque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VSeleccionParque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VSeleccionParque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VSeleccionParque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VSeleccionParque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDisney;
    private javax.swing.JButton btUniversal;
    private javax.swing.JButton btWarner;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
