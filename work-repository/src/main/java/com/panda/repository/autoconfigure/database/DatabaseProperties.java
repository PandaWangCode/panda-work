package com.panda.repository.autoconfigure.database;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author wangpan
 */
@Data
@Accessors(chain = true)
@ConfigurationProperties(prefix = "xss.database")
public class DatabaseProperties {

}
