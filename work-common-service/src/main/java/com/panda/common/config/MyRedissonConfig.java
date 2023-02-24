package com.panda.common.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyRedissonConfig {

    @Bean
    public RedissonClient redissonClient() {
        Config config = new Config();
        config.useSingleServer().setAddress("redis://redis-t.whsshg.com:50671")
                .setDatabase(15)
                .setPassword("be2ENdOFcSbVblpcgJ1w");
        return Redisson.create(config);
    }

}
