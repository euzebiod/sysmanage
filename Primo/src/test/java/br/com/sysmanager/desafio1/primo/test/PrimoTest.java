/**
 * 
 */
package br.com.sysmanager.desafio1.primo.test;

import br.com.sysmanager.dasafio1.primo.Primo;
import junit.framework.TestCase;

/**
 * @author euzeb
 *
 */
public class PrimoTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
    public void testApp()
    {
		Primo primo = new Primo();
		primo.SetMaiorPrimo(0, 50);
		assertEquals(47, primo.getNumero());
    }
}
