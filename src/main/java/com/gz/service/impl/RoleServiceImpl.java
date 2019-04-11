package com.gz.service.impl;

import com.gz.dao.mapper.RoleInfoMapper;
import com.gz.dao.pojo.UserInfo;
import com.gz.dao.pojo.UserRole;
import com.gz.dto.RoleInfoDto;
import com.gz.service.RoleInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleInfoService {

    @Autowired
    RoleInfoMapper roleInfoMapper;

    public List<RoleInfoDto> getRoleById(int userId) {
        List<RoleInfoDto> roleInfoBy = this.roleInfoMapper.getRoleById(userId);
        return roleInfoBy;
    }

    public boolean getUserRoleInfoById(UserRole userRole) {
        boolean byId = this.roleInfoMapper.getUserRoleInfoById(userRole);
        if (byId=true){
            return true;
        }
        return false;
    }


    public boolean getUserRoleInfoId(UserRole userRole) {
        boolean byId = this.roleInfoMapper.getUserRoleInfoId(userRole);
        if (byId=true){
            return true;
        }
        return false;
    }

    public boolean getUserRoleId(UserInfo userRole) {
        boolean byId = this.roleInfoMapper.getUserRoleId(userRole);
        if (byId=true){
            return true;
        }
        return false;
    }
}
