package com.fh.service.impl;

import com.fh.mapper.ProductMapper;
import com.fh.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author junjie
 * @create 2021-01-18 20:53
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Resource
    private ProductMapper productMapper;

}
