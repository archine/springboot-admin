package com.gjing.client.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Gjing
 **/
@RestController
@Slf4j
public class TestController {

    @GetMapping("/test")
    public String test() {
        log.info("执行方法了。。。");
        return "ok";
    }
}
