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
public class Peixe extends Animal{
    //atributos
    private String corEscama;
    
    //metodos

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Substâncias");
    }

    @Override
    public void emitirSon() {
        System.out.println("Peixe não faz son");
    }
    
    @Override
    public void print(){
        System.out.println(toString());
        emitirSon();
        alimentar();
        locomover();
        soltarBolhas();
    }
    
    @Override
    public String toString() {
        return "Peixe{" + "peso=" + peso + ", "
                + "idade=" + idade + ","
                + " menbros=" + menbros + "," +"Cor escama= "+ corEscama + '}';
    }
    public void soltarBolhas(){
        System.out.println("Soltando Bolhas");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
