package com.person.repit.interview.service;

import com.person.repit.interview.dto.request.StartInterviewRequest;
import com.person.repit.interview.dto.response.QuestionResponse;

import java.util.List;

public interface InterviewService {
    QuestionResponse startInterview(StartInterviewRequest request);
    QuestionResponse getFirstQuestion(Long questionId);
}
