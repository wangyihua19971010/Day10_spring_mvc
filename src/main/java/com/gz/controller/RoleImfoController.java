package com.gz.controller;

import com.gz.dao.pojo.RoleInfo;
import com.gz.dto.RoleDto;
import com.gz.service.RoleService;
import com.gz.tools.SplitePageBean;
import com.gz.vo.RoleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class RoleImfoController {

    @Autowired
    RoleService roleService;


    /**
     * 分页与搜索
     * @return boolean
     */
    @ResponseBody
    @RequestMapping(value = "RoleInfo",method = RequestMethod.POST)
    public Object getPageBy(@RequestBody(required = false) RoleVo roleVo){
        //查询并返回UserInfoDto对象
        System.out.println(roleVo);
        //当前是第几页、每页多少行
        List<RoleInfo> userInfoList = this.roleService.getPageBy(roleVo);
        //返回集合
        //返回页面
        SplitePageBean splitePageBean = new SplitePageBean();
        int count = this.roleService.getRCount(roleVo);
        splitePageBean.setCurrentPage(roleVo.getSplitePageBean().getCurrentPage());
        splitePageBean.setDataCount(count);
        splitePageBean.setPageCount(count%2==0?count/2:count/2+1);
        RoleDto dto = new RoleDto();
        dto.setRoleInfoList(userInfoList);
        dto.setSplitePageBean(splitePageBean);
        return dto;
    }
}
