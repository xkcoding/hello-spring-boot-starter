package com.xkcoding.hello.service.impl;

import com.xkcoding.hello.properties.HelloProperties;
import com.xkcoding.hello.service.HelloService;
import lombok.AllArgsConstructor;

/**
 * <p>
 * Hello 服务接口默认实现
 * </p>
 *
 * @package: com.xkcoding.hello.service.impl
 * @description: Hello 服务接口默认实现
 * @author: yangkai.shen
 * @date: Created in 2019-03-05 15:09
 * @copyright: Copyright (c) 2019
 * @version: V1.0
 * @modified: yangkai.shen
 */
@AllArgsConstructor
public class HelloServiceImpl implements HelloService {
    private HelloProperties helloProperties;

    /**
     * hello, {@code name}
     *
     * @param name who
     * @return hello, {@code name}
     */
    @Override
    public String sayHello(String name) {
        return "Hello, " + name + ", I'm " + helloProperties.getMe();
    }
}
