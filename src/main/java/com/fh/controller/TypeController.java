package com.fh.controller;

import com.fh.common.ResultData;
import com.fh.common.ResultEnum;
import com.fh.model.Type;
import com.fh.model.vo.TypeVo;
import com.fh.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author junjie
 * @create 2021-01-12 18:42
 */
@RestController
@RequestMapping("type")
@CrossOrigin
public class TypeController {

    @Autowired
    private TypeService typeService;

    /**
     * url:      http://localhost:8081/type/queryList
     * 请求方式： get
     * return    {"code": 200,"message": "成功","data": [{id,name,pid,isDel,createDate,updateDate,auther}]}
     */
    @GetMapping("queryList")
    public ResultData queryList(){
        List<Type> list = typeService.queryList();
        return ResultData.getResult(ResultEnum.SUCCESS,list);
    }

    /**
     * url:      http://localhost:8081/type/queryListTem
     * 请求方式： get
     * return    {"code": 200,"message": "成功","data": [{id,name,pid,isDel,createDate,updateDate,auther}]}
     */
    @GetMapping("queryListTem")
    public ResultData queryListTem(){
        List<TypeVo> list = typeService.queryListTem();
        return ResultData.getResult(ResultEnum.SUCCESS,list);
    }





    /**
     * url:      http://localhost:8081/type/queryListByPid
     * 请求方式： get
     * 参数：     {'pid':Integer}
     * return    {"code": 200,"message": "成功","data": [{id,name,pid,isDel,createDate,updateDate,auther}]}
     */
    @GetMapping("queryListByPid")
    public ResultData queryListByPid(Integer pid){
        List<Type> list = typeService.queryListByPid(pid);
        return ResultData.getResult(ResultEnum.SUCCESS,list);
    }
    /**
     * url:      http://localhost:8081/type/addType
     * 请求方式： post
     * 参数：     {'pid':Integer,'name':String}
     * return    {"code": 200,"message": "成功","data": Integer}
     */
    @PostMapping("addType")
    public ResultData addType(Type type){
        typeService.addType(type);
        return ResultData.getResult(ResultEnum.SUCCESS,type.getId());
    }
    /**
     * url:      http://localhost:8081/type/updateType
     * 请求方式： post
     * 参数：     {'id必传':integer,'pid':Integer,'name':String,'isDel':Integer}
     * return    {"code": 200,"message": "成功"}
     */
    @PostMapping("updateType")
    public ResultData updateType(Type type){
        if (type.getId()==null){
            return ResultData.getResult(ResultEnum.ERROR_PARAM);
        }
        typeService.updateType(type);
        return ResultData.getResult(ResultEnum.SUCCESS);
    }

}
