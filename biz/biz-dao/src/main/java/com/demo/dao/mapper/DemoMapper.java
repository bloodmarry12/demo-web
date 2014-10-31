package com.demo.dao.mapper;

import com.demo.model.po.DemoPO;

public interface DemoMapper {

    int deleteByPrimaryKey(Long id);

    int insert(DemoPO demoPO);

    int insertSelective(DemoPO demoPO);

    DemoPO selectByPrimaryKey(Long id);

    int update(DemoPO demoPO);
}