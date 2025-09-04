package com.example.cwivcbackend.controller;

import java.time.LocalDateTime;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Achievements {
    @Id
    @Column
    private int id;

    @JoinColumn(name = "opportunity_id")
    private int opportunity_id;

    @Column
    private String title;

    @Column
    private String description;

    @Column
    private LocalDateTime date_awarded;
}
