package br.com.sisdb.clientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.sisdb.clientes.entities.Client;



@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
