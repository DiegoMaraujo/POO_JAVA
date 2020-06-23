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
public class Professor extends Pessoa{
    //atributos
    private String especialidade;
    private float salario ;
    //metodos
    public void receberAumento(float aum){
        this.salario = aum;
    }
    //metodos especiais

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public void print(){
        System.out.println(this.toString());
    }
    @Override
    public String toString() {
        return "Professor{" + "nome=" + super.getNome() + ", idade=" + super.getIdade() + ", sexo=" + super.getSexo() + ", especialidade=" + especialidade + ", salario=" + salario + '}';
    }
    
}
