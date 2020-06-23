/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex08ProjetoLivro;

/**
 *
 * @author Diego Martins
 */
public class Livro implements Publicacao{
    //atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual ;
    private boolean aberto;
    private Pessoa leitor;
    //metodos

    
    public String detalhes() {
        return "Livro{" + "titulo=" 
                + titulo + "\n, autor=" 
                + autor + "\n, totPaginas=" 
                + totPaginas + "\n, pagAtual=" 
                + pagAtual + "\n, aberto=" 
                + aberto + "\n, leitor=" 
                + leitor.getNome()+"-" 
                + leitor.getSexo()+"-"
                + leitor.getIdade()+"\n------------------- " 
                +'}';
        
        
    }

    //metodos especiais

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public Livro(String titulo, String autor, int totPaginas,Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

    
    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if(p > this.pagAtual){
            this.pagAtual = 0;
        }else{
             this.pagAtual = p;
        }
       
    }

    @Override
    public void avancaPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
 
}
