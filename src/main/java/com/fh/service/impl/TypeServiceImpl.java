package com.fh.service.impl;

import com.fh.mapper.TypeMapper;
import com.fh.model.Type;
import com.fh.model.vo.TypeVo;
import com.fh.service.TypeService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
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
        if (!StringUtils.isEmpty(type.getName())) {
            oldType.setName(type.getName());
        }
        if (type.getIsDel() != null) {
            oldType.setIsDel(type.getIsDel());
        }
        if (type.getPid() != null) {
            oldType.setPid(type.getPid());
        }
        typeMapper.updateType(oldType);
    }

    @Override
    public List<TypeVo> queryListTem() {
        List<Type> list = typeMapper.queryList();
        List<TypeVo> voList = new ArrayList<>();
        for (Type type : list) {
            Boolean flag = true;
            for (Type type1 : list) {
                if (type1.getPid().equals(type.getId())){
                    flag=false;
                    break;
                }
            }
            if (flag){                          //所有的最低级节点
                TypeVo typeVo = new TypeVo();
                typeVo.setId(type.getId());
                String voName = type.getName()+'/';                                //拼接父级节点name
                voName = getVoName(type.getPid(),list,voName);
                typeVo.setName(voName);

                voList.add(typeVo);
            }
        }

        return voList;
    }

    private String getVoName(Integer id,List<Type> list,String voName){
        for (Type type : list) {
            if (type.getId().equals(id)){
                if (type.getPid()!=0){
                    voName+=type.getName()+'/';
                    voName = this.getVoName(type.getPid(),list,voName);
                }else {
                    voName+=type.getName();
                    break;
                }
            }
        }
        return voName;
    }
}
