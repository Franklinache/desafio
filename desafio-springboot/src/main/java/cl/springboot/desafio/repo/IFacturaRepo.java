package cl.springboot.desafio.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.springboot.desafio.model.Factura;

public interface IFacturaRepo extends JpaRepository<Factura, Integer> {

}
