package com.fh.mapper;

import com.fh.model.Attr;

import java.util.List;

/**
 * @author junjie
 * @create 2021-01-14 20:21
 */
public interface AttrMapper {

    List<Attr> queryList();

    void addAttr(Attr attr);

    Attr queryAttrById(Integer id);

    void updateAttr(Attr attrOld);
}
