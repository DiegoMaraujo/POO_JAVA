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
public class Ex11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        r.setCorEscama("Esverdiada");
        r.setMenbros(4);
        r.print();
        
     System.out.println("------------------------------------");      
        Peixe p = new Peixe();
        p.setCorEscama("vermelha com azul");
        p.print();
    System.out.println("------------------------------------");    
        Ave a = new Ave();
        a.setCorPena("Verde");
        a.setIdade(5);
        a.setPeso(40.f);
        a.print();
    System.out.println("------------------------------------");
        Cachorro c = new Cachorro();
        c.setCorPelo("Branco");
        c.setIdade(5);
        c.setPeso(40.f);
        c.print();
     System.out.println("------------------------------");
        Canguru ca = new Canguru();
        ca.setCorPelo("Marrom");
        ca.setIdade(5);
        ca.setPeso(40.f);
        ca.print();
        
    }
    
}
