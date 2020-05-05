package cl.springboot.desafio.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.springboot.desafio.model.Cliente;
import cl.springboot.desafio.repo.IClienteRepo;
import cl.springboot.desafio.service.IClienteService;

@Service
public class ClienteServiceImpl implements IClienteService {
	
	@Autowired
	private IClienteRepo repo;
	
	@Override
	public Cliente registrar(Cliente cli) {
		return repo.save(cli);
	}
	
	@Override
	public Cliente modificar(Cliente cli) {
		return repo.save(cli);
	}
	
	@Override
	public List<Cliente> listar(){
		return repo.findAll();
	}
	
	@Override
	public Cliente leerPorId(Integer id) {
		Optional<Cliente> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Cliente();
	}
	
	@Override
	public boolean eliminar(Integer id) {
		repo.deleteById(id);
		return true;
	}

}
