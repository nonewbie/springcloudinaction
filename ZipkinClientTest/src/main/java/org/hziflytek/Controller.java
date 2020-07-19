/*
 * Create Author  : xtli3
 * Create Date    : 2020-07-16 23:37
 * File Name      : Controller.java
 * Description    : 验证 config server
 */

package org.hziflytek;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Value("${foo}")
    String foo;

    @RequestMapping(value = "/foo")
    public String getFoo() {
        return foo;
    }
}

