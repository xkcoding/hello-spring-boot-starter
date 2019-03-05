package com.xkcoding.hello.config;

import com.xkcoding.hello.properties.HelloProperties;
import com.xkcoding.hello.service.HelloService;
import com.xkcoding.hello.service.impl.HelloServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 * Hello 自动装配
 * </p>
 *
 * @package: com.xkcoding.hello.annotation
 * @description: Hello 自动装配
 * @author: yangkai.shen
 * @date: Created in 2019-03-05 15:06
 * @copyright: Copyright (c) 2019
 * @version: V1.0
 * @modified: yangkai.shen
 */
@Configuration
@AllArgsConstructor
@EnableConfigurationProperties({HelloProperties.class})
public class HelloAutoConfiguration {
    private final HelloProperties helloProperties;

    @Bean
    @ConditionalOnMissingBean
    public HelloService helloService() {
        return new HelloServiceImpl(helloProperties);
    }
}
