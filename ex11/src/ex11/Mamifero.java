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
public class Mamifero extends Animal{
    //atributos
    protected String corPelo;
    
    //metodos
    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Se Alimentando");
    }

    @Override
    public void emitirSon() {
        System.out.println("Som de Mamífero");
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
        return "Mamifero{" + "peso=" + peso + ", "
                + "idade=" + idade + ","
                + " menbros=" + menbros +  '}';
    }
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
}
