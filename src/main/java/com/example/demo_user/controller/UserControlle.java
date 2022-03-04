package com.example.demo_user.controller;

import com.example.demo_user.entities.UserNameEntity;
import com.example.demo_user.repositories.UserRepositories;
import com.example.demo_user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("backend/user")
public class UserControlle {
    @Autowired
    UserService userService;
    @GetMapping("/hello")
    ResponseEntity<String> hello() {
        return new ResponseEntity<>("Hello World!", HttpStatus.OK);
    }
//    public ResponseEntity<String> apiList() {
//        try {
//            logger.info("Start process get all category");
//            List<UserNameEntity> categories = UserNameEntity.getAll();
//            if (CollectionUtils.isEmpty(Collections.singleton(categories))) {
//                logger.warn("Not found categories");
//                return ResponseEntity.badRequest().build();
//            }
//            String dataRes = new ObjectMapper().writeValueAsString(categories);
//            logger.info("Process get all category success");
//            ResponseEntity<String> responseEntity = ResponseEntity.ok(dataRes);
//            return responseEntity;
//        } catch (Exception e) {
//            logger.error("Api list error exception", e);
//            return ResponseEntity.badRequest().build();
//        }
//    }
}
