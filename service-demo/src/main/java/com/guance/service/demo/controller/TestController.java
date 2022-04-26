package com.guance.service.demo.controller;

import com.guance.service.demo.config.HostConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuyj
 * @since 2022/4/26 9:27
 */

@RestController
public class TestController {
    private final static Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private HostConfig hostConfig;

    @GetMapping("/ping")
    public String getPing(){
        logger.info("当前pod所在服务器是{},{}",hostConfig.getIp(),hostConfig.getName());
        return "pong from " + hostConfig.getName() ;
    }

    @GetMapping("errorTest")
    public String getError(){
        logger.info("调用 error");
        int i = 0;
        int j = 10 / i;
        return "error Test";
    }

}
