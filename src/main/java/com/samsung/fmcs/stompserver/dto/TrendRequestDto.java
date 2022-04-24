package com.samsung.fmcs.stompserver.dto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class TrendRequestDto {
    private String requestId;
    private LocalDateTime trndDate;

    @Builder
    public TrendRequestDto(String requestId, LocalDateTime trndDate) {
        this.requestId = requestId;
        this.trndDate = trndDate;
    }
}
