/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex12;

/**
 *
 * @author Diego Martins
 */
public class Mamifero extends Animal{
    //atributos
    protected String corPelo;
    
    //metodos

    @Override//sobreposição do metodo da classe Animal
    public void emitirSon() {
        System.out.println("Som de Mamífero");
    }
    
}
