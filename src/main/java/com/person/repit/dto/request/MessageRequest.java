package com.person.repit.dto.request;

import com.person.repit.type.MessageType;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import jakarta.validation.constraints.NotNull;

@Getter
@Setter
public class MessageRequest {
    @NotNull
    private MessageType type;

    @NotBlank
    private String content;
}
