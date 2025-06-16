package br.com.nttconsult.provateste.repository;

import br.com.nttconsult.provateste.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, String>{

    boolean existsByCpf(String cpf);
    Cliente findByCpf(String cpf);
    void deleteByCpf(String cpf);

}
