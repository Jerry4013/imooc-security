package com.imooc.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by Jingchao Zhang
 * Date: 2020-05-11
 * Time: 12:13 PM
 */
@Data
public class UserQueryCondition {

    private String username;

    @ApiModelProperty(value = "用户年龄")
    private int age;

    private int ageTo;

    private String xxx;
}
