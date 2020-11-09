package com.artsword.demo.controller;

import cn.hutool.core.util.StrUtil;
import com.artsword.demo.common.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {

    @Value("${server.port}")
    private String serverPort;


    @GetMapping("/hello")
    public Result hello() {
        String msg = StrUtil.format("端口:{}", serverPort);
        log.info(msg);
        return Result.success(msg);
    }
}
