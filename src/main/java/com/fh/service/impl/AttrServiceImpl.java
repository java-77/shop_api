package com.fh.service.impl;

import com.fh.mapper.AttrMapper;
import com.fh.service.AttrService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author junjie
 * @create 2021-01-14 20:22
 */
@Service
public class AttrServiceImpl implements AttrService {

    @Resource
    private AttrMapper attrMapper;
}
