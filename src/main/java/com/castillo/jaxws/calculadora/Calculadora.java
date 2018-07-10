package com.castillo.jaxws.calculadora;

import javax.jws.WebService;

@WebService
public interface Calculadora {
	
	int sumar(int valor1, int valor2);
	
	int restar(int valor1, int valor2);
	
	int multiplicar(int valor1, int valor2);
	
}
