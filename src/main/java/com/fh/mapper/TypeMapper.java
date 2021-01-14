package com.fh.mapper;

import com.fh.model.Type;

import java.util.List;

/**
 * @author junjie
 * @create 2021-01-12 17:16
 */
public interface TypeMapper {

    List<Type> queryList();

    List<Type> queryListByPid(Integer pid);

    void addType(Type type);

    Type getTypeById(Integer id);

    void updateType(Type oldType);
}
