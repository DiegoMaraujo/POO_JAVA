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
public class Gafanhoto extends Pessoa{
    //atributos
    private String login;
    private int  totAssistido;
    //metodo
    public void viuMaisUm(){
        this.totAssistido ++;
    }
    //metodo construdor

    public Gafanhoto(String login, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }
     
    
    //metodos especiais

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    //sobre escreve
    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString()+ "\nlogin=" + login + ", totAssistido=" + totAssistido + '}';
    }

  
    
}
