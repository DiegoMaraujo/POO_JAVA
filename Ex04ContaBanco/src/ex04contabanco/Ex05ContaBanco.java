/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex04contabanco;

/**
 *
 * @author Diego Martins
 */
public class Ex05ContaBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(11111);
        p1.setDono("JUBILEU");
        p1.abrirConta("cc");
        p1.sacar(50);
        p1.fecharConta();
        p1.estadoAtua();
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(11111);
        p2.setDono("Maria");
        p2.abrirConta("cp");
        
        p2.estadoAtua();
    }
    
}
