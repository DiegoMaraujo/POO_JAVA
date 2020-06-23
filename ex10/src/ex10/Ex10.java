/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex10;

/**
 *
 * @author Diego Martins
 */
public class Ex10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Pessoa p1 = new Pessoa();//classe abstract
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");v1.setIdade(23);v1.setSexo("M");
        System.out.println(v1.toString());
        
        System.out.println("---------------------------------------------------------");
       
        Aluno a1 = new Aluno();
        a1.setNome("Juvenal");a1.setIdade(23);a1.setSexo("M");
        a1.setCurso("Java");a1.setMatricula(110);a1.pagarMensalidade();
        a1.print();
        
        System.out.println("---------------------------------------------------------");
        
        Professor p2 = new Professor();
        p2.setNome("Antonio");p2.setIdade(60);p2.setSexo("M");
        p2.setEspecialidade("Aulas java");p2.setSalario(100.f);
        p2.print();
     
       System.out.println("---------------------------------------------------------");
        
       Bolsista b1 = new Bolsista();
        b1.setNome("Juninho");b1.setIdade(23);b1.setSexo("M");b1.setBolsa(12.f);
        b1.setCurso("Java");b1.setMatricula(111);b1.pagarMensalidade();
        b1.print();
        
        System.out.println("---------------------------------------------------------");
        
        Tecnico t1 = new Tecnico();
        t1.setNome("Maria");t1.setIdade(23);t1.setSexo("M");
        t1.setCurso("Java");t1.setMatricula(112);t1.praticar();
        t1.setRegistroProfissional(23458);t1.print();
        
    
        
        
    }
    
}
