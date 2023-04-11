package com.work.mapper;

import com.work.beans.Value;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ValueMapper extends BaseMapper<Value,String> {
    //这里需要使用@Param("map")说明mybatis的参数名称
    List<Value> getBySearchAll(@Param("map") Map map);
}
