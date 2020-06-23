/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex08ProjetoLivro;

/**
 *
 * @author Diego Martins
 */
public class Ex08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa[] p =new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Pedro",22,"M");
        p[1]= new Pessoa("Gabs",20,"F");
        
        l[0] = new Livro("Java","Jose",300,p[1]);
        l[1] = new Livro("Python","Gabs",300,p[0]);
        
        l[1].abrir();
        l[1].folhear(150);
        System.out.println(l[1].detalhes());
       
        l[0].abrir();
        l[0].folhear(150);
        System.out.println(l[0].detalhes());
 
    }
    
}
