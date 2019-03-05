package com.xkcoding.hello.annotation;

import com.xkcoding.hello.config.HelloAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * <p>
 * 开启 Hello 注解
 * </p>
 *
 * @package: com.xkcoding.hello.annotation
 * @description: 开启 Hello 注解
 * @author: yangkai.shen
 * @date: Created in 2019-03-05 15:01
 * @copyright: Copyright (c) 2019
 * @version: V1.0
 * @modified: yangkai.shen
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({HelloAutoConfiguration.class})
public @interface EnableHello {
}
