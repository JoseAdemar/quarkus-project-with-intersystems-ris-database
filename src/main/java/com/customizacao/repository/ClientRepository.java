package com.customizacao.repository;

import javax.enterprise.context.ApplicationScoped;

import com.customizacao.entity.Client;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class ClientRepository  implements PanacheRepositoryBase<Client,Long>{

}
