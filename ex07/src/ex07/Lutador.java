/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex07;

/**
 *
 * @author Diego Martins
 */
public class Lutador {
    //atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitoria, derrotas, empate;
    
    //metodos publicos
    public void apresentar(){
        System.out.println("-------------------------------------------");
        System.out.println("Chegou o  Lutador " +this.getNome());
        System.out.println("Nacionalidade "+ this.getNacionalidade());
        System.out.println("Com " + this.getIdade());
        System.out.println("Com peso de " + this.getPeso()+" KL ");
        System.out.println(this.getVitoria()+"Vitorias ");
        System.out.println(this.getDerrotas()+"Derrotas");
        System.out.println("Empates" + this.getEmpate());
    }
    public void status(){
        System.out.println("-------------------------------------------------------");
        System.out.println(this.getNome()+" Com peso de " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitoria()+" Pedeu "+ this.getDerrotas()
        +" Empatou "+this.getEmpate());
    }
    public void ganhaLuta(){
        this.setVitoria(this.getVitoria()+1);
    }
    public void pederLuta(){
        this.setVitoria(this.getVitoria()-1);
    }
    public void empatarLuta(){
        this.setEmpate(this.getEmpate()+1);
    }
    
    //metodos especiais

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitoria, int derrotas, int empate) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitoria = vitoria;
        this.derrotas = derrotas;
        this.empate = empate;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.peso < 52.2){
            this.categoria = "Invalido";
        }else if(this.peso <= 70.3){
            this.categoria = "Leve";
        }else if(this.peso <=83.9){
            this.categoria = "Medio";
        }else if(this.peso <=120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Invalido";
        }
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }
    
    
}
