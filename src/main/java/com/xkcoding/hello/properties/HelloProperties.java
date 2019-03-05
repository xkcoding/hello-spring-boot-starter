package com.xkcoding.hello.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * <p>
 * Hello 配置
 * </p>
 *
 * @package: com.xkcoding.hello.properties
 * @description: Hello 配置
 * @author: yangkai.shen
 * @date: Created in 2019-03-05 15:11
 * @copyright: Copyright (c) 2019
 * @version: V1.0
 * @modified: yangkai.shen
 */
@Data
@ConfigurationProperties(prefix = "hello")
public class HelloProperties {
    /**
     * 我
     */
    private String me;
}
