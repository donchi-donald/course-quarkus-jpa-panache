package com.geek237.quarkus.panache.repository;

import com.geek237.quarkus.jpa.Customer;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.panache.common.Sort;


import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class CustomerRepository implements PanacheRepository<Customer> {

  public List<Customer> listAllDans() {
    return list("firstName = 'Dan'", Sort.by("lastName"));
  }
}
