package com.zcom.zcomturtle.manager;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AIManagerTest {

    @Resource
    private AIManager aiManager;

    @Test
    void doChat() {
        String systemPrompt = "你叫靓仔";
        String userPrompt = "听说你很会写程序, 用Java写一个快速排序";
        String answer = aiManager.doChat(systemPrompt, userPrompt);
        System.out.println(answer);
    }
}