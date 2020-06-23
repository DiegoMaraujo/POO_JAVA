/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01;

/**
 *
 * @author Diego Martins
 */
public class Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        
        //instancianto um novo obejeto da classe caneta
        Caneta c1 = new Caneta();
        
        //chamadas ao atributos
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.modelo = "Big";
        c1.carga = 5;
        
        //chamadas ao metodos
        c1.status();
        c1.tampar();
        c1.rapiscar();
        
        System.out.println("------------------------");
        //instancianto um novo obejeto da classe caneta
        Caneta c2 = new Caneta();
        
        //chamadas ao atributos
        c2.modelo = "Java";
        c2.cor = "Vermelha";
        c2.ponta = 0.5f;
        c2.carga = 10;
        
        //chamadas ao metodos
        c2.status();
        c2.destampar();
        c2.rapiscar();
    }
    
}
