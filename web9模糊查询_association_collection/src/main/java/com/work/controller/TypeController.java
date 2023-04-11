package com.work.controller;

import com.work.services.TypeService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController//返回json的controller
@RequestMapping("/type")
public class TypeController {
    @Autowired
    TypeService typeService;

    @RequestMapping("indexView")
    public List indexView(){
        return typeService.getAll();
    }
}
