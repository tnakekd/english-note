package com.song.englishnote.sample.repository;

import com.song.englishnote.sample.entity.BoardEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RestBoardRepository extends CrudRepository<BoardEntity, Integer> {

    List<BoardEntity> findAllByOrderByBoardSeqDesc();

}
