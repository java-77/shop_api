package com.fh.controller;

import com.fh.common.ResultData;
import com.fh.common.ResultEnum;
import com.fh.service.AttrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("queryList")
    public ResultData queryList(){

        return ResultData.getResult(ResultEnum.SUCCESS,null);
    }
}
