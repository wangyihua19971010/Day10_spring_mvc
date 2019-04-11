package com.gz.dao.pojo;

/**
 * Created by DELL on 2019/3/21.
 */
public class RoleInfo {
    private int roleid;
    private String rolename;


    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    @Override
    public String toString() {
        return "RoleInfo{" +
                "roleid=" + roleid +
                ", rolename='" + rolename + '\'' +
                '}';
    }
}
