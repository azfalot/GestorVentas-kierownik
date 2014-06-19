/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import org.sqlite.SQLiteConfig;

/**
 *
 * @author carlos
 */
public class Inserts {

    Connection c = null;
    Statement stmt = null;

    public void insertCliente(String nombre, String dni, int telefono, String direccion) throws ClassNotFoundException, SQLException {
        //Creamos la conexion & abrimos las base de datos correctamente
        Class.forName("org.sqlite.JDBC");
        SQLiteConfig config = new SQLiteConfig();
        config.enforceForeignKeys(true);
        c = DriverManager.getConnection("jdbc:sqlite:db\\gestor.sqlite", config.toProperties());
        c.setAutoCommit(false);
        System.out.println("Opened database successfully");
        //Creamos la consulta
        stmt = c.createStatement();
        String sql = "INSERT INTO Cliente (idcliente,nombre,dni,telefono,direccion) "
                + "VALUES (NULL, " + "'" + nombre + "', '" + dni + "'," + telefono + ", '" + direccion + "' );";
        stmt.executeUpdate(sql);
        stmt.close();
        c.commit();
        c.close();

    }
    
    //Insert Clientes - Cliente Nuevo
    

}
