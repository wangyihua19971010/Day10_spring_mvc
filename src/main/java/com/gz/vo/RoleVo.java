package com.gz.vo;

import com.gz.tools.SplitePageBean;

public class RoleVo {
    private String rolename;

    private SplitePageBean splitePageBean;

    public SplitePageBean getSplitePageBean() {
        return splitePageBean;
    }

    public void setSplitePageBean(SplitePageBean splitePageBean) {
        this.splitePageBean = splitePageBean;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    @Override
    public String toString() {
        return "RoleVo{" +
                "rolename='" + rolename + '\'' +
                ", splitePageBean=" + splitePageBean +
                '}';
    }
}
