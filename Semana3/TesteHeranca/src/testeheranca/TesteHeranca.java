/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeheranca;

/**
 *
 * @author julio
 */

// Aplicação dos conceitos de Herança
// Classe Base/Mãe
class Bicicleta {
	// atributos
	public int disco;
	public int velocidade;

	// Construtor da classe Base
	public Bicicleta(int disco, int velocidade)
	{
		this.disco = disco;
		this.velocidade = velocidade;
	}

	// Alguns métodos da classe
	public void diminuiVelocidade(int diminui)
	{
		velocidade -= diminui;
	}

	public void aumentaVelocidade(int aumenta)
	{
		velocidade += aumenta;
	}

	// Imprime informações sobre a bicicleta
	public String toString()
	{
		return ("Tamanho do disco da bicicleta é: " + disco + " polegadas \n" + "e a velocidade é " + velocidade + "km/h");
	}
}

// Classe Derivada/Filha
class MountainBike extends Bicicleta {

	// Um atributo específico desta classe
	public int altAssento;

	// Construtor da classe filha
	public MountainBike(int disco, int velocidade, int startAltura)
	{
		// invocação do construtor da classe base (Bicicelta)
		super(disco, velocidade);
		altAssento = startAltura;
	}

	// Este método é específico da subclasse
	public void setaAltura(int valor)
	{
		altAssento = valor;
	}

	// overriding o método toString() de Bicicleta, para escreve mais informações
	@Override public String toString()
	{
		return (super.toString() + "\n A alutura do assento é: " + altAssento + " cm");
	}
}

// Teste dos conceitos que envolvem Herança
public class TesteHeranca {
	public static void main(String args[])
	{
		MountainBike mb = new MountainBike(3, 100, 25);
		System.out.println(mb.toString());
	}
}
