package com.letsstartcoding.springbootrestapi.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

/**
 * Created by User on 10/24/2018.
 */

@Entity
@Table(name = "Employees")
@EntityListeners(AuditingEntityListener.class)

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotBlank
    private String name;
    @NotBlank
    private String designation;
    @NotBlank
    private String expertise;
    @NotBlank
    private Date createdAt;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public @NotBlank String getName() {
        return name;
    }

    public void setName(@NotBlank String name) {
        this.name = name;
    }

    public @NotBlank String getDesignation() {
        return designation;
    }

    public void setDesignation(@NotBlank String designation) {
        this.designation = designation;
    }

    public @NotBlank String getExpertise() {
        return expertise;
    }

    public void setExpertise(@NotBlank String expertise) {
        this.expertise = expertise;
    }

    public @NotBlank Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(@NotBlank Date createdAt) {
        this.createdAt = createdAt;
    }
}
