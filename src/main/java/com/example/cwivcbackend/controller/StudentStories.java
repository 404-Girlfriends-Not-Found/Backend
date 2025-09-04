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
public class StudentStories {
    @Id
    private int id;

    @JoinColumn(name = "user_id")
    private int user_id;

    @Column
    private String content;

    @Column
    private String video_url;

    @Column
    private String thumbnail_url;

    @Column
    private String link;

    @Column
    private LocalDateTime created_at;
}
