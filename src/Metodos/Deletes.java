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
public class Deletes {
    
    
    public String deleteLineaPedidos(int id){
        
        String consulta = "DELETE FROM Pedidos Where idPedido="+id+";";
        
        return consulta;
        
    }
    
    //Eliminar Clientes
    public String borrarCliente(String dni){
        
        String consulta = "DELETE FROM Clientes Where dni='"+dni+"';";
        
        return consulta;
        
    }
    //Eliminar Proveedores
    public String borrarProveedor (int id){
        
        String consulta = "DELETE FROM Proveedores Where idProveedor='"+id+"';";
        
        return consulta;
        
    }
}
