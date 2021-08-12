/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;
import modelo.estructuras.Lista;
import modelo.objetos.BalonOxigeno;
import modelo.objetos.Pedido;

/**
 *
 * @author krypt97
 */
public class PanelHistorialPedidos extends javax.swing.JPanel {

    // Atributos de clase
    private Pedido pedido;
    private DefaultTableModel miDefaultTableModel;

    // Atributos a conectar
    private Lista miLista;

    /**
     * Creates new form PanelHistorialPedidos
     */
    public PanelHistorialPedidos() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListaEnlazada = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBalonesOxigeno = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Historial de pedidos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 15))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblListaEnlazada.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        tblListaEnlazada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Fecha", "Estado"
            }
        ));
        tblListaEnlazada.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tblListaEnlazadaFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(tblListaEnlazada);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 780, 297));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 328));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel1.setText("D.N.I. del cliente :");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 17, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel2.setText("Nombre del cliente :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 109, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel3.setText("Estado del peciente :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 17, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel4.setText("Apellido del cliente :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 109, -1, -1));

        txtDni.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        txtDni.setFocusable(false);
        jPanel2.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 44, 358, 37));

        txtNombre.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        txtNombre.setFocusable(false);
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 136, 358, 37));

        txtEstado.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        txtEstado.setFocusable(false);
        jPanel2.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 44, 358, 37));

        txtApellido.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        txtApellido.setFocusable(false);
        jPanel2.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 136, 358, 37));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 328, 800, 191));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Balones de oxígeno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 15))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblBalonesOxigeno.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        tblBalonesOxigeno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código del balón", "Capacidad"
            }
        ));
        tblBalonesOxigeno.setFocusable(false);
        jScrollPane2.setViewportView(tblBalonesOxigeno);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 780, 231));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 519, 800, 261));
    }// </editor-fold>//GEN-END:initComponents

    private void tblListaEnlazadaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblListaEnlazadaFocusGained
        // TODO add your handling code here:
        pedido = miLista.obtenerPedido(tblListaEnlazada.getSelectedRow() + 1);
        setFormularioCliente(pedido);
        setTblBalonesOxigeno(pedido.getBalones());
        jPanel1.requestFocus();
    }//GEN-LAST:event_tblListaEnlazadaFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblBalonesOxigeno;
    private javax.swing.JTable tblListaEnlazada;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    // Enlace lista enlazada
    public void setListaEnlazada(Lista miLista) {
        this.miLista = miLista;
    }

    // Métodos auxiliares de clase
    public void setTblListaEnlazada(LinkedList<Pedido> misPedidos) {
        String[] columnas = {"ID", "Fecha", "Estado"};
        Object[][] miData = new Object[misPedidos.size()][3];
        for (int i = 0; i < misPedidos.size(); i++) {
            miData[i][0] = misPedidos.get(i).getId();
            miData[i][1] = misPedidos.get(i).getFecha();

            switch (misPedidos.get(i).getEstado()) {
                case 1:
                    miData[i][2] = "En cola de espera";
                    break;
                case 2:
                    miData[i][2] = "En cola de llenado";
                    break;
                case 3:
                    miData[i][2] = "Rechazado";
                    break;
                case 4:
                    miData[i][2] = "Eliminado";
                    break;
                case 5:
                    miData[i][2] = "Despachado";
                    break;
            }
        }
        miDefaultTableModel = new DefaultTableModel(miData, columnas);
        tblListaEnlazada.setModel(miDefaultTableModel);
    }

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

    public void setFormularioCliente(Pedido miPedido) {
        txtDni.setText(miPedido.getCliente().getDni());
        txtApellido.setText(miPedido.getCliente().getApellido());
        txtNombre.setText(miPedido.getCliente().getNombre());
        switch (miPedido.getCliente().getEstadoPaciente()) {
            case 1:
                txtEstado.setText("Grave");
                break;
            case 2:
                txtEstado.setText("Moderado");
                break;
            case 3:
                txtEstado.setText("Leve");
                break;
        }
    }
}
