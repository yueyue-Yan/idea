package com.work.services;

import com.work.beans.Type;

import java.util.List;

public interface TypeService {
    List<Type> getAll();
    Type get(String id);
    int save(Type type);
    int edit(Type type);
    int delete(String[] ids);
}
