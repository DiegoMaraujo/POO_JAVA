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
public class  Video implements AcoesVideos {
    //atributos
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzir;
    //metodos da interface
    @Override
    public void play() {
        this.reproduzir = true;
    }

    @Override
    public void pause() {
        this.reproduzir = false;
    }

    @Override
    public void like() {
        this.curtidas ++;
    }
    //metodos especiais

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (int)((this.avaliacao + avaliacao)/this.views);
        this.avaliacao = nova;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzir() {
        return reproduzir;
    }

    public void setReproduzir(boolean reproduzir) {
        this.reproduzir = reproduzir;
    }
    //mrtodo construtor
    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.curtidas = 0;
        this.views = 0;
        this.reproduzir = false;
    }
    //sobre escrever poliformismo

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", a"
                + "valiacao=" + avaliacao + ", "
                + "views=" + views + ", "
                + "curtidas=" + curtidas + ", "
                + "reproduzir=" + reproduzir + '}';
    }
    
}
