/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex13;

/**
 *
 * @author Diego Martins
 */
public class Ex13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Video v[] = new Video[3];
        v[0] = new Video("Aula POO");
        v[1] = new Video("Aula PHP");
        v[2] =  new Video("Aula JAVA");
        
        Gafanhoto[] g = new Gafanhoto[3];
        g[0] = new Gafanhoto("MA", "maria", 22, "F");
        g[1] = new Gafanhoto("MARc", "macio", 30, "M");
        g[2] = new Gafanhoto("gabs", "gabriela", 20, "F");
   
        
        Visualizacao[] vi = new Visualizacao[2];
        vi[0] = new Visualizacao(g[0],v[1]);
        vi[0] = new Visualizacao(g[0],v[2]);
        vi[0].avaliar(45.0f);
        
        System.out.println(vi[0].toString());
        System.out.println("-------------------------");
        vi[1] = new Visualizacao(g[2],v[1]);
        vi[1] = new Visualizacao(g[2],v[2]);
        vi[1].avaliar();
        System.out.println(vi[1].toString());
    }
    
}
