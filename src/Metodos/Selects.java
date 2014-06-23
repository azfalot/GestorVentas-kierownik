/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Metodos;

/**
 *
 * @author carlos
 */
public class Selects {
    
    /*
    Aqui iran todas las consultas que en algun momento se puedan ejecutar a 
    traves de alguna accion
    
    */
    
   private final String rellenarPedidos;
   private final String rellenarClientes;
   private final String rellenarProductos;
   private final String nombresDeClientes;
   private final String nombreDeProductos;
   private final String obtenerFecha;


    public Selects() {
        this.obtenerFecha="SELECT date('now');";
        this.nombreDeProductos="SELECT nombre FROM Productos";
        this.nombresDeClientes="SELECT nombre FROM clientes";
        this.rellenarProductos="SELECT nombre, pvp, stock FROM productos;";
        this.rellenarClientes ="SELECT nombre, dni, pais, email from clientes;";
        this.rellenarPedidos ="SELECT p.idpedido, c.nombre, p.fecha, sum(pr.pvp*dp.cantidad)total, p.estado\n" +
                              "FROM productos pr, pedidos p, clientes c, detallepedidos dp\n" +
                              "WHERE dp.fk_producto=pr.idproducto and dp.fk_pedido=p.idpedido and p.fk_cliente=c.idcliente\n" +
                              "GROUP BY p.idpedido";
    }

    public String getObtenerFecha() {
        return obtenerFecha;
    }
    

    public String getNombreDeProductos() {
        return nombreDeProductos;
    }

    
    public String getNombresDeClientes() {
        return nombresDeClientes;
    }

    
    public String getRellenarPedidos() {
        return rellenarPedidos;
    }

    public String getRellenarClientes() {
        return rellenarClientes;
    }
    
    // SELECT CLIENTES POR NOMBRE
    public String clientePorNombre(String n){
        
        String consulta = "SELECT nombre, dni, pais, email from clientes "+
                          "WHERE nombre='"+n+"';";
        return consulta;
    }
    //SELECT PEDIDOS POR NOMBRE
    public String pedidosPorNombre(String n){
        String consulta = "SELECT p.idpedido, c.nombre, p.fecha, sum(pr.pvp*dp.cantidad)total, p.estado\n" +
                          "FROM productos pr, pedidos p, clientes c, detallepedidos dp\n" +
                          "WHERE dp.fk_producto=pr.idproducto and dp.fk_pedido=p.idpedido and p.fk_cliente=c.idcliente and c.nombre='"+n+"'\n" +
                          "GROUP BY p.idpedido;";
        return consulta;
    }
    //SELECT ID CLIENTE POR NOMBRE
    public String idClientePorNomrbe(String n){
        String consulta = "SELECT idCliente \n" +
                          "FROM Clientes\n" +
                          "WHERE nombre='"+n+"';";
        return consulta;
    }
    //SELECT ID PRODUCTO POR NOMBRE
    public String idProductoPorNombre(String n){
        String consulta = "SELECT idProducto \n" +
                          "FROM Productos\n" +
                          "WHERE nombre='"+n+"';";
        return consulta;
    }
    //Obtener el precio de un producto
    public String getPrecioPorNombre(String d){
        
        String consulta = "SELECT pvp \n" +
                          "FROM Productos\n" +
                          "WHERE nombre='"+d+"';";
        
       return consulta;
        
     
    }

    public String getRellenarProductos() {
        return rellenarProductos;
    }
    
    

    
    
    
}
