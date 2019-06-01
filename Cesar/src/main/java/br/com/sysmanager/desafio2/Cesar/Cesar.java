package br.com.sysmanager.desafio2.Cesar;

/**
 * Classe responsavel por Cifrar mensagens usando Cifra de Cesar.
 * 
 * @author Euzebio.silva
 */

public class Cesar {
	private final String alfabeto = "abcdefghijklmnopqrstuvwxyz";
	private final String ALFABETO = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private final int totalLetras = alfabeto.length();

/**
 * 
 * @param src	- String a ser cifrada ou decifrada
 * @param chave - Chave para a cifragem
 * @param tipo  - Informa se vai ser cifrado ou decifrado.
 * @return
 */
	public String CifraCesar(String src, int chave, TipoCesar tipo) {
		String saida = "";
		boolean isUp = false;

		for (int i = 0; i < src.length(); i++) {
			if (src.charAt(i) == ' ') {
				saida += ' ';
				continue;
			}
			int indice = alfabeto.indexOf(src.charAt(i));

			int p = 0;

			if (indice == -1) {
				indice = ALFABETO.indexOf(src.charAt(i));
				isUp = true;
			}

			if(tipo == TipoCesar.CIFRA)
			{
			if (indice + chave >= totalLetras) {
				p = (indice + chave) % totalLetras;
			} else {
				p = indice + chave;
			}
			}
			else if(tipo == TipoCesar.DECIFRA) {
				if (indice - chave < 0) {
					p = totalLetras + (indice - chave);
				} else {
					p = indice - chave;
				}				
			}
			saida += isUp ? ALFABETO.charAt(p) : alfabeto.charAt(p);
		}
		return saida;
	}
}
