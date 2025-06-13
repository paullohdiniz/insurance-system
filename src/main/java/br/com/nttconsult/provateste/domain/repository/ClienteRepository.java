package br.com.nttconsult.provateste.domain.repository;

import br.com.nttconsult.provateste.domain.entity.ClienteEntity;
import br.com.nttconsult.provateste.domain.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity, String>{

    ClienteEntity salvar(ClienteEntity cliente);
    Optional<ClienteEntity> buscarPorCpf(String cpf);
    List<ClienteEntity> buscarTodos();
    void deletar(String cpf);
    boolean existePorCpf(String cpf);
}
