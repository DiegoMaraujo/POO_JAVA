/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex11;

/**
 *
 * @author Diego Martins
 */
public abstract class Animal {
    //atributos
    protected float peso;
    protected int idade;
    protected int menbros;
    
    //metodos
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSon();
    //metodos especiais
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMenbros() {
        return menbros;
    }

    public void setMenbros(int menbros) {
        this.menbros = menbros;
    }
    
    public void print(){
        System.out.println(toString());
    }
    
    @Override
    public String toString() {
        return "Animal{" + "peso=" + peso + ", idade=" + idade + ", menbros=" + menbros + '}';
    }
    
}
