package com.cadastro_cliente.api.repository;

import com.cadastro_cliente.api.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApiRepository extends JpaRepository<Pessoa, Integer> {
}
