package com.samsung.fmcs.stompserver.controller;

import com.samsung.fmcs.stompserver.dto.TrendRequestDto;
import com.samsung.fmcs.stompserver.dto.TrendResponseDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.UUID;

@Slf4j
@RequiredArgsConstructor
@RestController
public class TrendController {
    private final SimpMessagingTemplate messageTemplate;

    @MessageMapping("/trend")
    public void response(TrendResponseDto responseDto) {
        log.info("response : {}", responseDto);
    }

    @GetMapping("/request")
    public void request() {
        messageTemplate.convertAndSend("/topic/trend", TrendRequestDto.builder()
                .requestId(UUID.randomUUID().toString())
                .trndDate(LocalDateTime.now().minusDays(1))
                .build());
    }

}




