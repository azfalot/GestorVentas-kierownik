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
public class Inserts {

    //INSERTS DE LA BASE DE DATOS
    //Añadir un cliente nuevo
    public String nuevoCliente(String s1, String s2, String s3, String s4, int i, String s5) {

        String insert = "INSERT INTO Clientes (idCliente,dni,nombre,pais,email,telefono,direccion)"
                + "VALUES (" + null + ", '" + s1 + "', '" + s2 + "', '" + s3 + "', '" + s4 + "', " + i + ", '" + s5 + "');";

        return insert;
    }

    //Pedido Nuevo
    public String nuevoPedido(int id, String d, int fkCliente, String estado) {

        String insert = "INSERT INTO Pedidos (idPedido,fecha,fk_cliente,estado)\n"
                + " VALUES(" + id + "," + d + "," + fkCliente + ",'" + estado + "');";
        return insert;

    }

    //Detalles de pedidos
    public String detallesPedido(int idPedido, int idProducto, int cantidad) {

        String insert = "INSERT INTO DetallePedidos (idDetallePedido,fk_pedido,fk_producto,cantidad)\n"
                + " VALUES(" + null + "," + idPedido + "," + idProducto + "," + cantidad + ");";

        return insert;

    }

}
