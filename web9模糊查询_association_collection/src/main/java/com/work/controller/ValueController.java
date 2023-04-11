package com.work.controller;
import com.work.beans.Value;
import com.work.services.ValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/value")
public class ValueController {
    @Autowired
    ValueService valueService;

    @RequestMapping("/indexView")
    public String indexView(Model model){
        List<Value> all = valueService.getAll();
        model.addAttribute("values",all);
        return "/index";
    }

    @RequestMapping("getAll.do")
    //后端接收前端的数据变成MAP集合，则需要支持的条件是:
    //1——必须使用参数注解@RequestParam
    //2——必须使用集合类型，比如Map
    //前端的name命名：name命名的值，直接就是map的key
    public String getAllDo(@RequestParam Map map, Model model){
        List<Value> bySearchAll = valueService.getBySearchAll(map);
        model.addAttribute("values",bySearchAll);
        return "/index";
    }
}
