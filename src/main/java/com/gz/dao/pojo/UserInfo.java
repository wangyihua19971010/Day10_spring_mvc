package com.gz.dao.pojo;

import java.util.List;

/**
 * Created by DELL on 2019/3/20.
 */
public class UserInfo {
    private int userId;
    private String username;
    private String password;
    private String name;
    private String email;
    private int status;
    private List<RoleInfo> roleInfos;

    //想要有一个角色集合
    private int[] cuserId;

    public int[] getCuserId() {
        return cuserId;
    }

    public void setCuserId(int[] cuserId) {
        this.cuserId = cuserId;
    }


    public List<RoleInfo> getRoleInfos() {
        return roleInfos;
    }

    public void setRoleInfos(List<RoleInfo> roleInfos) {
        this.roleInfos = roleInfos;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", status=" + status +
                ", roleInfos=" + roleInfos +
                '}';
    }
}
