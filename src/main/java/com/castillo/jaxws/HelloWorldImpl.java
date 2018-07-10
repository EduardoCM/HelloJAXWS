
package com.castillo.jaxws;

import java.util.logging.Logger;

import javax.jws.WebService;

@WebService(endpointInterface = "com.castillo.jaxws.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
	
	private final static Logger LOGGER = Logger.getLogger(HelloWorldImpl.class.getName());

    public String sayHi(String text) {
    	LOGGER.info("::::: Inicio de ejecucion de web service :::::");
    	String mensaje = "Hola mi nombre es " + text + " soy experto en Web Services ";
    	LOGGER.info("::: Mensaje creado " + mensaje);
    	return mensaje.toUpperCase();
    }
}

