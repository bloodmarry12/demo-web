package com.demo.model.util.transform;

import com.demo.model.bo.DemoBO;
import com.demo.model.po.DemoPO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Demo BO 与 PO 的相互转化
 *
 * @author guoll
 * @version V1.0
 * @since 2014-09-28 16:09
 */
public final class DemoTrans {

    private DemoTrans() {
    }

    /**
     * Demo  BO转PO
     *
     * @param demoBO
     * @return
     */
    public static DemoPO transform(DemoBO demoBO) {
        if (null == demoBO) {
            return null;
        }
        DemoPO demoPO = new DemoPO();
        demoPO.setId(demoBO.getId());
        demoPO.setName(demoBO.getName());
        demoPO.setBirthday(demoBO.getBirthday());
        demoPO.setIsDelete(demoBO.getIsDelete());
        demoPO.setGmtCreated(demoBO.getGmtCreated());
        demoPO.setGmtModified(demoBO.getGmtModified());
        return demoPO;
    }

    /**
     * Demo PO 转BO
     *
     * @param demoPO
     * @return
     */
    public static DemoBO transform(DemoPO demoPO) {
        if (null == demoPO) {
            return null;
        }
        DemoBO demoBO = new DemoBO();
        demoBO.setId(demoPO.getId());
        demoBO.setName(demoPO.getName());
        demoBO.setBirthday(demoPO.getBirthday());
        demoBO.setIsDelete(demoPO.getIsDelete());
        demoBO.setGmtCreated(demoPO.getGmtCreated());
        demoBO.setGmtModified(demoPO.getGmtModified());
        return demoBO;
    }

    /**
     * 将 DemoPO 列表转换成 DemoBO列表
     *
     * @param demoPOList
     * @return
     */
    public static List<DemoBO> transform(List<DemoPO> demoPOList) {
        if (demoPOList.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        List<DemoBO> demoBOList = new ArrayList<DemoBO>();
        for (DemoPO demoPOResult : demoPOList) {
            demoBOList.add(DemoTrans.transform(demoPOResult));
        }
        return demoBOList;
    }
}
