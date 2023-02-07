package com.geek237.quarkus.panache.model;
import com.geek237.quarkus.jpa.Artist;
import io.quarkus.hibernate.orm.panache.PanacheEntity;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.Instant;


@Entity
@Table(name = "t_items")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Item extends PanacheEntity {

    // ======================================
    // =             Attributes             =
    // ======================================

    @Column(length = 100, nullable = false)
    public String title;

    @Column(length = 3000)
    public String description;

    @Column(nullable = false)
    public BigDecimal price;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "artist_fk")
    public Artist artist;

    @Column(name = "created_date", nullable = false)
    public Instant createdDate = Instant.now();
}
