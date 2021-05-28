/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import dominio.PartidaContable;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Diego Vásquez
 */
public class CodigosPartidaContable extends javax.swing.JFrame {

    /**
     * Creates new form CodigosPartidaContable
     */
    private void cargarTabla() {

        PartidaContable objPartida = new PartidaContable();

        objPartida.getTablaRegistros();

        int contI = 0;
        contI = objPartida.getTablaRegistros().length;

        String[][] matrixData = new String[contI][4];

        for (int i = 0; i < contI; i++) {
            for (int j = 0; j < 4; j++) {
                matrixData[i][j] = objPartida.getTablaRegistros()[i][j];
            }
        }

        DefaultTableModel modeloTabla = (DefaultTableModel) TblPartidas.getModel();
        modeloTabla.setRowCount(contI);
        modeloTabla.setColumnCount(4);

        for (int i = 0; i < contI; i++) {
            for (int j = 0; j < 4; j++) {
                TblPartidas.setValueAt(matrixData[i][j], i, j);;
            }
        }
    }
    public int varOP = 0;

    public CodigosPartidaContable() {
        initComponents();
        cargarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TblPartidas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        BtnSeleccionar = new javax.swing.JButton();

        setTitle("Códigos de Partida Contable");
        setResizable(false);

        TblPartidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Fecha", "Periodo Fiscal", "Glosa"
            }
        ));
        jScrollPane1.setViewportView(TblPartidas);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Códigos de Partidas Contables");

        BtnSeleccionar.setText("Seleccionar");
        BtnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSeleccionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtnSeleccionar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnSeleccionar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSeleccionarActionPerformed

        if (varOP == 1) {
            FrmAsientoContable.TxtCodigoPartida.setText((String) TblPartidas.getValueAt(TblPartidas.getSelectedRow(), 0));
            FrmAsientoContable.TxtFecha.setText((String) TblPartidas.getValueAt(TblPartidas.getSelectedRow(), 1));
            FrmAsientoContable.CmbPeriodoFiscal.setSelectedItem((String) TblPartidas.getValueAt(TblPartidas.getSelectedRow(), 2));
            FrmAsientoContable.TxtGlosaContable.setText((String) TblPartidas.getValueAt(TblPartidas.getSelectedRow(), 3));
        } else if (varOP == 2) {
            FrmCuadre.TxtPartida.setText((String) TblPartidas.getValueAt(TblPartidas.getSelectedRow(), 0));
            FrmCuadre.TxtGlosa.setText((String) TblPartidas.getValueAt(TblPartidas.getSelectedRow(), 3));
        }

    }//GEN-LAST:event_BtnSeleccionarActionPerformed

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
            java.util.logging.Logger.getLogger(CodigosPartidaContable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CodigosPartidaContable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CodigosPartidaContable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CodigosPartidaContable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CodigosPartidaContable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSeleccionar;
    private javax.swing.JTable TblPartidas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
