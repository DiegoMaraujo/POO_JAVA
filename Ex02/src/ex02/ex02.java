/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex02;

/**
 *
 * @author Diego Martins
 */
public class ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Caneta1 c1 = new Caneta1();
        c1.modelo = "Bic Cristal";
        c1.cor = "Verde";
        //c1.ponta = 0.6f;
        c1.carga = 80;
        //c1.tampar = true;
        c1.destampar();
        c1.status();
        c1.rapiscar();
    }
    
}
