/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import datos.Conexion;
import Finanzas.dominio.TipoAsiento;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import datos.TipoAsientoDAO;
import java.io.File;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/*import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;*/

/**
 *
 * @author OtakuGT
 */
public class Mantenimiento_TipoAsiento extends javax.swing.JInternalFrame {

    public void llenadoDeTablas() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Tipo de Asiento");
        TipoAsientoDAO tipoDAO = new TipoAsientoDAO();
        List<TipoAsiento> tipoasiento = tipoDAO.select();
        Tabla.setModel(modelo);
        Object[] objeto = new Object[2];
        for (int i = 0; i < tipoasiento.size(); i++) {
            objeto[0] = tipoasiento.get(i).getIDTA();
            objeto[1] = tipoasiento.get(i).getTipo();


            modelo.addRow(objeto);
        }
    }
    public void limpiar() {
        txtID.setText("");
        txtTipo.setText("");

    }
    //Codigo de aplicacion 
     int CodigoAplicacion = 1004;
     
    /**
     * Creates new form TipoAsiento
     */
    public Mantenimiento_TipoAsiento() {
        initComponents();
        llenadoDeTablas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        BtnIng = new javax.swing.JButton();
        BtnMod = new javax.swing.JButton();
        BtnElim = new javax.swing.JButton();
        BtnBus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        BtnAyu = new javax.swing.JButton();
        BtnRep = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Tipo Asiento");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel1.setText("ID");

        jLabel2.setText("Tipo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(txtTipo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BtnIng.setText("Agregar");
        BtnIng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIngActionPerformed(evt);
            }
        });

        BtnMod.setText("Modificar");
        BtnMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModActionPerformed(evt);
            }
        });

        BtnElim.setText("Eliminar");
        BtnElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnElimActionPerformed(evt);
            }
        });

        BtnBus.setText("Buscar");
        BtnBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBusActionPerformed(evt);
            }
        });

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Tabla);

        BtnAyu.setText("?");
        BtnAyu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAyuActionPerformed(evt);
            }
        });

        BtnRep.setText("Reporte");
        BtnRep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRepActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnIng)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnMod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnElim)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnBus, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnRep)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnAyu)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BtnBus, BtnElim, BtnIng, BtnMod, BtnRep});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnIng)
                    .addComponent(BtnMod)
                    .addComponent(BtnElim)
                    .addComponent(BtnBus)
                    .addComponent(BtnAyu)
                    .addComponent(BtnRep))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnIngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIngActionPerformed

        TipoAsiento TAInsertar = new TipoAsiento();
        TipoAsientoDAO TADAO = new TipoAsientoDAO();
        if (txtID.getText().length() != 0 && txtTipo.getText().length() !=0) {
            {
                TAInsertar.setIDTA(txtID.getText());
                TAInsertar.setTipo(txtTipo.getText());
                {
                    JOptionPane.showMessageDialog(null, "Tipo de Asiento registrado Exitosamente");
                }
                limpiar();
                TADAO.insert(TAInsertar);
                llenadoDeTablas();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Los campos estan vacios");
            llenadoDeTablas();
        }
        llenadoDeTablas();
    }//GEN-LAST:event_BtnIngActionPerformed

    private void BtnModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModActionPerformed

        if ( txtID.getText().length()!=0 && txtTipo.getText().length()!=0){
        TipoAsiento TAMod = new TipoAsiento();
        TipoAsientoDAO TADAO = new TipoAsientoDAO();
        TAMod.setIDTA(txtID.getText());
        TAMod.setTipo(txtTipo.getText());
        TADAO.update(TAMod);
        JOptionPane.showMessageDialog(null, "Modificación Exitosa");
        llenadoDeTablas();
        }
        else {
            JOptionPane.showMessageDialog(null, "No se ha podido modificar");
        }
    }//GEN-LAST:event_BtnModActionPerformed

    private void BtnElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnElimActionPerformed

        if ( txtID.getText().length()!=0 ){
        TipoAsiento TADEL = new TipoAsiento();
        TipoAsientoDAO TADAO = new TipoAsientoDAO();

        TADEL.setIDTA(txtID.getText());
        TADAO.delete(TADEL);
        int salida = JOptionPane.showConfirmDialog(null, "Seguro que quieres eliminar?", "Advertencia de eliminacion",
                JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
        System.out.println(salida);
        if (salida == 0) {
            TADAO.delete(TADEL);
            JOptionPane.showMessageDialog(null, "Tipo Asiento Eliminado.");
        }
        else {
            JOptionPane.showMessageDialog(null, "El registro no se ha eliminado");
        }
        llenadoDeTablas();
        limpiar();
    }
    }//GEN-LAST:event_BtnElimActionPerformed

    private void BtnBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBusActionPerformed

        if (txtID.getText().length()!=0){
        TipoAsiento TABUS = new TipoAsiento();
        TipoAsientoDAO TADAO = new TipoAsientoDAO();
        TABUS.setIDTA(txtID.getText());
        TABUS = TADAO.query(TABUS);
        
        txtID.setText(TABUS.getIDTA());
        txtTipo.setText(TABUS.getTipo());
        JOptionPane.showMessageDialog(null, "Registro encontrado");
        llenadoDeTablas();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Registro no encontrado");
            llenadoDeTablas();
        }
        llenadoDeTablas();
    }//GEN-LAST:event_BtnBusActionPerformed

    private void BtnAyuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAyuActionPerformed
        try {
            if ((new File("src\\ayuda\\AyudaMantenimientoTipoAsiento.chm")).exists()) {
                Process p = Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler src\\ayuda\\AyudaMantenimientoTipoAsiento.chm");
                p.waitFor();
            } else {
                JOptionPane.showMessageDialog(null, "La ayuda no Fue encontrada");
            }
            //System.out.println("Correcto");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_BtnAyuActionPerformed
    private Connection connection = null;
    private void BtnRepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRepActionPerformed
        
        /*Map p = new HashMap();
        JasperReport report;
        JasperPrint print;

        try {
            connection = Conexion.getConnection();
            report = JasperCompileManager.compileReport(new File("").getAbsolutePath()
                    + "/src/main/java/Finanzas/reportes/ReporteTipoAsiento.jrxml");
            print = JasperFillManager.fillReport(report, p, connection);
            JasperViewer view = new JasperViewer(print, false);
            view.setTitle("Reporte de Cuenta Bancaria");
            view.setVisible(true);

        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }//GEN-LAST:event_BtnRepActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAyu;
    private javax.swing.JButton BtnBus;
    private javax.swing.JButton BtnElim;
    private javax.swing.JButton BtnIng;
    private javax.swing.JButton BtnMod;
    private javax.swing.JButton BtnRep;
    private javax.swing.JTable Tabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
