package br.com.sysmanager.desafio2.Cesar.test;

import br.com.sysmanager.desafio2.Cesar.Cesar;
import br.com.sysmanager.desafio2.Cesar.TipoCesar;
import junit.framework.TestCase;

public class DecifraCesarTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

    public void testApp()
    {
		assertEquals("a ligeira raposa marrom saltou sobre o cachorro cansado", new Cesar().CifraCesar("d oljhlud udsrvd pduurp vdowrx vreuh r fdfkruur fdqvdgr",3, TipoCesar.DECIFRA));
    }
}
