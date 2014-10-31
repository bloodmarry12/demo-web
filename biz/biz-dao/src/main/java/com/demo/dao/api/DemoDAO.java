package com.demo.dao.api;

import com.demo.model.po.DemoPO;

public interface DemoDAO {

    int deleteByPrimaryKey(Long id);

    int insert(DemoPO demoPO);

    int insertSelective(DemoPO demoPO);

    DemoPO selectByPrimaryKey(Long id);

    int update(DemoPO demoPO);
}