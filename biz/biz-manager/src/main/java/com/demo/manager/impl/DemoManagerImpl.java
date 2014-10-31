package com.demo.manager.impl;

import com.demo.dao.api.DemoDAO;
import com.demo.manager.api.DemoManager;
import com.demo.model.bo.DemoBO;
import com.demo.model.po.DemoPO;
import com.demo.model.util.transform.DemoTrans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Demo Manager Impl
 *
 * @author bash
 * @version V1.0
 * @since 2014-10-31 14:10
 */
@Service("demoManager")
public class DemoManagerImpl implements DemoManager {

    @Autowired
    private DemoDAO demoDAO;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return demoDAO.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(DemoBO demoBO) {
        DemoPO demoPO = DemoTrans.transform(demoBO);
        return demoDAO.insert(demoPO);
    }

    @Override
    public int insertSelective(DemoBO demoBO) {
        DemoPO demoPO = DemoTrans.transform(demoBO);
        return demoDAO.insertSelective(demoPO);
    }

    @Override
    public DemoBO selectByPrimaryKey(Long id) {
        DemoPO demoPO = demoDAO.selectByPrimaryKey(id);
        return DemoTrans.transform(demoPO);
    }

    @Override
    public int update(DemoBO demoBO) {
        DemoPO demoPO = DemoTrans.transform(demoBO);
        return demoDAO.update(demoPO);
    }
}
