package com.panda.common.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RedissonConfig {

    @Bean
    public RedissonClient redissonClient() {
        Config config = new Config();
        config.useSingleServer()
                .setDatabase(15)
                .setAddress("redis://redis-t.whsshg.com:50671")
                .setPassword("be2ENdOFcSbVblpcgJ1w");
        return Redisson.create(config);
    }

}
