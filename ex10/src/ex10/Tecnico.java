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
public class Tecnico extends Aluno{
    //atributo
    private int registroProfissional;
    //metodo
    public void praticar(){
        System.out.println("Aulas praticas do Curso " + this.getCurso());
        
    }
    //metodos especiais

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
    @Override
    public void print(){
        System.out.println(this.toString());
    }
    @Override
    public String toString() {
        return "Tecnico{nome=" + super.getNome() + ", idade=" + super.getIdade() + ", sexo=" + super.getSexo() +
            ", matricula=" + super.getMatricula() + ", curso=" + super.getCurso() + ", registro profissional=" + this.registroProfissional + "}";
    }
    
}
