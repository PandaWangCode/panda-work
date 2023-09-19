package com.panda.admin.controller;


import com.panda.admin.service.RedissonService;
import com.panda.core.common.Constants;
import com.panda.core.pojo.rsp.R;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping( Constants.API + "/redisson")
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

    @GetMapping("/readWriteLock/write")
    public R<String> write() {
        return redissonService.writeValue();
    }

    @GetMapping("/readWriteLock/read")
    public R<String> read() {
        return redissonService.readValue();
    }


}
