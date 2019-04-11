package com.gz.service;

import com.gz.dao.pojo.UserInfo;
import com.gz.dao.pojo.UserRole;
import com.gz.dto.RoleInfoDto;

import java.util.List;
import java.util.Map;

public interface RoleInfoService {

    public List<RoleInfoDto> getRoleById(int userId);
    public boolean getUserRoleInfoById(UserRole userRole);
    public boolean getUserRoleInfoId(UserRole userRole);
    public boolean getUserRoleId(UserInfo userRole);
}

