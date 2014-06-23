/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Metodos.Inserts;
import Metodos.Selects;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author carlos
 */
public final class AltaPedido extends javax.swing.JDialog {

    Random r = new Random(System.currentTimeMillis());
    Selects c = new Selects();
    Inserts i = new Inserts();
    Thread t;

    //ArrayList que almacenara los Datos del pedido
    ArrayList<String> al = new ArrayList<>();

    private int idPedido;

    public int getIdPedido() {
        return idPedido = r.nextInt();
    }

    //Icono de la App
    ImageIcon icon2 = new ImageIcon("imagenes\\icono.png");

    /**
     * Creates new form AltaPedido
     *
     * @param parent
     * @param modal
     * @throws java.sql.SQLException
     */
    //Comprobante de que hay datos en el jTable
    int index = 0;

    public AltaPedido(java.awt.Frame parent, boolean modal) throws SQLException {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Nuevo Pedido");
        this.setIconImage(icon2.getImage());
        modelo();
        setListaClientes();
        setListaProductos();
    }

    //Metodo para establecer un DefaultTableModel
    public void modelo() {
        DefaultTableModel dtm = new DefaultTableModel();
        //Solucion final añadir tambien el Id y salir del paso
        dtm.addColumn("idProducto");
        dtm.addColumn("Producto");
        dtm.addColumn("Cantidad");
        dtm.addColumn("Precio");
        dtm.addColumn("Total");
        jTableDetallesProducto.setModel(dtm);

    }

    //Metodo para actualizar la lista de Clientes
    public void setListaClientes() throws SQLException {

        ResultSet rs;
        rs = Main.conexion.consulta(c.getNombresDeClientes());

        while (rs.next()) {
            jcBClientes.addItem(rs.getString(1));
        }
        rs.close();

    }

    //get Id Cliente con Nombre
    public int obtenerIdCliente() throws SQLException {

        ResultSet rs;
        rs = Main.conexion.consulta(c.idClientePorNomrbe(jcBClientes.getSelectedItem().toString()));
        int i = rs.getInt(1);
        rs.close();
        return i;

    }

    //obtener id producto con nombre
    public int obtenerIdProducto(String nombre) throws SQLException {

        ResultSet rs;
        rs = Main.conexion.consulta(c.idProductoPorNombre(nombre));
        int i = rs.getInt(1);
        rs.close();
        return i;

    }

    //obtener precio de producto con NOMBRE
    public Double obtenerPrecio() throws SQLException {

        ResultSet rs;
        rs = Main.conexion.consulta(c.getPrecioPorNombre(jcbProductos.getSelectedItem().toString()));
        Double d = rs.getDouble(1);
        rs.close();
        return d;

    }

    //rellenar combobox con Productos
    public void setListaProductos() throws SQLException {
        ResultSet rs;
        rs = Main.conexion.consulta(c.getNombreDeProductos());

        while (rs.next()) {
            jcbProductos.addItem(rs.getString(1));
        }
        rs.close();
    }

    public void toArray() {
        //Recorrer 
        for (int i = 0; i < jTableDetallesProducto.getRowCount(); i++){
            
            for (int a = 0; a < jTableDetallesProducto.getColumnCount(); a++){
                
                al.add(jTableDetallesProducto.getModel().getValueAt(i, a).toString());
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jcBClientes = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDetallesProducto = new javax.swing.JTable();
        jtfCantidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jcbProductos = new javax.swing.JComboBox();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setText("Datos del Cliente");

        jcBClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jcBClientesMousePressed(evt);
            }
        });
        jcBClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcBClientesActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add.png"))); // NOI18N
        jButton3.setToolTipText("Añadir Nuevo Cliente");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jcBClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(306, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jcBClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jLabel2.setText("Datos del Pedido");

        jTableDetallesProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableDetallesProducto);

        jtfCantidad.setText("0");

        jLabel4.setText("Producto");

        jLabel5.setText("Cantidad");

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add.png"))); // NOI18N
        jButton4.setToolTipText("Añadir Nuevo Cliente");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jcbProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbProductosActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setForeground(new java.awt.Color(255, 0, 0));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/del_1.png"))); // NOI18N
        jButton5.setText("Remove");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jcbProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtfCantidad))
                        .addGap(29, 29, 29)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jcbProductos)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jtfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tick.png"))); // NOI18N
        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cross.png"))); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(388, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        AltaCliente ac = new AltaCliente(null, true);
        ac.setSize(450, 350);
        ac.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jcBClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcBClientesMousePressed

    }//GEN-LAST:event_jcBClientesMousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            //Añadir un Nuevo Pedido + Detalles

            /*
             INSERT NEW PEDIDO (idPedido, fecha, fkCliente, estado)
             */
            int idPedido = getIdPedido();
            String estado = "Procesando";
            //Aqui haremos una consulta para Averiguar el Id del Cliente
            int fkCliente = obtenerIdCliente();

            //Realizar INSERTS
            if (index == 0) {
                JOptionPane.showMessageDialog(rootPane, "No ha añadido ningun producto a esta Compra", "Cesta Vacia", JOptionPane.INFORMATION_MESSAGE);
            } else {
                try {

                    //Introducimos pedido
                    Main.conexion.update(i.nuevoPedido(idPedido, "CURRENT_DATE", fkCliente, estado));

                    //Introducimos detalles
                    //No funciona como se esperaba
                    // for (int x = 0; x < jTableDetallesProducto.getModel().getRowCount(); x++) {
                    //int fkProducto = obtenerIdProducto(jTableDetallesProducto.getModel().getValueAt(x, 0).toString());
                    
                    
                               
                    
                    
                    
                    for (int x = 0; x < jTableDetallesProducto.getModel().getRowCount(); x++) {
                        
                    int fkProducto = Integer.valueOf(jTableDetallesProducto.getValueAt(x,0).toString());
                    System.out.println(fkProducto);

                    //Esto Funciona
                    Main.conexion.update(i.detallesPedido(idPedido, fkProducto,  Integer.valueOf(jTableDetallesProducto.getValueAt(x,2).toString())));
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(AltaPedido.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(AltaPedido.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            int cantidad = Integer.parseInt(jtfCantidad.getText());
            if (cantidad == 0) {

                JOptionPane.showMessageDialog(null,
                        "La cantidad minima de pedido por producto debe ser '1'");

            } else {
                //AÑADIR A LA CESTA DEL CARRITO
                //PRODUCTO CANTIDAD PRECIO
                int idProducto = obtenerIdProducto(jcbProductos.getSelectedItem().toString());
                String nombre = jcbProductos.getSelectedItem().toString();
                //Sera igual a lo obtenido por la consulta de 'precio por nombre'
                Double precio = obtenerPrecio();
                Double total = cantidad * precio;

                DefaultTableModel modelo = (DefaultTableModel) jTableDetallesProducto.getModel();

                Object[] fila = new Object[5];

                fila[0] = idProducto;
                fila[1] = nombre;
                fila[2] = cantidad;
                fila[3] = precio;
                fila[4] = total;

                modelo.addRow(fila);
                jTableDetallesProducto.setModel(modelo);

                index++;//SOLO SI SE HA AÑADIDO ALGUNA COMPRA CORRECTAMENTE
            }
        } catch (SQLException ex) {
            Logger.getLogger(AltaPedido.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jcBClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcBClientesActionPerformed

    }//GEN-LAST:event_jcBClientesActionPerformed

    private void jcbProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbProductosActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        index--;
        DefaultTableModel model = (DefaultTableModel) jTableDetallesProducto.getModel();

        int a = jTableDetallesProducto.getSelectedRow();

        if (a < 0) {

            JOptionPane.showMessageDialog(null,
                    "Debe seleccionar una fila de la tabla");

        } else {

            int confirmar = JOptionPane.showConfirmDialog(null,
                    "Esta seguro que desea Eliminar esta linea de pedido? ");

            if (JOptionPane.OK_OPTION == confirmar) {

                model.removeRow(a);

                JOptionPane.showMessageDialog(null, "Linea de pedido Eliminada");

            }

        }
    }//GEN-LAST:event_jButton5ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDetallesProducto;
    private javax.swing.JComboBox jcBClientes;
    private javax.swing.JComboBox jcbProductos;
    private javax.swing.JTextField jtfCantidad;
    // End of variables declaration//GEN-END:variables
}
