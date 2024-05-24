package br.univille.projfso2024b.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.projfso2024b.entity.Cliente;
import br.univille.projfso2024b.repository.ClienteRespository;
import br.univille.projfso2024b.service.ClienteService;

@Service
public class ClienteServiceImpl 
    implements ClienteService{
    
    @Autowired
    private ClienteRespository repository;

    @Override
    public void save(Cliente cliente) {
        repository.save(cliente);
    }

    @Override
    public Cliente getById(long id) {
        return repository.getById(id);
    }

    @Override
    public List<Cliente> getAll() {
        return repository.findAll();
    }

    }
