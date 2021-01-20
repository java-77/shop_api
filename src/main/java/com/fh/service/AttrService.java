package com.fh.service;

import com.fh.model.Attr;
import com.fh.utils.PageUtils;

import java.util.List;

/**
 * @author junjie
 * @create 2021-01-14 20:22
 */
public interface AttrService {

    void queryList(PageUtils pageUtils, Attr attr);

    void addAttr(Attr attr);

    Attr queryAttrById(Integer id);

    void updateAttr(Attr attr);
}
