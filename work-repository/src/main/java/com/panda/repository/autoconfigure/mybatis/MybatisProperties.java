package com.panda.repository.autoconfigure.mybatis;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author wangpan
 */
@Data
@Accessors(chain = true)
@ConfigurationProperties(prefix = "xss.mybatis")
public class MybatisProperties {
}
