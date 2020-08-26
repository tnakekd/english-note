package com.song.englishnote.sample.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/sample")
    public String sample() {
        return "Hello World!";
    }

}