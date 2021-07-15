/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testepolimorfismo2;

/**
 *
 * @author julio
 */
// Program para apresentar a idéia de Polimorfismo onde temos a sobrecarga de método utilizando diferentes números de argumentos
class Multiplicacao {

	// Método com 2 parâmetros
	static int Multiplica(int a, int b)
	{
		return a * b;
	}

	// Método com 3 parâmetros
	static double Multiplica(int a, int b, int c)
	{
		return a * b * c;
	}
}

class TestePolimorfismo2 {
	public static void main(String[] args)
	{
		System.out.println(Multiplicacao.Multiplica(9,9));
		System.out.println(Multiplicacao.Multiplica(2,2,2));
	}
}
