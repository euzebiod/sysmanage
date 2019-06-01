package br.com.sysmanager.desafio2.Cesar;

/**
 * Enumerador usado para informar se vai ser feita uma cifragem ou decifragem.
 * 
 * @author euzebio.silva
 *
 */


public enum TipoCesar {
	CIFRA(1), DECIFRA(2);
	
	private final int valor;
	TipoCesar(int opcao){
		valor = opcao;
	}
}
