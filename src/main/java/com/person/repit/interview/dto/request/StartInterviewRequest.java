package com.person.repit.interview.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StartInterviewRequest {
    @NotNull
    private Long interviewId;
    @NotNull
    private Long personaId;
}
