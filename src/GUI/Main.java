/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DB.Sqlite;
import Metodos.Listas;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;
import static java.util.ResourceBundle.getBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/*
 *
 * @author carlos
 */
public class Main extends javax.swing.JFrame {

    //Conexion
    static Sqlite conexion = Sqlite.getInstance();

    //Variable Global para tipo de Listado
    static int kList = 0;

    //Instanciando Dialogs para trabajar con ellas en el Frame Principal
    AltaCliente altaC = new AltaCliente(this, true);
    //Icono de la App
    ImageIcon icono = new ImageIcon("imagenes\\icono.png");


    //Istancia Lista
    Listas mL = new Listas();
    ArrayList<String> listOP;

    ResourceBundle res = getBundle("Lenguaje.Idioma", new Locale("es"));

    public Main() {

        initComponents();
        this.setIconImage(icono.getImage());
        this.setLocationRelativeTo(null);
        listOP = mL.getAl();
        jtpPestañas.setComponentPopupMenu(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoMenuBar = new javax.swing.ButtonGroup();
        menuPestañas = new javax.swing.JPopupMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jtpPestañas = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlOpciones = new javax.swing.JList();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        cBmi1 = new javax.swing.JCheckBoxMenuItem();
        cBmi2 = new javax.swing.JCheckBoxMenuItem();
        cBmi3 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        jMenuItem5.setText("Cerrar Pestaña");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        menuPestañas.add(jMenuItem5);

        jMenuItem6.setText("Cerrar todas las pestañas");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        menuPestañas.add(jMenuItem6);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kierownik");
        setBackground(new java.awt.Color(0, 204, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setFocusable(false);
        setName("MainFrame"); // NOI18N

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jButton4.setText("Ventas");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);

        jButton5.setText("Compras");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);

        jButton6.setText("Almacen");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);

        jButton7.setText("Contabilidad");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);

        jButton8.setText("Configuracion");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);

        jtpPestañas.setBackground(new java.awt.Color(0, 102, 102));
        jtpPestañas.setComponentPopupMenu(menuPestañas);

        jlOpciones.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jlOpcionesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jlOpciones);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtpPestañas, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                    .addComponent(jtpPestañas))
                .addContainerGap())
        );

        jMenu1.setText("Archivo");

        miSalir.setText("Salir");
        miSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSalirActionPerformed(evt);
            }
        });
        jMenu1.add(miSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Usuario");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Opciones");

        jMenu5.setText("Barra de Menú");

        grupoMenuBar.add(cBmi1);
        cBmi1.setSelected(true);
        cBmi1.setText("Texto & Iconos");
        jMenu5.add(cBmi1);

        grupoMenuBar.add(cBmi2);
        cBmi2.setText("Solo Texto");
        jMenu5.add(cBmi2);

        grupoMenuBar.add(cBmi3);
        cBmi3.setText("Solo Iconos");
        cBmi3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBmi3ActionPerformed(evt);
            }
        });
        jMenu5.add(cBmi3);

        jMenu3.add(jMenu5);

        jMenuItem1.setText("Configuracion");
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Ayuda");

        jMenuItem4.setText("Manual de Usuario");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuItem3.setText("Licencia");
        jMenu4.add(jMenuItem3);

        jMenuItem2.setText("Acerca de..");
        jMenu4.add(jMenuItem2);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSalirActionPerformed
        try {
            System.exit(0);
            conexion.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_miSalirActionPerformed

    private void cBmi3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBmi3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cBmi3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //Borramos lo que haya en la lista
        jlOpciones.removeAll();
        //Variable global pasa a ser 1 = a Ventas
        kList = 1;
        //Cargamos el Tipo de Lista
        mL.tipo1();
        //Cargamos la lista de Opciones
        Object[] array = listOP.toArray();
        jlOpciones.setListData(array);
        //para evitar copias extra del listado
        mL.borrarLista();


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //Borramos lo que haya en la lista
        jlOpciones.removeAll();
        //Variable global pasa a ser 2 = a Compras
        kList = 2;
        //Cargamos el Tipo de Lista
        mL.tipo2();
        //Cargamos la lista de Opciones
        Object[] array = listOP.toArray();
        jlOpciones.setListData(array);
        //para evitar copias extra del listado
        mL.borrarLista();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        //Borramos lo que haya en la lista
        jlOpciones.removeAll();
        //Variable global pasa a ser 3 = a Almacen
        kList = 3;
        //Cargamos el Tipo de Lista
        mL.tipo3();
        //Cargamos la lista de Opciones
        Object[] array = listOP.toArray();
        jlOpciones.setListData(array);
        //para evitar copias extra del listado
        mL.borrarLista();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        //Borramos lo que haya en la lista
        jlOpciones.removeAll();
        //Variable global pasa a ser 4 = a Contabilidad
        kList = 4;
        //Cargamos el Tipo de Lista
        mL.tipo4();
        //Cargamos la lista de Opciones
        Object[] array = listOP.toArray();
        jlOpciones.setListData(array);
        //para evitar copias extra del listado
        mL.borrarLista();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jlOpcionesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jlOpcionesValueChanged

        //Leer Variable Global
        /*
         * Si la variable global es = 0 no hacer nada
         * Si es = a X que lea la posicion y cargue la ventana correspondiente
         */
        //Activamos el componenteMenu
        jtpPestañas.setComponentPopupMenu(menuPestañas);
        if (!evt.getValueIsAdjusting()) {
            //Listado de Ventas
            if (kList == 1) {
                //Leer posicion que sera igual a lo que obtenga de la Lista
                int posicion = jlOpciones.getSelectedIndex();

                switch (posicion) {
                    case 0:
                        try {
                            //lanzar ventana pedidos 
                            jtpPestañas.addTab("Pedidos", new Pedidos());
                        } catch (SQLException ex) {
                            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        break;
                    case 1:
                        try {
                            // lanzar ventana cartera de clientes
                            jtpPestañas.addTab("Clientes", new Clientes());
                        } catch (SQLException ex) {
                            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        break;
                    case 2:// lanzar ventana tarifas
                        
                        break;
                }
            }
            //Para la Lista de Compras
            if (kList == 2) {
                //Leer posicion que sera igual a lo que obtenga de la Lista
                int posicion = jlOpciones.getSelectedIndex();

                switch (posicion) {
                    case 0:
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                }
            }
            //Para la Lista de Almacen
            if (kList == 3) {
                //Leer posicion que sera igual a lo que obtenga de la Lista
                int posicion = jlOpciones.getSelectedIndex();

                switch (posicion) {
                    case 0:
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                }
            }
            //Para la Lista de Contabilidad
            if (kList == 4) {
                //Leer posicion que sera igual a lo que obtenga de la Lista
                int posicion = jlOpciones.getSelectedIndex();

                switch (posicion) {
                    case 0:
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                }
            }
        }


    }//GEN-LAST:event_jlOpcionesValueChanged

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // Cerrar pestaña actual
        if (jtpPestañas.getSelectedIndex() == 0) {

            jtpPestañas.remove(jtpPestañas.getSelectedIndex());
            jtpPestañas.setComponentPopupMenu(null);

        } else if (jtpPestañas.getSelectedIndex() >= 1) {

            jtpPestañas.remove(jtpPestañas.getSelectedIndex());

        }

    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // Cerrar todas las Pestañas
        jtpPestañas.removeAll();
        jtpPestañas.setComponentPopupMenu(null);

    }//GEN-LAST:event_jMenuItem6ActionPerformed

    public static void main(String args[]) throws ClassNotFoundException, SQLException {

        new Thread(new Splash()).start();
        // Creando conexion SQL 
        //Sqlite condb = new Sqlite();
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem cBmi1;
    private javax.swing.JCheckBoxMenuItem cBmi2;
    private javax.swing.JCheckBoxMenuItem cBmi3;
    private javax.swing.ButtonGroup grupoMenuBar;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList jlOpciones;
    private javax.swing.JTabbedPane jtpPestañas;
    private javax.swing.JPopupMenu menuPestañas;
    private javax.swing.JMenuItem miSalir;
    // End of variables declaration//GEN-END:variables
}
