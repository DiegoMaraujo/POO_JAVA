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
public class Ave extends Animal {
    //atributos
    private String corPena;
    //metodos

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comento Frutas");
    }

    @Override
    public void emitirSon() {
        System.out.println("Som de Ave");
    }
    public void fazerNinho(){
        System.out.println("Fazendo ninho");
    }

    
    @Override
     public void print(){
        System.out.println(toString());
        emitirSon();
        alimentar();
        locomover();
        fazerNinho();
    }
    
    @Override
    public String toString() {
        return "Ave{" + "peso=" + peso + ", "
                + "idade=" + idade + ","
                + " menbros=" + menbros +  '}';
    }
    
    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    
}
