package br.com.sysmanager.desafio2.Cesar.test;

import br.com.sysmanager.desafio2.Cesar.Cesar;
import br.com.sysmanager.desafio2.Cesar.TipoCesar;
import junit.framework.TestCase;

public class CifraCesarTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
    public void testApp()
    {
		assertEquals("d oljhlud udsrvd pduurp vdowrx vreuh r fdfkruur fdqvdgr", new Cesar().CifraCesar("a ligeira raposa marrom saltou sobre o cachorro cansado", 3, TipoCesar.CIFRA));
    }
}
