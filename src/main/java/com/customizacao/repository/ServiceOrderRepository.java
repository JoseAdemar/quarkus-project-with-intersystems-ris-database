package com.customizacao.repository;

import javax.enterprise.context.ApplicationScoped;

import com.customizacao.entity.ServiceOrder;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class ServiceOrderRepository implements PanacheRepositoryBase<ServiceOrder, Long> {

}
