package com.xkcoding.hello.service;

/**
 * <p>
 * Hello 服务接口
 * </p>
 *
 * @package: com.xkcoding.hello.service
 * @description: Hello 服务接口
 * @author: yangkai.shen
 * @date: Created in 2019-03-05 15:07
 * @copyright: Copyright (c) 2019
 * @version: V1.0
 * @modified: yangkai.shen
 */
public interface HelloService {
    /**
     * hello, {@code name}
     *
     * @param name who
     * @return hello, {@code name}
     */
    String sayHello(String name);
}
