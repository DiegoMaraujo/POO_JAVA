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
public class Bolsista extends Aluno{
    //atributos
    private float bolsa;
    
    //metodos
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de "+this.getNome());
    }
    
    @Override//sobrepono ao metodo pagar Mensalidade da classe aluno
    public void pagarMensalidade(){
        System.out.println(this.getNome()+" è bolsista! Pagamento com desconto");
    }
    //metodos especiais

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    @Override
    public void print(){
        System.out.println(this.toString());
    }
    @Override
    public String toString() {
        return "Bolsista{" + "nome=" + super.getNome() + ", idade=" + super.getIdade() + ", sexo=" + super.getSexo() + ", Bolsa=" + bolsa + '}';
    }
}
