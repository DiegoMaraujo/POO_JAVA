/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex09;

/**
 *
 * @author Diego Martins
 */
public class Ex09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pessoa      p1 = new Pessoa();
        Aluno       p2 = new Aluno();
        Professor   p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("maria");p1.setIdade(30);p1.setSexo("F");
        p2.setNome("Jose");p2.setIdade(20);p2.setSexo("M");p2.setCurso("Java");
        p3.setNome("gabs");p2.setIdade(25);p2.setSexo("F");p3.setSalario(3000.00f);
        p4.setNome("thiago");p2.setIdade(28);p2.setSexo("M");p4.setSetor("Estoque");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
    }
    
}
