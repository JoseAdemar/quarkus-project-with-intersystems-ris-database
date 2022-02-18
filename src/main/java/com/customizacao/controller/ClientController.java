package com.customizacao.controller;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.customizacao.entity.Client;

import org.jboss.logging.Logger;

@Path("/api/guests")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ClientController {

	private static final Logger LOGGER = Logger.getLogger(ClientController.class.getName());

	@POST
	@Transactional
	public Response createClient(Client client) {
		LOGGER.info(client);
        client.persist();
        return Response.ok(client).status(201).build();
	}
	
	
	@GET
	public List<Client> listAllClients() {
		return Client.listAll();

	}

}
