package com.lizx.demo.jsoup.controller;

import com.lizx.demo.jsoup.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("test")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("list")
    @ResponseBody
    public List<Map<String, Object>> list() {
        return testService.list();
    }

}
