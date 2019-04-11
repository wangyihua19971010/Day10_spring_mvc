package com.gz.dao.mapper;

import com.gz.dao.pojo.RoleInfo;
import com.gz.dao.pojo.UserInfo;
import com.gz.vo.RoleVo;
import com.gz.vo.UserInfoVo;

import java.util.List;

public interface RoleMapper {
    /**
     * 根据条件查询分页数据
     * @param roleVo
     * @return 符合条件的数据
     */
    public List<RoleInfo> getPageBy(RoleVo roleVo);

    /**
     * 查询总数据条数
     * @return 总数据条数
     */
    public int getRCount(RoleVo roleVo);
}
