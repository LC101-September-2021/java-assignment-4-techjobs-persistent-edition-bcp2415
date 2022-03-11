package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank
    @Size(max = 200, message="Location cannot be longer than 200 characters.")
    private String location;

    public Employer(String location) {
        this.location = location;
    }

    public Employer() {}

    // Getters and Setters:

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
