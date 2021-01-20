package com.fh.service.impl;

import com.fh.mapper.BandMapper;
import com.fh.model.Band;
import com.fh.service.BandService;
import com.fh.utils.PageUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author junjie
 * @create 2021-01-13 19:56
 */
@Service
public class BandServiceImpl implements BandService {

    @Resource
    private BandMapper bandMapper;

    @Override
    public void queryList(PageUtils pageUtils) {
        Long count = bandMapper.queryCount();
        pageUtils.setCount(count);
        pageUtils.calStartIndex();
        List<Band> list = bandMapper.queryList(pageUtils);
        pageUtils.setData(list);
    }
}
