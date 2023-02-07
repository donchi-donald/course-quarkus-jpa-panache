package com.geek237.quarkus.panache.repository;

import com.geek237.quarkus.jpa.Artist;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.panache.common.Sort;


import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class ArtistRepository implements PanacheRepository<Artist> {

  public List<Artist> listAllArtistsSorted() {
    return listAll(Sort.descending("name"));
  }
}
