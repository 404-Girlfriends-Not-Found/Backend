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
public class TalentRequests {
    @Id
    private int id;

    @JoinColumn(name = "opportunity_id")
    private int opportunity_id;

    @Column
    private String description;

    @Column
    private String skills_needed;

    @Column
    private LocalDateTime created_at;
}
