package com.work.services;


import com.work.beans.Value;

import java.util.List;
import java.util.Map;

public interface ValueService  {

    List<Value> getAll();
   Value get(String id);
    int save(Value value);
    int edit(Value value);
    int delete(String[] ids);
    List<Value> getBySearchAll(Map map);
}
