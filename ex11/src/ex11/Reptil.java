/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex11;

/**
 *
 * @author Diego Martins
 */
public class Reptil extends Animal{
    //atributos
    private String corEscama;
    
    //metodos
    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo vejetais");
    }

    @Override
    public void emitirSon() {
        System.out.println("Emitindo son de Reptil");
    }
    
    @Override
    public void print(){
        System.out.println(toString());
        emitirSon();
        alimentar();
        locomover();
    }
    
    @Override
    public String toString() {
        return "Reptil{" + "peso=" + peso + ", "
                + "idade=" + idade + ","
                + " menbros=" + menbros + "," + "Cor escama= "+ corEscama + '}';
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
