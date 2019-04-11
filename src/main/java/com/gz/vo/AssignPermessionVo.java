package com.gz.vo;


import java.io.Serializable;
import java.util.List;

/**
 * Created by DELL on 2019/4/2.
 */

public class AssignPermessionVo implements Serializable {

    private int roleid;
    private List<Integer> menuIds;

    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }

    public List<Integer> getMenuIds() {
        return menuIds;
    }

    public void setMenuIds(List<Integer> menuIds) {
        this.menuIds = menuIds;
    }

    @Override
    public String toString() {
        return "AssignPermessionVo{" +
                "roleid=" + roleid +
                ", menuIds=" + menuIds +
                '}';
    }
}
