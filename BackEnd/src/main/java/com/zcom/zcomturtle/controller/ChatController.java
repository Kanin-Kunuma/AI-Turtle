/*
 * Copyright 2013-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.zcom.zcomturtle.controller;

import com.zcom.zcomturtle.model.ChatRoom;
import com.zcom.zcomturtle.service.ChatService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * AI 对话接口
 */
@CrossOrigin(origins = "http://localhost:5174")
@RestController
@RequestMapping("/chat")
public class ChatController {

    @Resource
    private ChatService chatService;

    /**
     * 与 AI 对话
     *
     * @param roomId  聊天室 ID
     * @param message 用户输入的消息
     * @return AI 的回复
     */
    @PostMapping("/{roomId}/send")
    public String doChat(@PathVariable long roomId, @RequestParam String message) {
        return chatService.doChat(roomId, message);
    }

    /**
     * 获取所有聊天室列表
     *
     * @return 聊天室列表
     */
    @GetMapping("/rooms")
    public List<ChatRoom> getChatRoomList() {
        return chatService.getChatRoomList();
    }
}
