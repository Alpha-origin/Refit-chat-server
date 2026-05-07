package com.person.repit.dto;

import com.person.repit.type.MessageType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MessageDto {
    private MessageType type;
    private String content;
}
