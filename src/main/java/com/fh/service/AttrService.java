package com.fh.service;

import com.fh.model.Attr;

import java.util.List;

/**
 * @author junjie
 * @create 2021-01-14 20:22
 */
public interface AttrService {

    List<Attr> queryList();

    void addAttr(Attr attr);

    Attr queryAttrById(Integer id);

    void updateAttr(Attr attr);
}
