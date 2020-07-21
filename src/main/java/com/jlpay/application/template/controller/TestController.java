package com.jlpay.application.template.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lishaofeng
 */
@Slf4j
@RestController
public class TestController {



    @PostMapping("/test")
    public String testPost(@RequestBody String info)  {
        return "00";

    }

    @GetMapping("/test")
    public String testGet( String info)  {
        return "00";

    }
}