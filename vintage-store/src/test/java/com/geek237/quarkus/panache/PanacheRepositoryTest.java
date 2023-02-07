package com.geek237.quarkus.panache;

import com.geek237.quarkus.jpa.Artist;
import com.geek237.quarkus.panache.repository.ArtistRepository;
import io.quarkus.test.TestTransaction;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@QuarkusTest
public class PanacheRepositoryTest {

  @Inject
  ArtistRepository repository;

  @Test
  @TestTransaction
  public void shouldCreateAndFindAArtist() {
    Artist artist = new Artist("name");

    assertFalse(repository.isPersistent(artist));
    repository.persist(artist);
    assertTrue(repository.isPersistent(artist));
    assertNotNull(artist.getId());

    artist = repository.findById(artist.getId());
    assertEquals("name", artist.getName());

    repository.deleteById(artist.getId());
    assertFalse(repository.isPersistent(artist));
  }
}
