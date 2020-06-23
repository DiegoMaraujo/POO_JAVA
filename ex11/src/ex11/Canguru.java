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
public class Canguru extends Mamifero{
        @Override
    public void locomover() {
        System.out.println("Saltando");
    }
    public void usarBolsa(){
        System.out.println("Usando a bolsa");
    }
    
        @Override
        public void print(){
        System.out.println(toString());
        emitirSon();
        alimentar();
        locomover();
        usarBolsa();
    }
    
    @Override
    public String toString() {
        return "Canguru{" + "peso=" + peso + ", "
                + "idade=" + idade + ","
                + " menbros=" + menbros + ","+ "cor=" + corPelo + '}';
    }
}
