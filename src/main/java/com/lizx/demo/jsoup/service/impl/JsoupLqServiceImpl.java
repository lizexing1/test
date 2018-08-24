package com.lizx.demo.jsoup.service.impl;

import com.lizx.demo.jsoup.mapper.JsoupLqServiceMapper;
import com.lizx.demo.jsoup.service.JsoupLqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class JsoupLqServiceImpl implements JsoupLqService {

    @Autowired
    private JsoupLqServiceMapper jsoupLqServiceMapper;

    @Override
    public List<Map<String, Object>> list() {
        List<Map<String, Object>> list = jsoupLqServiceMapper.list();
        return list;
    }
}
