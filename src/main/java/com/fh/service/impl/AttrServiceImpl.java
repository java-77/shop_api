package com.fh.service.impl;

import com.fh.mapper.AttrMapper;
import com.fh.model.Attr;
import com.fh.service.AttrService;
import com.fh.utils.PageUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author junjie
 * @create 2021-01-14 20:22
 */
@Service
public class AttrServiceImpl implements AttrService {

    @Resource
    private AttrMapper attrMapper;

    @Override
    public void queryList(PageUtils pageUtils, Attr attr) {
        Long count = attrMapper.queryCount(attr);
        pageUtils.setCount(count);
        pageUtils.calStartIndex();
        List<Attr> list = attrMapper.queryList(pageUtils,attr);
        pageUtils.setData(list);
    }

    @Override
    public void addAttr(Attr attr) {
        attrMapper.addAttr(attr);
    }

    @Override
    public Attr queryAttrById(Integer id) {
        return attrMapper.queryAttrById(id);
    }

    @Override
    public void updateAttr(Attr attr) {
        Attr attrOld = attrMapper.queryAttrById(attr.getId());
        if (!StringUtils.isEmpty(attr.getName())){
            attrOld.setName(attr.getName());
        }
        if (!StringUtils.isEmpty(attr.getNameCH())){
            attrOld.setNameCH(attr.getNameCH());
        }
        if (!StringUtils.isEmpty(attr.getFormType())){
            attrOld.setFormType(attr.getFormType());
        }
        if (attr.getTypeId()!=null){
            attrOld.setTypeId(attr.getTypeId());
        }
        if (attr.getIsSKU()!=null){
            attrOld.setIsSKU(attr.getIsSKU());
        }
        if (attr.getIsDel()!=null){
            attrOld.setIsDel(attr.getIsDel());
        }
        attrMapper.updateAttr(attrOld);
    }
}
