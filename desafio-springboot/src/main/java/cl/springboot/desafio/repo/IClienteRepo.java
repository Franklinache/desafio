package cl.springboot.desafio.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.springboot.desafio.model.Cliente;

public interface IClienteRepo extends JpaRepository<Cliente, Integer> {

}
