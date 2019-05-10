package com.example.demo.fish;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

// mapping a many to many self join "through" another model'd table

@Entity
public class Fish {
    @Id
    @GeneratedValue
    private long id;

    private String name;

    // Both of these are mappedBy the FishLike class
    // it's the "owner" of the foreign keys
    @OneToMany(mappedBy = "fromFish")
    private Set<FishLike> likes;

    @OneToMany(mappedBy = "toFish")
    private Set<FishLike> likers;

    public Fish() {
        // required by hibernate
    }

    public Fish(String name) {
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

    public Set<FishLike> getLikes() {
        return likes;
    }

    public Set<FishLike> getLikers() {
        return likers;
    }
}
