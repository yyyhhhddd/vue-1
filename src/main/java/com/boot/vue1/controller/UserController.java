package com.boot.vue1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright (C), 2006-2021, 青软实训有限公司
 * FileName: UserController
 * Author:   asus
 * Date:     2021/9/7 16:16
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@RestController
@RequestMapping("user")
public class UserController {
    private Integer id;
    private String name;
    private String author;
    private String ss;
    public void Stringa(){
        System.out.println("dada");
        System.out.println("qeddad");
        System.out.println("mastera");
        System.out.println("hot-fix");
    }
}