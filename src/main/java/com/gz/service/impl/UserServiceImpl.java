package com.gz.service.impl;


import com.gz.dao.mapper.UserMapper;
import com.gz.dao.pojo.UserInfo;
import com.gz.service.UserService;
import com.gz.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    public boolean loginCheck(UserInfo userInfo) {
        if(userMapper.loginCheck(userInfo)!=null){
            return true;
        }
        return false;
    }


    /**
     * 查询所有
     */
    public List<UserInfo> getAll(UserInfo userInfo) {
        List<UserInfo> list = this.userMapper.getAll(userInfo);
        return list;
    }

    /**
     * 增加
     */
    public boolean getAdd(UserInfo userInfo) {
        int add = this.userMapper.getAdd(userInfo);
        if(add>0){
            return true;
        }
        return false;
    }

    /**
     * 删除
     */
    public boolean getDelete(UserInfo id) {
        int delete = this.userMapper.getDelete(id);
        if (delete>0){
            return true;
        }
        return false;
    }
    /**
     * 修改
     */
    public boolean getAmend(UserInfo userInfo) {
        boolean flag = false;
        if(this.userMapper.getAmend(userInfo)>0){
            flag = true;
        }
        return flag;
    }
    public UserInfo getupdateUserInfo(UserInfo userId) {
        UserInfo userInfo = this.userMapper.getupdateUserInfo(userId);
        return userInfo;
    }



    public int getCount(UserInfoVo userInfoVo) {
        return this.userMapper.getCount(userInfoVo);
    }

    public List<UserInfo> getUserInfosPageBy(UserInfoVo userInfoVo) {
        return this.userMapper.getUserInfosPageBy(userInfoVo);
    }
}
