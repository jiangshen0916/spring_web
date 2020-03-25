package com.jiangjun.spring_web.controller;

import com.jiangjun.spring_web.entity.UserEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiangshen
 * @Date 2020/03/25
 **/

@RestController
public class UserController {

    @GetMapping("/user")
    public UserEntity say(){

        UserEntity userEntity = new UserEntity (  );
        userEntity.setId ( 1 );
        userEntity.setName ( "姜神" );
        userEntity.setSex ( "男" );
        userEntity.setAge ( 23 );
        userEntity.setAddress ( "大冶" );

        return  userEntity;


    }

}
