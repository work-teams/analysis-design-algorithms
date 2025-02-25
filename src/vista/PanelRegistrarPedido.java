/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import modelo.estructuras.Lista;
import modelo.objetos.BalonOxigeno;
import modelo.objetos.Cliente;
import modelo.objetos.Pedido;

/**
 *
 * @author krypt97
 */
public class PanelRegistrarPedido extends javax.swing.JPanel {

    // Atributos de clase
    private Pedido nuevoPedido;
    private Cliente nuevoCliente;
    private BalonOxigeno miBalonOxigeno;
    private final ArrayList<BalonOxigeno> misBalonesOxigeno = new ArrayList<>();
    private DefaultTableModel miDefaultTableModel;

    // Atributos de clase a conectar
    private Lista miLista;

    /**
     * Creates new form PanelRegistrarPedido
     */
    public PanelRegistrarPedido() {
        initComponents();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        cmbBoxEstado = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCodigoBalon = new javax.swing.JTextField();
        txtCapacidadBalon = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBalonesOxigeno = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        btnAgregarBalon = new javax.swing.JButton();
        btnEliminarBalon = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnGenerarPedido = new javax.swing.JButton();
        btnCancelarPedido = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel1.setText("D.N.I. del cliente :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 17, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel2.setText("Estado del peciente :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 17, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel3.setText("Nombre del cliente :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 109, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel4.setText("Apellido del cliente :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 109, -1, -1));

        txtDni.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jPanel1.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 44, 358, 34));

        txtNombre.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 136, 358, 34));

        txtApellido.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 136, 358, 34));

        cmbBoxEstado.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        cmbBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grave", "Moderado", "Leve" }));
        jPanel1.add(cmbBoxEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 44, 358, 34));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 191));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel5.setText("Código del balon :");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 17, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel6.setText("Capacidad del balón (m3) :");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 17, -1, -1));

        txtCodigoBalon.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jPanel4.add(txtCodigoBalon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 44, 358, 34));

        txtCapacidadBalon.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jPanel4.add(txtCapacidadBalon, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 44, 358, 34));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 98));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Balones de oxígneo"));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblBalonesOxigeno.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        tblBalonesOxigeno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Capacidad"
            }
        ));
        tblBalonesOxigeno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tblBalonesOxigenoFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(tblBalonesOxigeno);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 23, 780, 340));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 98, 800, 379));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregarBalon.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        btnAgregarBalon.setText("Agregar balón de oxígeno");
        btnAgregarBalon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarBalonActionPerformed(evt);
            }
        });
        jPanel6.add(btnAgregarBalon, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 10, 280, 36));

        btnEliminarBalon.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        btnEliminarBalon.setText("Eliminar balón de oxígeno");
        btnEliminarBalon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarBalonActionPerformed(evt);
            }
        });
        jPanel6.add(btnEliminarBalon, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 10, 280, 36));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 477, 800, 56));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 191, 800, 533));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGenerarPedido.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        btnGenerarPedido.setText("Generar pedido");
        btnGenerarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarPedidoActionPerformed(evt);
            }
        });
        jPanel3.add(btnGenerarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 10, 280, 36));

        btnCancelarPedido.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        btnCancelarPedido.setText("Cancelar pedido");
        btnCancelarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarPedidoActionPerformed(evt);
            }
        });
        jPanel3.add(btnCancelarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 10, 280, 36));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 724, 800, 56));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarBalonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarBalonActionPerformed
        // TODO add your handling code here:
        miBalonOxigeno = new BalonOxigeno(txtCodigoBalon.getText(), Float.parseFloat(txtCapacidadBalon.getText()));
        misBalonesOxigeno.add(miBalonOxigeno);
        setTblBalonesOxigeno(misBalonesOxigeno);
        txtCodigoBalon.setText("");
        txtCapacidadBalon.setText("");
        txtCodigoBalon.requestFocus();
    }//GEN-LAST:event_btnAgregarBalonActionPerformed

    private void btnEliminarBalonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarBalonActionPerformed
        // TODO add your handling code here:
        misBalonesOxigeno.remove(tblBalonesOxigeno.getSelectedRow());
        setTblBalonesOxigeno(misBalonesOxigeno);
        txtCodigoBalon.setText("");
        txtCapacidadBalon.setText("");
    }//GEN-LAST:event_btnEliminarBalonActionPerformed

    private void btnGenerarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarPedidoActionPerformed
        // TODO add your handling code here:
        nuevoCliente = new Cliente(txtDni.getText(), txtNombre.getText(), txtApellido.getText(), cmbBoxEstado.getSelectedIndex()+1);
        nuevoPedido = new Pedido(miLista.getTamanio()+1, new Date(), nuevoCliente, (ArrayList<BalonOxigeno>)misBalonesOxigeno.clone()); // Por esta mrd ".clone()" casi me vuelvo loco >:'v
        miLista.agregarPedido(nuevoPedido);
        txtDni.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        cmbBoxEstado.setSelectedIndex(0);
        txtCodigoBalon.setText("");
        txtCapacidadBalon.setText("");
        misBalonesOxigeno.clear();
        setTblBalonesOxigeno(misBalonesOxigeno);
    }//GEN-LAST:event_btnGenerarPedidoActionPerformed

    private void btnCancelarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarPedidoActionPerformed
        // TODO add your handling code here:
        txtDni.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        cmbBoxEstado.setSelectedIndex(0);
        txtCodigoBalon.setText("");
        txtCapacidadBalon.setText("");
        misBalonesOxigeno.clear();
        setTblBalonesOxigeno(misBalonesOxigeno);
    }//GEN-LAST:event_btnCancelarPedidoActionPerformed

    private void tblBalonesOxigenoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblBalonesOxigenoFocusGained
        // TODO add your handling code here:
        // Si se seleccionó una fila de la tabla, carga los valores en el txt field
        if (tblBalonesOxigeno.getSelectedRow() != -1) {
            txtCodigoBalon.setText(tblBalonesOxigeno.getValueAt(tblBalonesOxigeno.getSelectedRow(), 0).toString());
            txtCapacidadBalon.setText(tblBalonesOxigeno.getValueAt(tblBalonesOxigeno.getSelectedRow(), 1).toString());
            jPanel5.requestFocus();
        }
    }//GEN-LAST:event_tblBalonesOxigenoFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarBalon;
    private javax.swing.JButton btnCancelarPedido;
    private javax.swing.JButton btnEliminarBalon;
    private javax.swing.JButton btnGenerarPedido;
    private javax.swing.JComboBox<String> cmbBoxEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBalonesOxigeno;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCapacidadBalon;
    private javax.swing.JTextField txtCodigoBalon;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    // Enlace a estructura de datos
    public void setListaEnlazada(Lista miLista) {
        this.miLista = miLista;
    }

    // Métodos auxiliares
    public void setTblBalonesOxigeno(ArrayList<BalonOxigeno> misBalonesOxigeno) {
        String[] columnas = {"Código", "Capacidad"};
        Object[][] miData = new Object[misBalonesOxigeno.size()][2];
        for (int i = 0; i < misBalonesOxigeno.size(); i++) {
            miData[i][0] = misBalonesOxigeno.get(i).getCodigo();
            miData[i][1] = misBalonesOxigeno.get(i).getCapacidad();
        }
        miDefaultTableModel = new DefaultTableModel(miData, columnas);
        tblBalonesOxigeno.setModel(miDefaultTableModel);
    }
}
