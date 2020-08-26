package com.song.englishnote.sample.service;

import com.song.englishnote.sample.entity.BoardEntity;

import java.util.List;

public interface RestBoardService {
    List<BoardEntity> selectBoardList() throws Exception;
}
