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
public class Aluno extends Pessoa{
    //atributos
    private int matricula;
    private String curso;
    
    //metodo
    public  void pagarMensalidade(){
        System.out.println("Pagando mensalidade Aluno "+this.getNome());
    }
   // metodos especiais
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
   @Override
    public void print(){
        System.out.println(this.toString());
    }
    @Override
    public String toString() {
        return "Aluno{" + "nome=" + super.getNome() + ", idade=" + super.getIdade() + ", sexo=" + super.getSexo() + ", Curso=" + curso + ", matricula=" + matricula + '}';
    }
}
