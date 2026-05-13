package com.person.repit.interview.dto.response;

import com.person.repit.common.type.MessageType;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class MessageResponse {
    private MessageType type;
    private Object data;
}
