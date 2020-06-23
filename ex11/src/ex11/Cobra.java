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
public class Cobra extends Reptil{
     @Override
    public void print(){
        System.out.println(toString());
        emitirSon();
        alimentar();
        locomover();
    }
    
    @Override
    public String toString() {
        return "Cobra{" + "peso=" + peso + ", "
                + "idade=" + idade + ","
                + " menbros=" + menbros +  '}';
    }
}
