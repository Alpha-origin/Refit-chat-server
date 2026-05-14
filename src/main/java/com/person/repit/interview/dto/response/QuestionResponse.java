package com.person.repit.interview.dto.response;

import com.person.repit.interview.type.QuestionType;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class QuestionResponse {
    private Long questionId;
    private QuestionType questionType;
    private String content;
}
