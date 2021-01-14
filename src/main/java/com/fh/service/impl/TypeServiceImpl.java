package com.fh.service.impl;

import com.fh.mapper.TypeMapper;
import com.fh.model.Type;
import com.fh.service.TypeService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author junjie
 * @create 2021-01-12 19:18
 */
@Service
public class TypeServiceImpl implements TypeService {

    @Resource
    private TypeMapper typeMapper;

    @Override
    public List<Type> queryList() {
        return typeMapper.queryList();
    }

    @Override
    public List<Type> queryListByPid(Integer pid) {
        return typeMapper.queryListByPid(pid);
    }

    @Override
    public void addType(Type type) {
        typeMapper.addType(type);
    }

    @Override
    public void updateType(Type type) {
        Type oldType = typeMapper.getTypeById(type.getId());
        if (!StringUtils.isEmpty(type.getName())){
            oldType.setName(type.getName());
        }
        if (type.getIsDel()!=null){
            oldType.setIsDel(type.getIsDel());
        }
        if (type.getPid()!=null){
            oldType.setPid(type.getPid());
        }
        typeMapper.updateType(oldType);
    }
}
