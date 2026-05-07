package com.person.repit.websocket;

import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.io.IOException;

public class InterviewWebsocketHandler extends TextWebSocketHandler {

    // 연결 시 실행
    @Override
    public void afterConnectionEstablished(WebSocketSession session) {
        System.out.println("연결됨: " + session.getId());
    }

    // 메시지 받을 시 실행
    public void handlerTextMessage(WebSocketSession session, TextMessage message) {
        String payload = message.getPayload();
        System.out.println("받은 메세지: " + payload);

        try {
            session.sendMessage(new TextMessage("hello back"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 연결 해제 시 실행 X
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) {
        System.out.println("연결 종료: " + session.getId());
    }
}
