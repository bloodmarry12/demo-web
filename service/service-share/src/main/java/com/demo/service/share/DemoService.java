package com.demo.service.share;

import com.demo.model.bo.DemoBO;

public interface DemoService {

    int deleteByPrimaryKey(Long id);

    int insert(DemoBO demoBO);

    int insertSelective(DemoBO demoBO);

    DemoBO selectByPrimaryKey(Long id);

    int update(DemoBO demoBO);
}