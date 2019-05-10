package com.example.demo.fish;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

// mapping a self join, many to many table.

@Entity
public class FishLike {
    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    private Fish toFish;

    @ManyToOne
    private Fish fromFish;

    // we can track extra fields by modeling the inbetween table
    private Date createOn;

    public FishLike() {

    }

    public FishLike(Fish to, Fish from, Date createOn) {
        this.toFish = to;
        this.fromFish = from;
        this.createOn = createOn;
    }

    public long getId() {
        return id;
    }

    public Fish getToFish() {
        return toFish;
    }

    public void setToFish(Fish toFish) {
        this.toFish = toFish;
    }

    public Fish getFromFish() {
        return fromFish;
    }

    public void setFromFish(Fish fromFish) {
        this.fromFish = fromFish;
    }

    public Date getCreateOn() {
        return createOn;
    }
}
