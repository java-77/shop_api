package com.fh.controller;

import com.fh.common.ResultData;
import com.fh.common.ResultEnum;
import com.fh.service.AttrValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author junjie
 * @create 2021-01-20 14:23
 */
@RestController
@RequestMapping("attrValue")
@CrossOrigin
public class AttrValueController {

    @Autowired
    private AttrValueService attrValueService;

    @RequestMapping("queryListByAttrId")
    public ResultData queryListByAttrId(Integer id){

        return ResultData.getResult(ResultEnum.SUCCESS);
    }

}
