package com.demo.dao.impl;

import com.demo.dao.api.DemoDAO;
import com.demo.dao.mapper.DemoMapper;
import com.demo.model.po.DemoPO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * DemoDAO的实现
 *
 * @author bash
 * @version V1.0
 * @since 2014-10-31 13:53
 */
@Repository("demoDAO")
public class DemoDAOImpl implements DemoDAO {

    @Autowired
    private DemoMapper demoMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return demoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(DemoPO demoPO) {
        return demoMapper.insert(demoPO);
    }

    @Override
    public int insertSelective(DemoPO demoPO) {
        return demoMapper.insertSelective(demoPO);
    }

    @Override
    public DemoPO selectByPrimaryKey(Long id) {
        return demoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int update(DemoPO demoPO) {
        return demoMapper.update(demoPO);
    }
}
