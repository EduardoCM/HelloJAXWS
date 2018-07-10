package com.castillo.jaxws.calculadora;

import javax.jws.WebService;

@WebService(endpointInterface = "com.castillo.jaxws.calculadora.Calculadora")
public class CalculadoraImpl implements Calculadora {

	@Override
	public int sumar(int valor1, int valor2) {
		return valor1 + valor2;
	}

	@Override
	public int restar(int valor1, int valor2) {
		return valor1 - valor2;
	}

	@Override
	public int multiplicar(int valor1, int valor2) {
		return valor1 * valor2;
	}
	
	

}
