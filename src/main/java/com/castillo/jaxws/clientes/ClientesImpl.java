package com.castillo.jaxws.clientes;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;


@WebService(endpointInterface = "com.castillo.jaxws.clientes.Clientes")
public class ClientesImpl implements Clientes {

	static List<Cliente> clientes = new ArrayList<>();
	
	@Override
	public List<Cliente> obtenerClientes() {
		return clientes;
	}

	@Override
	public Cliente agregarCliente(Cliente cliente) {
		clientes.add(cliente);
		return cliente;
	}

	@Override
	public Cliente eliminarCliente(int id) {
		return clientes.remove(id);
	}

	@Override
	public Cliente actualizarCliente(Cliente cliente) {
		Cliente nuevoCliente = new Cliente();
		nuevoCliente.setId(cliente.getId());
		nuevoCliente.setNombre(cliente.getNombre());
		nuevoCliente.setApellido(cliente.getApellido());
		return clientes.set(nuevoCliente.getId(), nuevoCliente);
	}

	@Override
	public Cliente obtenerId(int id) {
		return clientes.get(id);
	}
}
