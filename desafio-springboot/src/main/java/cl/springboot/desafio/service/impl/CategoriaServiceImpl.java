package cl.springboot.desafio.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.springboot.desafio.model.Categoria;
import cl.springboot.desafio.repo.ICategoriaRepo;
import cl.springboot.desafio.service.ICategoriaService;

@Service
public class CategoriaServiceImpl implements ICategoriaService {
	
	@Autowired
	private ICategoriaRepo repo;
	
	@Override
	public Categoria registrar(Categoria cat) {
		return repo.save(cat);
	}
	
	@Override
	public Categoria modificar(Categoria cat) {
		return repo.save(cat);
	}
	
	@Override
	public List<Categoria> listar(){
		return repo.findAll();
	}
	
	@Override
	public Categoria leerPorId(Integer id) {
		Optional<Categoria> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Categoria();
	}
	
	public boolean eliminar(Integer id) {
		repo.deleteById(id);
		return true;
	}
	

}
