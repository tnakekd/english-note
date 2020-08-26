package com.song.englishnote.sample.controller;

import com.song.englishnote.sample.entity.BoardEntity;
import com.song.englishnote.sample.service.RestBoardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class RestBoardController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private RestBoardService restBoardService;

    @RequestMapping(value="board", method= RequestMethod.GET)
    public ModelAndView openBoardList() throws Exception {
        log.debug("openBoardList");

        ModelAndView mv = new ModelAndView("/board/boardList");

        List<BoardEntity> list = restBoardService.selectBoardList();
        mv.addObject("list", list);

        return mv;
    }

}
