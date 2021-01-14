package com.fh.service.impl;

import com.fh.mapper.BandMapper;
import com.fh.service.BandService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author junjie
 * @create 2021-01-13 19:56
 */
@Service
public class BandServiceImpl implements BandService {

    @Resource
    private BandMapper bandMapper;


}
