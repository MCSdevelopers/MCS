package logic;

import java.util.ArrayList;

/**
 * Created by user on 06.03.2015.
 */
public class Specialist {
    private Long id;
    private String name;
    private String surName;
    private String fathersName;
    private String position;
    private String rank;

    public Specialist(){};

    //getters
    public String getRank() {
        return rank;
    }

    public String getFathersName() {
        return fathersName;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getSurName() {
        return surName;
    }

    // setters

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
