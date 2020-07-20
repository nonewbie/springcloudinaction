/*
 * Create Author  : xtli3
 * Create Date    : 2020-07-19 22:03
 * File Name      : dto.java
 * Description    :
 */

package org.hziflytek.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserInfo {
    String userName;
    String email;
}
