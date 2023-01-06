package com.opeterfreitas.helpdesk.services;

import com.opeterfreitas.helpdesk.domain.Tecnico;
import com.opeterfreitas.helpdesk.repositories.TecnicoRepository;
import com.opeterfreitas.helpdesk.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TecnicoService {

    @Autowired
    private TecnicoRepository repository;

    public Tecnico findById(Integer id){
        Optional<Tecnico> obj = repository.findById(id);
        return obj.orElseThrow(()-> new ObjectNotFoundException("Objeto não encontrado! Id: " + id));
    }


}
