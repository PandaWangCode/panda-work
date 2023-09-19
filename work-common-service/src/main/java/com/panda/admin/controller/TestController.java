package com.panda.admin.controller;


import com.panda.admin.service.TestService;
import com.panda.core.common.Constants;
import com.panda.core.pojo.rsp.R;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping( Constants.API+"/test")
public class TestController {

    private final TestService testService;

    @GetMapping("/printABC")
    public R<String> printABC() {
        return testService.printABC();
    }



}
