package com.opeterfreitas.helpdesk.repositories;

import com.opeterfreitas.helpdesk.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
