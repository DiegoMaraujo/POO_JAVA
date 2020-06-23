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
public class Pessoa {
    //atributos
    private String nome;
    private String sexo;
    private int idade;
    
    //metodos
    public void fazerAniversario(){
        this.idade ++;
    }
    //metodos especiais

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" 
                + nome + ", sexo=" 
                + sexo + ", idade=" 
                + idade + '}';
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
