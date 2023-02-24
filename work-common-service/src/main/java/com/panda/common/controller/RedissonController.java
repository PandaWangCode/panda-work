package com.panda.common.controller;


import com.panda.common.service.RedissonService;
import com.panda.core.common.Constants;
import com.panda.core.pojo.rsp.R;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping( Constants.API+"/redisson")
public class RedissonController {

    private final RedissonService redissonService;

    @GetMapping("/getRedisson")
    public R<String> getRedisson() {
        return redissonService.getRedisson();
    }

    @GetMapping("/rLock")
    public R<String> getRedissonLock() {
        return redissonService.redissonLock();
    }

}
