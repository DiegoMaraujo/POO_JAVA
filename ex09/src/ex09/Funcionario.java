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
public class Funcionario extends Pessoa{
    //atributos
    private String setor;
    private boolean trabalhando;
    
    //metodos
    public void mudarTrabalho(){
        this.trabalhando = ! this.trabalhando;
    }
    
    //metodos especiais
    
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
}
