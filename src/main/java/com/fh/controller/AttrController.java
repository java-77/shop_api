package com.fh.controller;

import com.fh.common.ResultData;
import com.fh.common.ResultEnum;
import com.fh.model.Attr;
import com.fh.service.AttrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author junjie
 * @create 2021-01-14 20:20
 */
@RestController
@RequestMapping("attr")
@CrossOrigin
public class AttrController {

    @Autowired
    private AttrService attrService;

    /**
     * url:      http://localhost:8081/attr/queryList
     * 请求方式： get
     * return    {"code": 200,"message": "成功","data": [{id,name,nameCH,typeId,formType,isSKU,isDel,createDate,updateDate,auther}]}
     */
    @GetMapping("queryList")
    public ResultData queryList(){
        return ResultData.getResult(ResultEnum.SUCCESS,attrService.queryList());
    }
    /**
     * url:      http://localhost:8081/attr/addAttr
     * 请求方式： post
     * 参数：     {'name':String,'nameCH':String,'typeId':Integer,'formType':String,'isSKU':Integer}
     * return    {"code": 200,"message": "成功","data": Integer}
     */
    @PostMapping("addAttr")
    public ResultData addAttr(Attr attr){
        attrService.addAttr(attr);
        return ResultData.getResult(ResultEnum.SUCCESS,attr.getId());
    }
}
