package com.example.demo.koalas;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

// Mapping a self join many to many using a "JoinTable" annotation
@Entity
public class Koala {
    @Id
    @GeneratedValue
    private long id;

    private String name;

    @ManyToMany
    // This _creates_ a new table in the database
    // that tracks the to/from like relationships
    @JoinTable(
            name = "koala_like",
            joinColumns = {@JoinColumn(name = "to_id")},
            inverseJoinColumns = {@JoinColumn(name = "from_id")}
    )
    private Set<Koala> likes;

    // because the @JoinTable is on "likes"
    // that's the "owner" (mappedBy)
    @ManyToMany(mappedBy = "likes")
    private Set<Koala> likers;

    public Koala() {
        // when we create a new Koala
        // these are null
        // the won't be once you query, but they are before then.
        this.likers = new HashSet<>();
        this.likes = new HashSet<>();
    }

    public Koala(String name) {
        this();  // kalls Koala() controller to init the likers/likes
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public Set<Koala> getLikers() {
        return likers;
    }

    public Set<Koala> getLikes() {
        return likes;
    }
}
