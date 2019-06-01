package br.com.sysmanager.dasafio1.main;

import br.com.sysmanager.dasafio1.primo.Primo;

/**
 * Programa que retorna o maior numero primo entre dois numeros.
 * 
 * 
 * @author euzebio.silva
 * 
 * Forma de uso:
 *	java -jar Primo-0.0.1.jar <numero inteiro> <numero inteiro>
 *
 * Exemplo:
 * 	java -jar Primo-0.0.1.jar 0 50
 * 		
 * Resultado esperado:
 * 47
 *
 */

public class MaiorPrimo {

	public static void main(String[] args) {

		if(args.length != 2) {
			System.out.println("Numero insuficiente de argumentos");
			System.exit(-1);
		}
		
		Primo primo = new Primo();
		try {
			primo.SetMaiorPrimo(Integer.parseInt(args[0]), Integer.parseInt(args[1]));			
		} catch (NumberFormatException  e) {
			System.out.println("Argumentos invalidos");
		}

		if(primo.isValido() == true) {
			System.out.println(primo.getNumero());
		}
	}
}
