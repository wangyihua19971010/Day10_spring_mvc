package com.gz.service;


import com.gz.dao.pojo.UserInfo;
import com.gz.vo.UserInfoVo;

import java.util.List;

public interface UserService {
    public boolean loginCheck(UserInfo userInfo);
    /**
     * 查询所有
     */
    public List<UserInfo> getAll(UserInfo userInfo);
    /**
     * 增加
     */
    public boolean getAdd(UserInfo userInfo);
    /**
     * 删除
     */
    public boolean getDelete(UserInfo id);

    /**
     * 修改
     */
    public boolean getAmend(UserInfo userInfo);

    public UserInfo getupdateUserInfo(UserInfo userId);


    public int getCount(UserInfoVo userInfoVo);
    public List<UserInfo> getUserInfosPageBy(UserInfoVo userInfoVo);


}
