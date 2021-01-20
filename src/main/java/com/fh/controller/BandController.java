package com.fh.controller;

import com.fh.common.ResultData;
import com.fh.common.ResultEnum;
import com.fh.service.BandService;
import com.fh.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author junjie
 * @create 2021-01-13 19:57
 */
@RestController
@RequestMapping("band")
@CrossOrigin
public class BandController {

    @Autowired
    private BandService bandService;

    @PostMapping("queryList")
    public ResultData queryList(PageUtils pageUtils){
        bandService.queryList(pageUtils);
        return ResultData.getResult(ResultEnum.SUCCESS,pageUtils);
    }


}
