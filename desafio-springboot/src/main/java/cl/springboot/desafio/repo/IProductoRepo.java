package cl.springboot.desafio.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.springboot.desafio.model.Producto;

public interface IProductoRepo extends JpaRepository<Producto, Integer> {

}
