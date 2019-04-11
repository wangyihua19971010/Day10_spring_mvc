package com.gz.dao.mapper;


import com.gz.dao.pojo.UserInfo;
import com.gz.vo.UserInfoVo;

import java.util.List;

public interface UserMapper {

    public UserInfo loginCheck(UserInfo userInfo);
    /**
     * 查询所有
     */
    public List<UserInfo> getAll(UserInfo userInfo);

    /**
     * 增加
     */
    public int getAdd(UserInfo userInfo);
    /**
     * 删除
     */
    public int getDelete(UserInfo id);

    /**
     * 修改
     */
    public int getAmend(UserInfo userInfo);
    public UserInfo getupdateUserInfo(UserInfo userInfo);


    /**
     * 根据条件查询分页数据
     * @param userInfoVo
     * @return 符合条件的数据
     */
    public List<UserInfo> getUserInfosPageBy(UserInfoVo userInfoVo);

    /**
     * 查询总数据条数
     * @return 总数据条数
     */
    public int getCount(UserInfoVo userInfoVo);
}
