/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP3.Punto2;

public class Orco implements Runnable{
    Vida vida;

    public Orco(Vida vida) {
        this.vida = vida;
    }
    
    
    public void run(){
        int i=1;
        while(vida.getVida()>0){
            System.out.println("ataque "+Thread.currentThread().getName()+" -3");
            vida.sumar(-3,"ORCO");
            System.out.println("get vida"+Thread.currentThread().getName()+" "+vida.getVida());
            i++;
        }
    }
}