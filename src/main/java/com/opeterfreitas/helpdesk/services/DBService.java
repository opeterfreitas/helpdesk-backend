package com.opeterfreitas.helpdesk.services;

import com.opeterfreitas.helpdesk.domain.Chamado;
import com.opeterfreitas.helpdesk.domain.Cliente;
import com.opeterfreitas.helpdesk.domain.Tecnico;
import com.opeterfreitas.helpdesk.domain.enums.Perfil;
import com.opeterfreitas.helpdesk.domain.enums.Prioridade;
import com.opeterfreitas.helpdesk.domain.enums.Status;
import com.opeterfreitas.helpdesk.repositories.ChamadoRepository;
import com.opeterfreitas.helpdesk.repositories.ClienteRepository;
import com.opeterfreitas.helpdesk.repositories.TecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    private TecnicoRepository tecnicoRepository;
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private ChamadoRepository chamadoRepository;

    public void instanciaDB() {

        Tecnico tec1 = new Tecnico(null, "Peter Freitas", "71907150021", "peterfreitas@mail.com", "123");
        tec1.addPerfil(Perfil.ADMIN);

        Cliente cli1 = new Cliente(null, "Linus Torvalds", "17962008083", "linustorvalds@mail.com", "123");

        Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tec1, cli1);

        tecnicoRepository.saveAll(Arrays.asList(tec1));
        clienteRepository.saveAll(Arrays.asList(cli1));
        chamadoRepository.saveAll(Arrays.asList(c1));

    }
}