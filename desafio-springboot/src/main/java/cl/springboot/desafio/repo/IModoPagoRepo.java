package cl.springboot.desafio.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.springboot.desafio.model.ModoPago;

public interface IModoPagoRepo extends JpaRepository<ModoPago, Integer> {

}
