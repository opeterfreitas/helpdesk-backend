package com.opeterfreitas.helpdesk.repositories;

import com.opeterfreitas.helpdesk.domain.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {
}
