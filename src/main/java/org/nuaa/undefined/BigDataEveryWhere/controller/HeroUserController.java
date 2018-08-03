package org.nuaa.undefined.BigDataEveryWhere.controller;

import org.nuaa.undefined.BigDataEveryWhere.entity.HeroUserEntity;
import org.nuaa.undefined.BigDataEveryWhere.entity.Response;
import org.nuaa.undefined.BigDataEveryWhere.entity.ResponseEntity;
import org.nuaa.undefined.BigDataEveryWhere.service.HeroUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author: ToMax
 * @Description:
 * @Date: Created in 2018/8/3 21:24
 */
@Controller
@CrossOrigin
@RequestMapping("/hero/user")
public class HeroUserController {
    @Autowired
    private HeroUserService heroUserService;

    @GetMapping("/getUserInfo")
    public @ResponseBody
    ResponseEntity<HeroUserEntity> getUserInfo(int id) {
        List<HeroUserEntity> heroUserEntities = heroUserService.getHeroUserInfo(id);
        return heroUserEntities != null ?
                new ResponseEntity<>(Response.GET_DATA_SUCCESS_CODE, "获取数据成功", heroUserEntities) :
                new ResponseEntity<>(400, "无此用户", 0, null);
    }
}