package com.zcom.zcomturtle.service;


import com.volcengine.ark.runtime.model.completion.chat.ChatMessage;
import com.zcom.zcomturtle.model.ChatRoom;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 聊天服务
 */
@Service
public interface ChatService {

    /**
     * AI 对话
     * @param roomid 聊天室id
     * @param message 用户端的输入
     * @return 返回AI的回复
     */
    String doChat(long roomid, String message);


    /**
     * 获取对话列表
     *
     * @return 聊天室列表
     */
    List<ChatRoom>getChatRoomList();
}
