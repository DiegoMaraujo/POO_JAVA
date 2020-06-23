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


//Classe abstract não pode gera objetos
public abstract class Pessoa {
    //atributos
    protected String nome;
    protected int idade;
    protected String sexo;
    //metodos
    public void fazerAniversario(){
        this.idade ++;
    }
    //metodos especiais

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

     public void print(){
        System.out.println(this.toString());
    }
    @Override
    public String toString() {
        return "Pessoa{" 
                + "nome=" + nome + ", "
                + "idade=" + idade + ", "
                + "sexo=" + sexo + 
                '}';
    }
    
    
}
