package com.boss.mall.controller;

import com.boss.mall.entity.Suggestion;
import com.boss.mall.service.SuggestionService;
import com.boss.mall.util.MallUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shkstart
 * @create 2020-07-12 15:21
 */
@RestController
@RequestMapping("/suggestion")
public class SuggestionController {

    @Autowired
    private SuggestionService suggestionService;

    @PostMapping("/add")
    public String add(@RequestBody Suggestion suggestion) {
        suggestionService.insert(suggestion);
        return MallUtil.getJSONString(0,"成功添加了一条建议");
    }

}
