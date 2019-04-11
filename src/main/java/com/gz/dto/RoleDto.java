package com.gz.dto;


import com.gz.dao.pojo.RoleInfo;
import com.gz.dao.pojo.UserInfo;
import com.gz.tools.SplitePageBean;

import java.util.List;

/**
 * Created by DELL on 2019/3/29.
 */
public class RoleDto {
    //当前页数据
    List<RoleInfo> roleInfoList;
    //分页数据
    SplitePageBean splitePageBean;


    public List<RoleInfo> getRoleInfoList() {
        return roleInfoList;
    }

    public void setRoleInfoList(List<RoleInfo> roleInfoList) {
        this.roleInfoList = roleInfoList;
    }

    public SplitePageBean getSplitePageBean() {
        return splitePageBean;
    }

    public void setSplitePageBean(SplitePageBean splitePageBean) {
        this.splitePageBean = splitePageBean;
    }

    @Override
    public String toString() {
        return "RoleDto{" +
                "roleInfoList=" + roleInfoList +
                ", splitePageBean=" + splitePageBean +
                '}';
    }
}
