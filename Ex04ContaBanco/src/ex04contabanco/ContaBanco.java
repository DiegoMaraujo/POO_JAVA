/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex04contabanco;

/**
 *
 * @author Diego Martins
 */
public class ContaBanco {

    //atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //Metodos
    public void estadoAtua(){
        System.out.println("------------------------------------");
        System.out.println("Conta " + this.getNumConta());
        System.out.println("Tipo " + this.getTipo());
        System.out.println("Dono " + this.getDono());
        System.out.println("Saldo" + this.getSaldo());
        System.out.println("Conta " + this.isStatus());
    }
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if(t == "cc"){
            this.setSaldo(50);
        }else if(t == "cp"){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso ");
        
    }
    public void fecharConta(){
        if(this.getSaldo()> 0){
            System.out.println("Sacar o dinhero para fechar conta");
        }else if(this.getSaldo() < 0){
            System.out.println("Saldo negativo pagar para fechar a conta");
        }else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
        
    }
    public void depositar(float v){
        if(this.isStatus()){
            this.setSaldo(this.getSaldo() + v );
            System.out.println("Deposito realisado com sucesso "+this.getDono());
        }else{
            System.out.println("A conta esta fechada");
        }
    
    }
    public void sacar(float v){
        if(this.isStatus()){
            if(this.getSaldo()>= v){
                this.setSaldo(this.getSaldo()- v);
                System.out.println("Saque realizado "+ this.getDono());
            }else{
                System.out.println("Saldo insuficiente para saque ");
            }
        }else{
            System.out.println("Conta fechada");
        }
            
    }
    public void pagarMensal(){
        int v  = 0;
        if (this.getTipo()== "cc"){
            v = 12;
        }else if (this.getTipo() == "cp"){
            v = 20;
        }
        if(this.isStatus()){
          this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga " + this.getDono());
        }else{
            System.out.println("Conta esta fechada");
        }
    }
    //metodos especiais
    public ContaBanco() {
    this.saldo = 0;
    this.status = false;
    }
   
    public int getNumConta() {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    
    public boolean isStatus() {
        return status;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
