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
public class Updates {
    
        //Actualizar cantidad
    public String setNuevoStock(int q, int id){
        
        String update = "UPDATE Productos SET stock="+q+" Where idProducto ="+id+" ;";
        
        return update;
    }
    
}
