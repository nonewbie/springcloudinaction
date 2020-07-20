/*
 * Create Author  : xtli3
 * Create Date    : 2020-07-19 22:02
 * File Name      : UserController.java
 * Description    :
 */

package org.hziflytek.controller;

import org.hziflytek.dto.UserInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Value("${user-name}")
    String myName;

    @Value("${email}")
    String myEmail;

    @GetMapping(value = "/userinfo/{userId}")
    public UserInfo getUserInfo(@PathVariable(value = "userId") String userId) {
        if (userId.equals("nonewbie")) {
            return UserInfo.builder().userName(this.myName).email(this.myEmail).build();
        } else {
            throw new RuntimeException("no such user");
        }
    }
}
