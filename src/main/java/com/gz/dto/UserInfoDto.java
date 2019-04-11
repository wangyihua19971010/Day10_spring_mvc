package com.gz.dto;


import com.gz.dao.pojo.UserInfo;
import com.gz.tools.SplitePageBean;

import java.util.List;

/**
 * Created by DELL on 2019/3/29.
 */
public class UserInfoDto {
    //当前页数据
    List<UserInfo> userInfoList;
    //分页数据
    SplitePageBean splitePageBean;


    public List<UserInfo> getUserInfoList() {
        return userInfoList;
    }

    public void setUserInfoList(List<UserInfo> userInfoList) {
        this.userInfoList = userInfoList;
    }

    public SplitePageBean getSplitePageBean() {
        return splitePageBean;
    }

    public void setSplitePageBean(SplitePageBean splitePageBean) {
        this.splitePageBean = splitePageBean;
    }


    @Override
    public String toString() {
        return "UserInfoDto{" +
                "userInfoList=" + userInfoList +
                ", splitePageBean=" + splitePageBean +
                '}';
    }
}
