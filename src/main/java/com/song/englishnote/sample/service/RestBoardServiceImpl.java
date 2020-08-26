package com.song.englishnote.sample.service;

import com.song.englishnote.sample.entity.BoardEntity;
import com.song.englishnote.sample.repository.RestBoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestBoardServiceImpl implements RestBoardService {

    @Autowired
    RestBoardRepository restsBoardRepository;

    @Override
    public List<BoardEntity> selectBoardList() throws Exception {
        return restsBoardRepository.findAllByOrderByBoardSeqDesc();
    }
}
