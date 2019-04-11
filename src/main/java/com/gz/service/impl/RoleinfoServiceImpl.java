package com.gz.service.impl;

import com.gz.dao.mapper.RoleMapper;
import com.gz.dao.pojo.RoleInfo;
import com.gz.dao.pojo.UserInfo;
import com.gz.service.RoleService;
import com.gz.vo.RoleVo;
import com.gz.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleinfoServiceImpl implements RoleService {
    @Autowired
    RoleMapper roleMapper;

    public int getRCount(RoleVo roleVo) {
        return this.roleMapper.getRCount(roleVo);
    }

    public List<RoleInfo> getPageBy(RoleVo roleVo) {
        return this.roleMapper.getPageBy(roleVo);
    }
}
