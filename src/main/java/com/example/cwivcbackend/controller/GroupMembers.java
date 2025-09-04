package com.example.cwivcbackend.controller;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Setter
@Getter
public class GroupMembers {
    @EmbeddedId
    private GroupMembersId id;

    @Column
    private String role;

    @Column
    private LocalDateTime joined_at;
}
