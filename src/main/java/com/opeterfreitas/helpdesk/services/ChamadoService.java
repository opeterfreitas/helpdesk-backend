package com.opeterfreitas.helpdesk.services;

import com.opeterfreitas.helpdesk.domain.Chamado;
import com.opeterfreitas.helpdesk.repositories.ChamadoRepository;
import com.opeterfreitas.helpdesk.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ChamadoService {

    @Autowired
    private ChamadoRepository repository;

    public Chamado findById(Integer id) {
        Optional<Chamado> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id));
    }
}