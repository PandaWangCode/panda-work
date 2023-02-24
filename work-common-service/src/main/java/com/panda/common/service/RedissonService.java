package com.panda.common.service;

import com.baomidou.mybatisplus.extension.api.R;
import lombok.RequiredArgsConstructor;
import org.redisson.api.RList;
import org.redisson.api.RedissonClient;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RedissonService {

    private final RedissonClient redissonClient;

    public R<String> getRedisson() {
        RList<String> nameList = redissonClient.getList("nameList");
        nameList.clear();
        nameList.add("bingo");
        nameList.add("yanglbme");
        nameList.add("https://github.com/yanglbme");
        // nameList.remove(-1);
        boolean contains = nameList.contains("yanglbme");
        System.out.println("List size: " + nameList.size());
        System.out.println("Is list contains name 'yanglbme': " + contains);
        nameList.forEach(System.out::println);

        return R.ok(nameList.toString());
    }

}
