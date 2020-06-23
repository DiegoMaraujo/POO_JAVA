/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex03;

/**
 *
 * @author Diego Martins
 */
public class Caneta {
    

    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampar;
    
    public Caneta(String m, String c, float p){//metodo construdor
        this.modelo = m;
        this.ponta = p;
        this.cor = c;
        this.tampar();
        
        
    }
    
    public String getModelo(){//metodo get == pegar
        return this.modelo;
    }
    public void setModelo(String m){//metodo set == passar
        this.modelo = m;
    }
    public float getPonta(float p){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }
    public void tampar(){
        this.tampar = true;
    }
    public void destampar(){
        this.tampar = false;
    }
    public void rapiscar(){
        if(this.tampar == true ){
            System.out.println("Erro: Caneta tampada");
        }else{
            System.out.println("Rapiscando Caneta destampada");
        }
    }
    public void status(){
        System.out.println("Sobre a caneta: ");
        System.out.println("Modelo "+ this.getModelo());
        System.out.println("Ponta "+ this.getPonta(0.5f));
        System.out.println("Cor " + this.cor);
    }
}
