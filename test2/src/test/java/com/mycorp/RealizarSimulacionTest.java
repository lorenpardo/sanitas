package com.mycorp;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import junit.framework.TestCase;
import util.datos.UsuarioAlta;

/**
 * Unit test for simple App.
 */
public class RealizarSimulacionTest extends TestCase {

	@InjectMocks
	private ZendeskService zendeskservice = new ZendeskService();
	
	@Before
	public void setUp() {
		// necesito inicializar este campo, porque sino el envio de correo no funciona, por un format String
		zendeskservice.ZENDESK_ERROR_MAIL_FUNCIONALIDAD = "0";
	        
	}
	
    /**
     * Rigourous Test :-)
     */
    @Test
    public void testApp() {
        assertTrue( true );
    }
    
    @Test
    public void testAltaTicketNumTarjeta() {
    	UsuarioAlta usuarioAlta= new UsuarioAlta();
    	usuarioAlta.setNumTarjeta("1234");
    	String userAgent="12";
        Assert.assertNotNull( zendeskservice.altaTicketZendesk(usuarioAlta, userAgent));
    }
    
    @Test
    public void testAltaticketNumPoliza() {
    	UsuarioAlta usuarioAlta= new UsuarioAlta();
    	usuarioAlta.setNumPoliza("1234");
    	usuarioAlta.setNumDocAcreditativo("5678");
    	String userAgent="12";
        Assert.assertNotNull( zendeskservice.altaTicketZendesk(usuarioAlta, userAgent));
    }
    
    

}
