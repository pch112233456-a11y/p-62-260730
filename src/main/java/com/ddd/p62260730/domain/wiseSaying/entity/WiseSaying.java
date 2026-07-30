package com.ddd.p62260730.domain.wiseSaying.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class WiseSaying {
    @Id
    private int id; // int
    private String content; // varchar(255)
    private String author; // varchar(255)

}
