package com.person.repit.entity;

import com.person.repit.type.Status;
import jakarta.persistence.Entity;
import lombok.Getter;


public class Interview {

    private Long interviewId;
    private Long userId;
    private Long personaId;
    private Long sessionId;
    private Status status;
    private Long createdAt
}
