package com.fh.controller;

import com.fh.common.ResultData;
import com.fh.common.ResultEnum;
import com.fh.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author junjie
 * @create 2021-01-18 20:51
 */
@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("addPro")
    public ResultData addPro(){


        return ResultData.getResult(ResultEnum.SUCCESS);
    }


}
