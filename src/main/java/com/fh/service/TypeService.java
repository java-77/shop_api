package com.fh.service;

import com.fh.model.Type;

import java.util.List;

/**
 * @author junjie
 * @create 2021-01-12 19:18
 */
public interface TypeService {

    List<Type> queryList();

    List<Type> queryListByPid(Integer pid);

    void addType(Type type);

    void updateType(Type type);
}
