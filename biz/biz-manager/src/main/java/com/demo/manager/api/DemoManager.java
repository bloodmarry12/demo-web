package com.demo.manager.api;

import com.demo.model.bo.DemoBO;

public interface DemoManager {

    int deleteByPrimaryKey(Long id);

    int insert(DemoBO demoBO);

    int insertSelective(DemoBO demoBO);

    DemoBO selectByPrimaryKey(Long id);

    int update(DemoBO demoBO);
}