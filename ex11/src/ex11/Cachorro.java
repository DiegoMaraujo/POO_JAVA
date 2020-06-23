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
public class Cachorro extends Mamifero{
    @Override
    public void emitirSon() {
        System.out.println("Latindo au au");
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
        return "Cachorro{" + "peso=" + peso + ", "
                + "idade=" + idade + ","
                + " menbros=" + menbros + ","+ "cor=" + corPelo +'}';
    }
}
