package com.song.englishnote.sample.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "board")
@NoArgsConstructor
@Data
public class BoardEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int boardSeq;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String contents;

    @Column(nullable = false)
    private int hitCount = 0;

    @Column(nullable = false)
    private String creatorId;

    @Column(nullable = false)
    private LocalDateTime createdDatetime = LocalDateTime.now();

    private String updaterId;

    private String updatedDatetime;

}
