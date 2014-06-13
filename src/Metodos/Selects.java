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

    public Selects() {
        this.rellenarClientes = "SELECT nombre, dni, pais, email from clientes;";
        this.rellenarPedidos = "select p.IDPEDIDO,c.NOMBRE,p.FECHA,sum(A.precio) as total, p.ESTADO from\n"
                + "(select d.FK_PEDIDO as ped, d.CANTIDAD*pr.pvp as precio from productos pr,DetallePedidos d where pr.IDPRODUCTO=d.FK_PRODUCTO)A,\n"
                + "CLIENTES c,PEDIDOS p\n"
                + "where c.IDCLIENTE=p.FK_CLIENTE and p.IDPEDIDO=A.ped;";
    }

    public String getRellenarPedidos() {
        return rellenarPedidos;
    }

    public String getRellenarClientes() {
        return rellenarClientes;
    }
    
    public String clientePorNombre(String n){
        
        String consulta = "SELECT nombre, dni, pais, email from clientes "+
                "WHERE nombre='"+n+"';";
        return consulta;
    }
    
    

    
    
    
}
