package com.gz.vo;


import com.gz.tools.SplitePageBean;

/**
 * Created by DELL on 2019/3/29.
 */
public class UserInfoVo {

    private String username;
    private String name;
    private String email;

    private SplitePageBean splitePageBean;

    public SplitePageBean getSplitePageBean() {
        return splitePageBean;
    }

    public void setSplitePageBean(SplitePageBean splitePageBean) {
        this.splitePageBean = splitePageBean;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
    @Override
    public String toString() {
        return "UserInfoVo{" +
                "username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", splitePageBean=" + splitePageBean +
                '}';
    }

}
