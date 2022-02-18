package com.customizacao.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;

import com.customizacao.entity.Client;
import com.customizacao.service.ClientService;

@Path("/api/guests")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ClientController {

private final ClientService clientService;
	
	public ClientController(ClientService clientService) {
		this.clientService = clientService;
	}

	@POST
	public Response createClient(@RequestBody Client client) {
		clientService.create(client);
		return Response.status(Status.CREATED).entity(client).build();
	}
	
	
	@GET
	public Response listAllClients() {
		List<Client> listClients = clientService.findAll();
		return Response.status(Status.OK).entity(listClients).build();
	}

}
