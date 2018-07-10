package com.castillo.jaxws.clientes;

import java.util.List;

import javax.jws.WebService;

@WebService
public interface Clientes {
	
	Cliente agregarCliente(Cliente cliente);

	List<Cliente> obtenerClientes();
	
	Cliente eliminarCliente(int id);
	
	Cliente actualizarCliente(Cliente cliente);
	
	Cliente obtenerId(int id);
	
	
}
