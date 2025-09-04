package com.example.cwivcbackend.controller;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
public class Opportunities {
    @Id
    private int id;

    @Column
    private String title;

    @Column
    private String description;

    @Column
    private String type;

    @JoinColumn(name = "posted_by")
    private int posted_by;

    @Column
    private String location;

    @Column
    private String skills_required;

    @Column
    private String status;

    @Column
    private LocalDateTime created_at;

    @Column
    private LocalDateTime deadline;
}
