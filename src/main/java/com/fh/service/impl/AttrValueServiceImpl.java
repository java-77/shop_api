package com.fh.service.impl;

import com.fh.mapper.AttrValueMapper;
import com.fh.service.AttrValueService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author junjie
 * @create 2021-01-20 14:25
 */
@Service
public class AttrValueServiceImpl implements AttrValueService {

    @Resource
    private AttrValueMapper attrValueMapper;

}
