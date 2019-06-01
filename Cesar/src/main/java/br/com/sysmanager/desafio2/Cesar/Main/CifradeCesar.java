package br.com.sysmanager.desafio2.Cesar.Main;

import br.com.sysmanager.desafio2.Cesar.Cesar;
import br.com.sysmanager.desafio2.Cesar.TipoCesar;

/**
 * 
 * Programa que cifra ou decifra uma string usando Cifra de Cesar com uma chave de valor 3
 * 
 * @author euzebio.silva
 * 
 * Forma de uso:
 * 	java -jar Cesar-0.0.1.jar <opção> <string>
 *	Opcões:
 *		-H	-	Ajuda.
 *		-C	-	Cifra.
 *		-D	-	Decifra.
 *
 *	Exemplo:
 *	java -jar Cesar-0.0.1.jar -C "a ligeira raposa marrom saltou sobre o cachorro cansado"
 *
 *	Resultado esperado.
 *	d oljhlud udsrvd pduurp vdowrx vreuh r fdfkruur fdqvdgr
 *
 */

public class CifradeCesar {
	public static void main(String[] args) {
		if(args[0].equals("-C")) {
			System.out.println(new Cesar().CifraCesar(args[1], 3, TipoCesar.CIFRA ));			
		}
		else if(args[0].equals("-D")) {
			System.out.println(new Cesar().CifraCesar( args[1], 3, TipoCesar.DECIFRA));					
		}
		else if(args[0].equals("-H")) {
			System.out.println(" java CifradeCesar <opção> <texto>");
			System.out.println(" opões:");
			System.out.println(" -C - Cifra");
			System.out.println(" -D - Decifra");
		}
		else {
			System.out.println(" Opção não valida,");	
			System.out.println(" java CifradeCesar <opção> <texto>");
			System.out.println(" opões:");
			System.out.println(" -C - Cifra");
			System.out.println(" -D - Decifra");
		}

	}
}
