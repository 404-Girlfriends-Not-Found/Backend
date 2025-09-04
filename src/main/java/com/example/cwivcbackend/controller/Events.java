package com.example.cwivcbackend.controller;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import lombok.Getter;
import lombok.Setter;
import org.aspectj.apache.bcel.classfile.LocalVariable;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
public class Events {
    @Id
    private int id;

    @JoinColumn(name = "opportunity_id")
    private int opportunity_id;

    @Column
    private String title;

    @Column
    private String description;

    @Column
    private LocalDateTime start_time;

    @Column
    private LocalDateTime end_time;

    @Column
    private LocalDateTime created_at;
}
