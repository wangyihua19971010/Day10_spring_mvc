package com.gz.controller;

import com.gz.dto.MenuInfoDto;
import com.gz.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by DELL on 2019/4/1.
 */
//声明这个control是一个restful风格的control
//等同于@ResponseBody+@Controller
@RestController
public class MenuInfoController {

    @Autowired
    MenuService menuService;

    @RequestMapping("getAllMenu")
    public Object getAllMenu(@RequestParam int roleid){
        System.out.println(roleid);
        List<MenuInfoDto> allMenu = this.menuService.getAllMenu(roleid);
        System.out.println(allMenu);
        return allMenu;
    }

//    @RequestMapping("assignPermissionController")
//    public Object assignPermission(@RequestBody AssignPermessionVo vo){
//        System.out.println(vo);
//        return null;
//    }
}
