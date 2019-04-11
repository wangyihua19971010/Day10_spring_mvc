package com.gz.service.impl;


import com.gz.dao.mapper.MenuInfoMapper;
import com.gz.dto.MenuInfoDto;
import com.gz.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by DELL on 2019/4/1.
 */
@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    MenuInfoMapper menuInfoMapper;

    public List<MenuInfoDto> getAllMenu(int roleid) {
        return menuInfoMapper.getAllMenu(roleid);
    }
}
