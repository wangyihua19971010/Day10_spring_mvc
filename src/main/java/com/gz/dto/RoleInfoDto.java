package com.gz.dto;

public class RoleInfoDto {
    private int roleid;
    private String rolename;
    private int userId;

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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "RoleInfoDto{" +
                "roleid=" + roleid +
                ", rolename='" + rolename + '\'' +
                ", userId=" + userId +
                '}';
    }
}
