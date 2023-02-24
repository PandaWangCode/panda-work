package com.panda.common.controller;


import com.baomidou.mybatisplus.extension.api.R;
import com.panda.common.service.RedissonService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping( "/api/test")
public class TestController {

    private final RedissonService redissonService;

    @GetMapping("/getRedisson")
    public R<String> getRedisson() {
        return redissonService.getRedisson();
    }

}
