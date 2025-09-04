package com.example.cwivcbackend.controller;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
public class Groups {
    @Id
    private int id;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private LocalDateTime created_at;
}
