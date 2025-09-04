package com.example.cwivcbackend.controller;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
public class Users {
    @Id
    private int id;

    @Column
    private String google_id;

    @Column
    private String name;

    @Column
    private String role;

    @Column
    private String profile_pic;

    @Column
    private LocalDateTime created_at;
}
