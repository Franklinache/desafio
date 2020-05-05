package cl.springboot.desafio.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.springboot.desafio.model.Categoria;

public interface ICategoriaRepo extends JpaRepository<Categoria, Integer> {

}
