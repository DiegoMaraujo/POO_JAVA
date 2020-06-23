/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex07;

import java.util.Random;

/**
 *
 * @author Diego Martins
 */
public class Luta {
    //atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    //metodos especiais
    public void marcarLuta(Lutador l1,Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria())&& l1 != l2){
            this.aprovada = true;
            this.desafiado = l2;
            this.desafiante = l1;
        }else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar(){
        if(this.aprovada){
            System.out.println("####DESAFIANTE###");
            this.desafiado.apresentar();
            System.out.println("###DESAFIANTE####"); 
            this.desafiante.apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);// tres posição 0 1 2 3
            switch(vencedor){
                case 0://empate
                    System.out.println("*****************************");
                    System.out.println("Empatou");
                    this.desafiado.ganhaLuta();
                    this.desafiante.pederLuta();
                    break;
                case 1://Desafiado vence
                    System.out.println("*****************************");
                    System.out.println("Vitoria do " + this.desafiado.getNome());
                    this.desafiado.ganhaLuta();
                    this.desafiante.pederLuta();
                    break;
                case 2:// Desafiante vence
                    System.out.println("*****************************");
                    System.out.println("Vitoria do " + this.desafiante.getNome());
                    this.desafiado.ganhaLuta();
                    this.desafiante.pederLuta();
                    break;      
            }
            
        }else{
            System.out.println("Erro A luta não pode acontecer");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
