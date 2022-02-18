package com.customizacao.service.impl;

import java.util.List;
import java.util.Optional;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

import com.customizacao.entity.Client;
import com.customizacao.repository.ClientRepository;
import com.customizacao.service.ClientService;

@ApplicationScoped
public class ClientServiceImpl implements ClientService{

    private final ClientRepository clientRepository;
    
	public ClientServiceImpl(ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
	}
	

	@Override
	@Transactional
	public Client create(Client client) {
		
		clientRepository.persist(client);
		return client;
	}

	@Override
	public Client update(Client client) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> findAll() {
		return clientRepository.listAll();
	}

	@Override
	public Optional<Client> findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}
}
