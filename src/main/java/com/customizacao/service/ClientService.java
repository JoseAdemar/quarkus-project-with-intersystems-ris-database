package com.customizacao.service;

import java.util.List;
import java.util.Optional;

import com.customizacao.entity.Client;


public interface ClientService {

    Client create(Client client);
	
	Client update(Client client);
	
	List<Client> findAll();
	
	Optional<Client> findOne(Long id);
	
	void delete(Long id);
}
