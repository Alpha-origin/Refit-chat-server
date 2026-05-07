package com.person.repit.websocket;

import com.person.repit.dto.MessageDto;
import com.person.repit.type.MessageType;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;
import tools.jackson.databind.ObjectMapper;


public class InterviewWebsocketHandler extends TextWebSocketHandler {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception{

        String payload = message.getPayload();

        // JSON -> DTO 로 변환
        MessageDto messageDto = objectMapper.readValue(payload, MessageDto.class);

        System.out.println("타입: " + messageDto.getType());
        System.out.println("내용: " + messageDto.getContent());

        if (messageDto.getType() == MessageType.START) {
            MessageDto response = new MessageDto();
            response.setType(MessageType.QUESTION);
            response.setContent("자기소개 해주세요.");

            // DTO -> JSON 변환
            String responseJson = objectMapper.writeValueAsString(response);

            session.sendMessage(new TextMessage(responseJson));
        }
    }

    // 연결 해제 시 실행 X
    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) {
        System.out.println("연결 종료: " + session.getId());
    }
}
