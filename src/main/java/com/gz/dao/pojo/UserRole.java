package com.gz.dao.pojo;

import java.util.Arrays;

public class UserRole {
    private int urid;
    private int roleid;
    private int userId;
    private int[] croleid;
    private int status;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getUrid() {
        return urid;
    }

    public void setUrid(int urid) {
        this.urid = urid;
    }

    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int[] getCroleid() {
        return croleid;
    }

    public void setCroleid(int[] croleid) {
        this.croleid = croleid;
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "urid=" + urid +
                ", roleid=" + roleid +
                ", userId=" + userId +
                ", croleid=" + Arrays.toString(croleid) +
                '}';
    }
}
