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
public class Tartaruga extends Reptil {
    @Override
    public void locomover() {
        System.out.println("Se locomovendo devagar");
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
        return "Tartaruga{" + "peso=" + peso + ", "
                + "idade=" + idade + ","
                + " menbros=" + menbros +  '}';
    }
}
