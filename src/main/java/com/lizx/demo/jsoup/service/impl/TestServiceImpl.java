package com.lizx.demo.jsoup.service.impl;

import com.lizx.demo.jsoup.mapper.TestMapper;
import com.lizx.demo.jsoup.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public List<Map<String, Object>> list() {
        return testMapper.list();
    }
}
