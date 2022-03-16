package com.kiter.pod.controller;


import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @GetMapping("/login")
    public String login(@RequestParam(name = "name") String name, @RequestParam("password") String password){
        JSONObject json = new JSONObject();
        if ("root".equals(name) && "kiter".equals(password)){
            json.put("code",1);
            json.put("message","登陆成功");
            return json.toJSONString();
        }
        json.put("code",0);
        json.put("message","登陆失败");
        return json.toJSONString();
    }
}
