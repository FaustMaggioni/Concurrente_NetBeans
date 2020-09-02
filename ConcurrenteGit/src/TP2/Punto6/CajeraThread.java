/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP2.Punto6;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CajeraThread extends Thread {

    private String nombre;
    private Cliente cliente;
    private long initialTime;
// Constructor, y métodos de acceso

    public void run() {
        System.out.println("La cajera " + this.nombre
                + " COMIENZA A PROCESAR LA COMPRA DEL CLIENTE "
                + this.cliente.getNombre() + " EN EL TIEMPO: "
                + (System.currentTimeMillis() - this.initialTime) / 1000 + "seg");
        for (int i = 0; i < this.cliente.getCarroCompra().length; i++) {
            try {
                this.esperarXsegundos(cliente.getCarroCompra()[i]);
                System.out.println("Procesado el producto " + (i + 1) + "del cliente " + this .cliente.getNombre() + "->Tiempo: " +(System.currentTimeMillis() - this.initialTime
                        
                        
                        ) / 1000+"seg" );
            } catch (InterruptedException ex) {
                Logger.getLogger(CajeraThread.class.getName()).log(Level.SEVERE, null, ex);
            }
}
System.out.println("La cajera" + this.nombre + "HA TERMINADO DEPROCESAR "+this .cliente.getNombre() + " EN EL TIEMPO: " +
(System.currentTimeMillis() - this.initialTime
    

    

) / 1000 +"seg" );
}

    public CajeraThread(String nombre, Cliente cliente, long initialTime) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.initialTime = initialTime;
    }
     public static void esperarXsegundos(int i) throws InterruptedException {
        Thread.sleep(i*1000);
    }
}
