package com.work.mapper;

import java.util.List;

public interface BaseMapper<T, I> {

    List<T> getAll();

    T get(I id);

    int save(T beans);

    int edit(T beans);

    int delete(I[] ids);

}
