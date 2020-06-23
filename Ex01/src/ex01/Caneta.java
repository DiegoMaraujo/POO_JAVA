/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01;

/**
 *
 * @author Diego Martins
 */
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga ;
    boolean tampar;
    
    void status(){
        System.out.println("Modelo "+ this.modelo);
        System.out.println("Uma Caneta "+ this.cor);
        System.out.println("Ponta "+ this.ponta);
        System.out.println("Carga "+ this.carga);
        System.out.println("A caneta da tampada " + this.tampar);
    }
    
    void rapiscar(){
        if(this.tampar == true){
            System.out.println("Erro, Não pode Rapiscar");
        }else{
            System.out.println("Rapiscando ");
        }
    }
    void tampar(){
        this.tampar = true;
    }
    
    void destampar(){
        this.tampar = false;
    }
}
