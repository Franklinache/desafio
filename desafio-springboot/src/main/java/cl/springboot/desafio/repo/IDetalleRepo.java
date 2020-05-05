package cl.springboot.desafio.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.springboot.desafio.model.Detalle;

public interface IDetalleRepo extends JpaRepository<Detalle	, Integer> {

}
