package br.com.sysmanager.desafio3.Fibonacci;

/**
 * Class que retorna uma serie de Fibonacci até um numero
 * @author euzeb
  */
public class Fibonacci {
/**
 * Retorna o termo de termoFibonacci na posição n.
 * @param n
 * @return
 */
	long termoFibonacci(int n) {
		return (n < 2) ? n : termoFibonacci(n - 1) + termoFibonacci(n - 2);
	}
	
/**
 * Retorna uma string com uma serie até um numero.
 * @param numeroTermos - Numero limite de termos.
 * @return
 */
	public String SequenciaFibonacci(int numeroTermos) {
		String saida = "";

		try {
			for (int i = 0; i < numeroTermos; i++) {
				saida += termoFibonacci(i) + " ";
			}
		} catch (StackOverflowError e) {
			return "Estouro de memoria.";
		}

		return saida;
	}
}
