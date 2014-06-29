 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DB.Sqlite;
import Metodos.Listas;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;
import static java.util.ResourceBundle.getBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.help.HelpBroker;
import javax.help.HelpSet;
import javax.help.HelpSetException;
import javax.swing.ImageIcon;

/*
 *
 * @author carlos
 */
public final class Main extends javax.swing.JFrame {

    //Conexion
    static Sqlite conexion = Sqlite.getInstance();

    //Indice para las pestañas del TabbedPane
    static int indice = -1;

    //Variable Global para tipo de Listado
    static int kList = 0;

    //Instanciando Dialogs para trabajar con ellas en el Frame Principal
    AltaCliente altaC = new AltaCliente(this, true);
    //Iconos de la App
    ImageIcon icono = new ImageIcon("imagenes\\icono.png");
    ImageIcon stock = new ImageIcon("imagenes\\stock.png");
    ImageIcon buy = new ImageIcon("imagenes\\buy.png");
    ImageIcon sell = new ImageIcon("imagenes\\sell.png");
    ImageIcon cfg = new ImageIcon("imagenes\\cfg.png");
    ImageIcon acc = new ImageIcon("imagenes\\books.png");

    //Istancia Lista
    Listas mL = new Listas();
    ArrayList<String> listOP;

    static ResourceBundle res = getBundle("Lenguaje.Idioma", new Locale("es"));

    public static ResourceBundle getRes() {
        return res;
    }

    public Main() throws MalformedURLException, HelpSetException {

        initComponents();
        this.setIconImage(icono.getImage());
        this.setSize(900, 450);
        this.setLocationRelativeTo(null);
        listOP = mL.getAl();
        jtpPestañas.setComponentPopupMenu(null);
        misIconos();
        jHelp();

    }

    public void misIconos() {
        btnAlmacen.setIcon(stock);
        btnCompras.setIcon(buy);
        btnConfiguracion.setIcon(cfg);
        btnContabilidad.setIcon(acc);
        btnVentas.setIcon(sell);
    }

    //Metodos para cambiar de idioma
    public void aEspañol() {
        res = getBundle("Lenguaje.Idioma", new Locale("es"));
        cargarIdioma();
    }

    public void toEnglish() {
        res = getBundle("Lenguaje.Idioma", Locale.ENGLISH);
        cargarIdioma();
    }

    public void doPolski() {
        res = getBundle("Lenguaje.Idioma", new Locale("PL"));
        cargarIdioma();
    }

    public void cargarIdioma() {
        miSalir.setText(res.getString("SALIR"));
        menuAcerca.setText(res.getString("ACERCA DE.."));
        menuArchivo.setText(res.getString("ARCHIVO"));
        menuAyuda.setText(res.getString("AYUDA"));
        twist.setText(res.getString("TEXTO & ICONOS"));
        soloIcon.setText(res.getString("SOLO ICONOS"));
        solotext.setText(res.getString("SOLO TEXTO"));
        barMenu.setText(res.getString("BARRA DE MENÚ"));
        menuCfg.setText(res.getString("CONFIGURACION"));
        menuLicencia.setText(res.getString("LICENCIA"));
        menuManual.setText(res.getString("MANUAL DE USUARIO"));
        menuOpciones.setText(res.getString("OPCIONES"));
        btnAlmacen.setText(res.getString("ALMACEN"));
        btnCompras.setText(res.getString("COMPRAS"));
        btnConfiguracion.setText(res.getString("CONFIGURACION"));
        btnContabilidad.setText(res.getString("CONTABILIDAD"));
        btnVentas.setText(res.getString("VENTAS"));
        cerrarPestaña.setText(res.getString("CERRAR PESTAÑA"));
        cerrarTodas.setText(res.getString("CERRAR TODAS LAS PESTAÑAS"));
    }

    //Cargar AYUDA
    public void jHelp() throws MalformedURLException, HelpSetException {

        try {
            // Carga el fichero de ayuda
            File fichero = new File("./help/help_set.hs");
            URL hsURL = fichero.toURI().toURL();

            // Crea el HelpSet y el HelpBroker
            HelpSet helpset = new HelpSet(getClass().getClassLoader(), hsURL);
            HelpBroker hb = helpset.createHelpBroker();

            // Pone ayuda a item de menu al pulsarlo y a F1 en ventana
            // principal y secundaria.
            hb.enableHelpOnButton(menuManual, "indice", helpset);
            // hb.enableHelpKey(getRootPane(), "ventana_principal", helpset);
            // hb.enableHelpOnButton(jButton1, "ventana_principal", helpset);
            // hb.enableHelpOnButton(jButton2, "ventana_secundaria", helpset);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoMenuBar = new javax.swing.ButtonGroup();
        menuPestañas = new javax.swing.JPopupMenu();
        cerrarPestaña = new javax.swing.JMenuItem();
        cerrarTodas = new javax.swing.JMenuItem();
        jToolBar1 = new javax.swing.JToolBar();
        jPanel1 = new javax.swing.JPanel();
        btnVentas = new javax.swing.JButton();
        btnCompras = new javax.swing.JButton();
        btnAlmacen = new javax.swing.JButton();
        btnContabilidad = new javax.swing.JButton();
        btnConfiguracion = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jtpPestañas = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlOpciones = new javax.swing.JList();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        miSalir = new javax.swing.JMenuItem();
        menuOpciones = new javax.swing.JMenu();
        barMenu = new javax.swing.JMenu();
        twist = new javax.swing.JCheckBoxMenuItem();
        solotext = new javax.swing.JCheckBoxMenuItem();
        soloIcon = new javax.swing.JCheckBoxMenuItem();
        menuCfg = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();
        menuManual = new javax.swing.JMenuItem();
        menuLicencia = new javax.swing.JMenuItem();
        menuAcerca = new javax.swing.JMenuItem();

        cerrarPestaña.setText("Cerrar Pestaña");
        cerrarPestaña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarPestañaActionPerformed(evt);
            }
        });
        menuPestañas.add(cerrarPestaña);

        cerrarTodas.setText("Cerrar todas las pestañas");
        cerrarTodas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarTodasActionPerformed(evt);
            }
        });
        menuPestañas.add(cerrarTodas);

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kierownik");
        setBackground(new java.awt.Color(0, 204, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setFocusable(false);
        setName("MainFrame"); // NOI18N

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        btnVentas.setBackground(new java.awt.Color(153, 153, 153));
        btnVentas.setText("Ventas");
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });
        jPanel1.add(btnVentas);

        btnCompras.setBackground(new java.awt.Color(153, 153, 153));
        btnCompras.setText("Compras");
        btnCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprasActionPerformed(evt);
            }
        });
        jPanel1.add(btnCompras);

        btnAlmacen.setBackground(new java.awt.Color(153, 153, 153));
        btnAlmacen.setText("Almacen");
        btnAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlmacenActionPerformed(evt);
            }
        });
        jPanel1.add(btnAlmacen);

        btnContabilidad.setBackground(new java.awt.Color(153, 153, 153));
        btnContabilidad.setText("Contabilidad");
        btnContabilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContabilidadActionPerformed(evt);
            }
        });
        jPanel1.add(btnContabilidad);

        btnConfiguracion.setBackground(new java.awt.Color(153, 153, 153));
        btnConfiguracion.setText("Configuracion");
        btnConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiguracionActionPerformed(evt);
            }
        });
        jPanel1.add(btnConfiguracion);

        jtpPestañas.setBackground(new java.awt.Color(102, 102, 102));
        jtpPestañas.setComponentPopupMenu(menuPestañas);

        jlOpciones.setBackground(new java.awt.Color(204, 204, 204));
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
                .addComponent(jtpPestañas))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                    .addComponent(jtpPestañas))
                .addContainerGap())
        );

        jMenuBar1.setBackground(new java.awt.Color(153, 153, 153));

        menuArchivo.setText("Archivo");

        miSalir.setText("Salir");
        miSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSalirActionPerformed(evt);
            }
        });
        menuArchivo.add(miSalir);

        jMenuBar1.add(menuArchivo);

        menuOpciones.setText("Opciones");

        barMenu.setText("Barra de Menú");

        grupoMenuBar.add(twist);
        twist.setSelected(true);
        twist.setText("Texto & Iconos");
        twist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twistActionPerformed(evt);
            }
        });
        barMenu.add(twist);

        grupoMenuBar.add(solotext);
        solotext.setText("Solo Texto");
        solotext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solotextActionPerformed(evt);
            }
        });
        barMenu.add(solotext);

        grupoMenuBar.add(soloIcon);
        soloIcon.setText("Solo Iconos");
        soloIcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soloIconActionPerformed(evt);
            }
        });
        barMenu.add(soloIcon);

        menuOpciones.add(barMenu);

        menuCfg.setText("Configuracion");
        menuCfg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCfgActionPerformed(evt);
            }
        });
        menuOpciones.add(menuCfg);

        jMenuBar1.add(menuOpciones);

        menuAyuda.setText("Ayuda");

        menuManual.setText("Manual de Usuario");
        menuManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuManualActionPerformed(evt);
            }
        });
        menuAyuda.add(menuManual);

        menuLicencia.setText("Licencia");
        menuAyuda.add(menuLicencia);

        menuAcerca.setText("Acerca de..");
        menuAyuda.add(menuAcerca);

        jMenuBar1.add(menuAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
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

    private void soloIconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soloIconActionPerformed
        // SOLO ICONOS
        btnAlmacen.setText(null);
        btnCompras.setText(null);
        btnConfiguracion.setText(null);
        btnVentas.setText(null);
        btnContabilidad.setText(null);
        misIconos();

    }//GEN-LAST:event_soloIconActionPerformed

    private void menuManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuManualActionPerformed
        try {
            jHelp();
        } catch (MalformedURLException | HelpSetException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuManualActionPerformed

    private void btnConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracionActionPerformed
        Configuracion cfg = new Configuracion(this, true);
        cfg.setVisible(true);
    }//GEN-LAST:event_btnConfiguracionActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
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


    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprasActionPerformed
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
    }//GEN-LAST:event_btnComprasActionPerformed

    private void btnAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlmacenActionPerformed
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
    }//GEN-LAST:event_btnAlmacenActionPerformed

    private void btnContabilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContabilidadActionPerformed
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
    }//GEN-LAST:event_btnContabilidadActionPerformed

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
                            jtpPestañas.addTab(res.getString("PEDIDOS"), new Pedidos());
                            indice++;
                            jtpPestañas.setSelectedIndex(indice);

                        } catch (SQLException ex) {
                            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        break;
                    case 1:
                        try {
                            // lanzar ventana cartera de clientes
                            jtpPestañas.addTab(res.getString("CLIENTES"), new Clientes());
                            indice++;
                            jtpPestañas.setSelectedIndex(indice);
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
                    //Lanzar ventana Compras
                    case 1:
                        jtpPestañas.addTab(res.getString("COMPRAS"), new Compras());
                        indice++;
                        jtpPestañas.setSelectedIndex(indice);
                        break;
                    //Lanzar ventana proveedores
                    case 0:
                        try {
                            jtpPestañas.addTab(res.getString("PROVEEDORES"), new Proveedores());
                        } catch (SQLException ex) {
                            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        indice++;
                        jtpPestañas.setSelectedIndex(indice);
                        break;
                }
            }
            //Para la Lista de Almacen
            if (kList == 3) {
                //Leer posicion que sera igual a lo que obtenga de la Lista
                int posicion = jlOpciones.getSelectedIndex();

                switch (posicion) {
                    //Lanzar Productos
                    case 0:
                        try {
                            jtpPestañas.addTab(res.getString("PRODUCTOS"), new Productos());
                        } catch (SQLException ex) {
                            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        indice++;
                        jtpPestañas.setSelectedIndex(indice);
                        break;
                    //Lanzar Movimientos
                    case 1:
                        jtpPestañas.addTab(res.getString("MOVIMIENTOS"), new Movimientos());
                        indice++;
                        jtpPestañas.setSelectedIndex(indice);
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
                    //Clientes
                    case 0:
                        try {
                            jtpPestañas.addTab(res.getString("CLIENTES"), new Clientes());
                        } catch (SQLException ex) {
                            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        indice++;
                        jtpPestañas.setSelectedIndex(indice);

                        break;
                    //Proveedores
                    case 1:
                        try {
                            jtpPestañas.addTab(res.getString("PROVEEDORES"), new Proveedores());
                        } catch (SQLException ex) {
                            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        indice++;
                        jtpPestañas.setSelectedIndex(indice);
                        break;
                    //Plan Contable
                    case 2:
                        break;
                }
            }
        }


    }//GEN-LAST:event_jlOpcionesValueChanged

    private void cerrarPestañaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarPestañaActionPerformed
        // Cerrar pestaña actual
        if (jtpPestañas.getSelectedIndex() == 0) {

            jtpPestañas.remove(jtpPestañas.getSelectedIndex());

            //jtpPestañas.setComponentPopupMenu(null);
            indice--;
            if (indice == -1) {
                jtpPestañas.setComponentPopupMenu(null);
            }

        } else if (jtpPestañas.getSelectedIndex() >= 1) {

            jtpPestañas.remove(jtpPestañas.getSelectedIndex());
            indice--;

        }

    }//GEN-LAST:event_cerrarPestañaActionPerformed

    private void cerrarTodasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarTodasActionPerformed
        // Cerrar todas las Pestañas
        jtpPestañas.removeAll();
        jtpPestañas.setComponentPopupMenu(null);
        indice = -1;

    }//GEN-LAST:event_cerrarTodasActionPerformed

    private void twistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twistActionPerformed
        // TEXTO E ICONOS
        misIconos();
        btnAlmacen.setText(res.getString("ALMACEN"));
        btnCompras.setText(res.getString("COMPRAS"));
        btnConfiguracion.setText(res.getString("CONFIGURACION"));
        btnContabilidad.setText(res.getString("CONTABILIDAD"));
        btnVentas.setText(res.getString("VENTAS"));

    }//GEN-LAST:event_twistActionPerformed

    private void solotextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solotextActionPerformed
        //Solo TEXTO
        btnAlmacen.setIcon(null);
        btnCompras.setIcon(null);
        btnConfiguracion.setIcon(null);
        btnContabilidad.setIcon(null);
        btnVentas.setIcon(null);
        btnAlmacen.setText(res.getString("ALMACEN"));
        btnCompras.setText(res.getString("COMPRAS"));
        btnConfiguracion.setText(res.getString("CONFIGURACION"));
        btnContabilidad.setText(res.getString("CONTABILIDAD"));
        btnVentas.setText(res.getString("VENTAS"));
    }//GEN-LAST:event_solotextActionPerformed

    private void menuCfgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCfgActionPerformed
        Configuracion cfg = new Configuracion(this, true);
        cfg.setVisible(true);
    }//GEN-LAST:event_menuCfgActionPerformed

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
    private javax.swing.JMenu barMenu;
    private javax.swing.JButton btnAlmacen;
    private javax.swing.JButton btnCompras;
    private javax.swing.JButton btnConfiguracion;
    private javax.swing.JButton btnContabilidad;
    private javax.swing.JButton btnVentas;
    private javax.swing.JMenuItem cerrarPestaña;
    private javax.swing.JMenuItem cerrarTodas;
    private javax.swing.ButtonGroup grupoMenuBar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JList jlOpciones;
    private javax.swing.JTabbedPane jtpPestañas;
    private javax.swing.JMenuItem menuAcerca;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenuItem menuCfg;
    private javax.swing.JMenuItem menuLicencia;
    private javax.swing.JMenuItem menuManual;
    private javax.swing.JMenu menuOpciones;
    private javax.swing.JPopupMenu menuPestañas;
    private javax.swing.JMenuItem miSalir;
    private javax.swing.JCheckBoxMenuItem soloIcon;
    private javax.swing.JCheckBoxMenuItem solotext;
    private javax.swing.JCheckBoxMenuItem twist;
    // End of variables declaration//GEN-END:variables
}
