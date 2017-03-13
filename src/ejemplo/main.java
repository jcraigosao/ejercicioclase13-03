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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        factura fact= new factura();
        producto p1= new producto();
        p1.setNombre("gaseosa");
        p1.setPrecio(5000);
        
        producto p2= new producto();
        p2.setNombre("papas");
        p2.setPrecio(2000);
        
        fact.adicionarproducto(p1);
        fact.adicionarproducto(p2);
        
       HashMap<String, producto> lista= fact.listarProducto();
       for(String clave: lista.keySet()){
           producto p= lista.get(clave);
           System.out.println(p.getNombre() + " " + p.getPrecio());
       }
       
//       for(producto p: lista.values()){
//           System.out.println(p.getNombre()+ " "+ p.getPrecio());
//       }
    }
    
}
