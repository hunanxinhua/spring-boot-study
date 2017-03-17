package com.spring.boot.study.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zouzhihui on 2017/3/17.
 */
@RestController
@RequestMapping("admin")
public class AdminController {

    @ApiOperation(value = "测试接口", httpMethod = "GET", notes = "测试接口")
    @RequestMapping("index")
    public String index() {
        return "success";
    }

    @ApiOperation(value = "问候接口", httpMethod = "GET", notes = "问候接口")
    @ApiImplicitParams({
        @ApiImplicitParam(name="firstName", value = "姓", paramType = "query", required = true, dataType = "String"),
        @ApiImplicitParam(name="lastName", value = "名字", paramType = "query", dataType = "String")
    })
    @RequestMapping("hello")
    public String hello(String firstName, String lastName) {
        return "hello world : " + firstName + "." + lastName;
    }

}
