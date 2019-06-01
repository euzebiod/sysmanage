package br.com.sysmanager.desafio3.Fibonacci.main;

import br.com.sysmanager.desafio3.Fibonacci.Fibonacci;
/**
 * Programa que retorna uma serie de Fibonacci até um numero de termo.
 * 
 * @author euzeb
 * 
 * Forma de uso:
 *	java -jar Fibonacci-0.0.1.jar <numeros de termos>
 *
 * Exemplo:
 * 	java -jar Fibonacci-0.0.1.jar 50
 * 		
 * Resultado esperado:
 * 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765 10946 17711 28657 46368 75025 121393 196418 317811 514229 832040 1346269 2178309 3524578 5702887 9227465 14930352 24157817 39088169 63245986 102334155 165580141 267914296 433494437 701408733 1134903170 1836311903 2971215073 4807526976 7778742049
 *
 */
public class SerieFibonacci {
	public static void main(String[] args) {
		
		if(args.length != 1 ) {
			System.out.println("Numero insuficiente de argumentos");
			System.exit(-1);
		}
	
		Fibonacci fibo = new Fibonacci();
		try {
			System.out.println(fibo.SequenciaFibonacci(Integer.parseInt(args[0])));
		} catch (NumberFormatException  e) {
			System.out.println("Argumento invalido");
		}
	}
}
