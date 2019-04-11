package com.gz.service;

import com.gz.dao.pojo.RoleInfo;
import com.gz.vo.RoleVo;

import java.util.List;


public interface RoleService {
    public int getRCount(RoleVo roleVo);
    public List<RoleInfo> getPageBy(RoleVo roleVo);

}
