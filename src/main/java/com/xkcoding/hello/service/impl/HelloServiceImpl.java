/*
 *   Copyright [2019] [Yangkai.Shen]
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.xkcoding.hello.service.impl;

import com.xkcoding.hello.properties.HelloProperties;
import com.xkcoding.hello.service.HelloService;
import lombok.AllArgsConstructor;

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
