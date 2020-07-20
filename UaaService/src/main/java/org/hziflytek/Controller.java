/*
 * Create Author  : xtli3
 * Create Date    : 2020-07-16 23:37
 * File Name      : Controller.java
 * Description    : 验证 feign调用
 */

package org.hziflytek;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    LoginService loginService;

    @RequestMapping(value = "/login/{userId}")
    public String login(@PathVariable(value = "userId") String userId) {
        return loginService.getUserInfo(userId);
    }
}

