package com.lizx.demo.jsoup.controller;

import com.lizx.demo.jsoup.service.JsoupLqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class JsoupLq {

    @Autowired
    private JsoupLqService jsoupLqService;

    @RequestMapping("list")
    @ResponseBody
    public List<Map<String, Object>> list() {
        return jsoupLqService.list();
    }

}
