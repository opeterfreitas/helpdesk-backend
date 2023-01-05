package com.opeterfreitas.helpdesk.repositories;

import com.opeterfreitas.helpdesk.domain.Tecnico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {
}
