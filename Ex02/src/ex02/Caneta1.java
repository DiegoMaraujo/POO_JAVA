/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex02;

/**
 *
 * @author Diego Martins
 */
public class Caneta1 {
   public String modelo;
   public String cor;
   //Private so dentro da  classe que pode ser mexido
   private float ponta;
   //Protected so mãe e os filhos
   protected int carga ;
   private boolean tampar;
   
   //Public qualquer um pode mexer
   public void status(){
        System.out.println("Modelo "+ this.modelo);
        System.out.println("Uma Caneta "+ this.cor);
        System.out.println("Ponta "+ this.ponta);
        System.out.println("Carga "+ this.carga);
        System.out.println("A caneta da tampada " + this.tampar);
    }
    
   public void rapiscar(){
        if(this.tampar == true){
            System.out.println("Erro, Não pode Rapiscar");
        }else{
            System.out.println("Rapiscando ");
        }
    }
   
   public void tampar(){
        this.tampar = true;
    }
    
   public  void destampar(){
        this.tampar = false;
    }
}
