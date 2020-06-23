/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex05;

/**
 *
 * @author Diego Martins
 */
public class ControleRemoto implements Controlador{
    //atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    //metodos especiais
    public ControleRemoto(){
        this.volume =50;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    //metodos abstrados

    @Override//sobresCrevento o metodo da classe interface
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if(this.isLigado() == true){
            System.out.println("------MENU-------");
            System.out.println("Esta ligado "+ this.isLigado());
            System.out.println("Esta tocando " + this.isTocando());
            System.out.print("Volume "+ this.getVolume());
            for(int i =0; i <= this.getVolume(); i+=10){
                System.out.print("**");
            }
            System.out.println("");
            System.out.println("-------------------------");
        }else if (this.isLigado() == false){
            System.out.println("TV desligada");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechar Menu... ");
    }

    @Override
    public void maisVolume() {
        if(this.isLigado() == true){
            this.setVolume(this.getVolume()+1);
        }else{
            System.out.println("TV desligada ");
        }
    }

    @Override
    public void menosVolume() {
        if(this.isLigado()){
            this.setVolume(this.getVolume()-1);
        }else{
            System.out.println("TV desligada ");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desLigarMudo() {
        if(this.isLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.isLigado() && !this.isTocando()){
            this.setTocando(true);
        }else{
            System.out.println("TV desligada  ");
        }
    }

    @Override
    public void pause() {
        if(this.isLigado() && this.isTocando()){
            this.setTocando(false);
        }else{
            System.out.println("TV desligada ");
        }
    }
    
}
