package com.fh.mapper;

import com.fh.model.Attr;
import com.fh.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author junjie
 * @create 2021-01-14 20:21
 */
public interface AttrMapper {

    Long queryCount(@Param("attr") Attr attr);

    List<Attr> queryList(@Param("pageUtils") PageUtils pageUtils,@Param("attr") Attr attr);

    void addAttr(Attr attr);

    Attr queryAttrById(Integer id);

    void updateAttr(Attr attrOld);

}
