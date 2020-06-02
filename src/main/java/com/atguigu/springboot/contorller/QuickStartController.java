package com.atguigu.springboot.contorller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//等价于@Contorller +@ ResponseBody
public class QuickStartController {

    @RequestMapping("/quick" +
            "")
    public String quick(){

        return "springboot访问成功";
    }

}
