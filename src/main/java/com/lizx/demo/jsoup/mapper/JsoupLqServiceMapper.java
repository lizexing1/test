package com.lizx.demo.jsoup.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface JsoupLqServiceMapper {

    @Select("select * from t_goods")
    List<Map<String, Object>> list();

}
