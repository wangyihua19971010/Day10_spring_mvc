package com.gz.controller;


import com.gz.dao.pojo.UserInfo;
import com.gz.dto.UserInfoDto;
import com.gz.service.UserService;
import com.gz.tools.Md5Utils;
import com.gz.tools.SplitePageBean;
import com.gz.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserInfoController {

    @Autowired
    UserService userService;


    /**
     * 测试
     * @return String
     */
    @ResponseBody
    @RequestMapping(value = "test",method = RequestMethod.POST)
    public String test(){
        System.out.println("inner test");
        return "hello world";
    }

    /**
     * 登录
     * @return String
     */
    @ResponseBody
    @RequestMapping(value = "loginCheck",method = RequestMethod.POST)
    public String loginCheck(@RequestBody UserInfo userInfo, HttpSession httpSession){
        Boolean flag =false;
//        userInfo.setPassword(Md5Utils.encodePassword(userInfo.getPassword()));
        System.out.println("username="+userInfo.getUsername()+",password="+userInfo.getPassword());
        flag = userService.loginCheck(userInfo);
        if(flag){
            //登录成功,保存
            httpSession.setAttribute("userInfo",userInfo);
        }
        return flag.toString();
    }

    /**
     * 查询
     * @return List
     */
    @ResponseBody
    @RequestMapping(value = "userInfoListById",method = RequestMethod.POST)
    public Object userInfoList(@RequestBody(required = false) UserInfo userInfo){
        List<UserInfo> list = this.userService.getAll(userInfo);
        System.out.println(list.toString()+"111111");
        return list;
    }

    /**
     * 增加
     * @return boolean
     */
    @ResponseBody
    @RequestMapping(value = "userInfoAdd",method = RequestMethod.POST)
    public boolean userInfoAdd(@RequestBody UserInfo userInfo){
        boolean add = userService.getAdd(userInfo);
        System.out.println(add);
        return add;
    }

    /**
     * 修改
     * @return boolean
     */
    @ResponseBody
    @RequestMapping(value = "userInfoListBy",method = RequestMethod.POST)
    public Object getupdateUserInfo(@RequestBody(required = false) UserInfo userInfo){
        UserInfo userInfo1 = this.userService.getupdateUserInfo(userInfo);
        System.out.println(userInfo1);
        return userInfo1;
    }
    @ResponseBody
    @RequestMapping(value = "updateUserInfo",method = RequestMethod.POST)
    public Object updateUserInfo(@RequestBody UserInfo userInfo){
        System.out.println(userInfo);
        if(userInfo.getUserId()==0){
            return false+"";
        }
        boolean flag = this.userService.getAmend(userInfo);
        return flag;
    }

    /**
     * 删除
     * @return boolean
     */
    @ResponseBody
    @RequestMapping(value = "deleteUserInfo",method = RequestMethod.POST)
    public Object getDelete(@RequestBody UserInfo userId){
        boolean delete = this.userService.getDelete(userId);
        return delete;
    }

    /**
     * 分页与搜索
     * @return boolean
     */
    @ResponseBody
    @RequestMapping(value = "userInfoList",method = RequestMethod.POST)
    public Object userInfoList(@RequestBody(required = false) UserInfoVo userInfoVo){
        //查询并返回UserInfoDto对象
        System.out.println(userInfoVo);
        //当前是第几页、每页多少行
        List<UserInfo> userInfoList = this.userService.getUserInfosPageBy(userInfoVo);
        //返回集合
        //返回页面
        SplitePageBean splitePageBean = new SplitePageBean();
        int count = this.userService.getCount(userInfoVo);
        splitePageBean.setCurrentPage(userInfoVo.getSplitePageBean().getCurrentPage());
        splitePageBean.setDataCount(count);
        splitePageBean.setPageCount(count%2==0?count/2:count/2+1);
        UserInfoDto dto = new UserInfoDto();
        dto.setUserInfoList(userInfoList);
        dto.setSplitePageBean(splitePageBean);
        return dto;
    }

}
