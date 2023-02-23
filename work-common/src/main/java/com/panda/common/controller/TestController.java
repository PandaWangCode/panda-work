package com.panda.common.controller;


import com.baomidou.mybatisplus.extension.api.R;
import com.panda.common.service.GuoYaoService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping( "api/customer")
public class TestController {

    private final GuoYaoService guoYaoService;

    @GetMapping("/getRedisson")
    public R<String> getRedisson() {
        return guoYaoService.getRedisson();
    }

}
