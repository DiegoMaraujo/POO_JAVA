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
public class GoldFish extends Peixe{
    
    @Override
    public void print(){
        System.out.println(toString());
        emitirSon();
        alimentar();
        locomover();
    }
    
    @Override
    public String toString() {
        return "GoldFish{" + "peso=" + peso + ", "
                + "idade=" + idade + ","
                + " menbros=" + menbros +  '}';
    }
}
