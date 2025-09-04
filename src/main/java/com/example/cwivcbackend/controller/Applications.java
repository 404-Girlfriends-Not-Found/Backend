package com.example.cwivcbackend.controller;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


@Getter
@Setter
@Entity
public class Applications {
    @Id
    private int id;

    @JoinColumn(name = "user_id")
    private int user_id;

    @JoinColumn(name = "opportunity_id")
    private int opportunity_id;

    @Column
    private String status;

    @Column
    private int hours_logged;

    @Column
    private LocalDateTime created_at;
}