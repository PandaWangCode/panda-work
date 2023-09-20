package com.panda.admin.service;

import com.panda.core.ifs.rpc.common.ICommonTestService;
import com.panda.core.pojo.rsp.R;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

import java.util.concurrent.Semaphore;

@Slf4j
@Service
@RequiredArgsConstructor
public class TestService {

    @DubboReference
    ICommonTestService iCommonTestService;

    public R<String> printABC() {
        iCommonTestService.printABC();
        return R.ok("");
    }

}
