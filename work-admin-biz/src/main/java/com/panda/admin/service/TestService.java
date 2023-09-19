package com.panda.admin.service;

import com.panda.core.pojo.rsp.R;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.concurrent.Semaphore;

@Slf4j
@Service
@RequiredArgsConstructor
public class TestService {

    public R<String> printABC() {
        return R.ok("");
    }

}
