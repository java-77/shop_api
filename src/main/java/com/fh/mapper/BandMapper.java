package com.fh.mapper;

import com.fh.model.Band;
import com.fh.utils.PageUtils;

import java.util.List;

/**
 * @author junjie
 * @create 2021-01-13 19:55
 */
public interface BandMapper {
    Long queryCount();

    List<Band> queryList(PageUtils pageUtils);
}
