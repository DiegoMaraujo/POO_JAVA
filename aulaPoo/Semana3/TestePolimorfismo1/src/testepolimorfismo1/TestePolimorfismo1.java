/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testepolimorfismo1;

/**
 *
 * @author julio
 */

// Program para apresentar a idéia de Polimorfismo onde temos a sobrecarga de método utilizando diferentes tipos de argumentos
class Multiplicacao {

	// Método com 2 parâmetros
	static int Multiplica(int a, int b)
	{
		return a * b;
	}

	// Método com o mesmo nome do anterior, mas com dois parâmetros double
	static double Multiplica(double a, double b)
	{
		return a * b;
	}
}

class TestePolimorfismo1 {
	public static void main(String[] args)
	{
		System.out.println(Multiplicacao.Multiplica(9,9));
		System.out.println(Multiplicacao.Multiplica(1.1,1.1));
	}
}
