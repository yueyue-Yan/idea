package com.work.services;

import com.work.beans.Value;
import com.work.mapper.ValueMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ValueServiceImpl implements ValueService {
    @Autowired
    ValueMapper valueMapper;

    @Override
    public List<Value> getAll() {
        return valueMapper.getAll();
    }

    @Override
    public Value get(String id) {
        return valueMapper.get(id);
    }

    @Override
    public int save(Value value) {
        return valueMapper.save(value);
    }

    @Override
    public int edit(Value value) {
        return valueMapper.edit(value);
    }

    @Override
    public int delete(String[] ids) {
        return valueMapper.delete(ids);
    }

    @Override
    public List<Value> getBySearchAll(Map map) {
        return valueMapper.getBySearchAll(map);
    }
}
