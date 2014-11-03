package com.demo.service.impl;

import com.demo.manager.api.DemoManager;
import com.demo.model.bo.DemoBO;
import com.demo.service.share.DemoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("demoService")
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoManager demoManager;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return demoManager.deleteByPrimaryKey(id);
    }

    @Override
    public Long insert(DemoBO demoBO) {
        return demoManager.insert(demoBO);
    }

    @Override
    public int insertSelective(DemoBO demoBO) {
        return demoManager.insertSelective(demoBO);
    }

    @Override
    public DemoBO selectByPrimaryKey(Long id) {
        return demoManager.selectByPrimaryKey(id);
    }

    @Override
    public int update(DemoBO demoBO) {
        return demoManager.update(demoBO);
    }
}