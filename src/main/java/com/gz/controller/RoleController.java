package com.gz.controller;

import com.gz.dao.pojo.UserInfo;
import com.gz.dao.pojo.UserRole;
import com.gz.dto.RoleInfoDto;
import com.gz.service.RoleInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class RoleController {

    @Autowired
    RoleInfoService roleInfoService;

    /**
     * 显示已分配角色列表和未分配角色列表
     * @param userId
     * @return List
     */
    @RequestMapping(value = "RoleInfoById",method = RequestMethod.POST)
    public List<RoleInfoDto> getRoleById(@RequestParam int userId ){
        return this.roleInfoService.getRoleById(userId);
    }

    /**
     * 分配角色到已分配角色列表
     * @param userRole
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "UserRoleById",method = RequestMethod.POST)
    public Object getUserRoleInfoById(@RequestBody UserRole userRole){
        System.out.println(userRole.getCroleid().length);
        boolean byId = false;
        for(int i=0;i<userRole.getCroleid().length;i++){
            System.out.println(userRole.getUserId()+"   "+userRole.getCroleid()[i]);
            userRole.setRoleid(userRole.getCroleid()[i]);
            byId = this.roleInfoService.getUserRoleInfoById(userRole);
        }
        if (byId==true){
            return true;
        }
        return false;
    }

    /**
     * 分配角色到未分配角色列表
     * @param userRole
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "UserRoleInfoId",method = RequestMethod.POST)
    public Object getUserRoleInfoId(@RequestBody UserRole userRole){
        System.out.println(userRole.getCroleid().length);
        boolean byId = false;
        for(int i=0;i<userRole.getCroleid().length;i++){
            System.out.println(userRole.getCroleid()[i]);
            userRole.setRoleid(userRole.getCroleid()[i]);
            byId = this.roleInfoService.getUserRoleInfoId(userRole);
        }
        if (byId==true){
            return true;
        }
        return false;
    }

    @ResponseBody
    @RequestMapping(value = "UserRoleId",method = RequestMethod.POST)
    public Object getUserRoleId(@RequestBody UserInfo userRole){
        System.out.println(userRole.getCuserId().length);
        boolean byId = false;
        for(int i=0;i<userRole.getCuserId().length;i++){
            userRole.setUserId(userRole.getCuserId()[i]);
            byId = this.roleInfoService.getUserRoleId(userRole);
        }
        if (byId==true){
            return true;
        }
        return false;
    }
}
