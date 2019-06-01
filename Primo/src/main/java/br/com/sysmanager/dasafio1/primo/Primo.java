package br.com.sysmanager.dasafio1.primo;

/**
 * Class que guada um numero primo com um servi�o para encontrar
 * o maior primo entre dois numeros.
 * 
 * @author euzebio.silva
 *
 */
public class Primo {

	private int numero = 0;
	private boolean isValido = false;
	
	public boolean isValido() {
		return isValido;
	}

	/**
	 * 
	 * @param primeiroNumero
	 * @param segundoNumero
	 */
	public void SetMaiorPrimo(int primeiroNumero, int segundoNumero) {
		int maiorNumero = 0;
		int div = 0;
		for (int x = primeiroNumero; x <= segundoNumero; x++) {
			div = 0;
			for (int i = 1; i <= x; i++) {
				if (x % i == 0) {
					div++;
				}
			}
			if(div == 2 ) {
				maiorNumero = x;
				isValido = true;
			}
		}
		numero = maiorNumero;
	}

	public int getNumero() {
		return numero;
	}
	
}
