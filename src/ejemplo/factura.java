/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Estudiante
 */
public class factura {
    private HashMap<String, producto> productos;

    public factura() {
        this.productos = new HashMap<>();
    }
    
    public void adicionarproducto(producto product){
        this.productos.put(product.getNombre(), product);
    }
    
    public HashMap<String, producto> listarProducto(){
        return this.productos;
    }
    
    public double calcularTotal(){
        double total= 0;
        for(producto product: productos.values()){
            total+= product.getPrecio();
        }
        return total;
    }
    
    
}
