package com.samsung.fmcs.stompserver.dto;

import lombok.*;

import java.time.LocalDateTime;

@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class TrendDto {
    private LocalDateTime trndDate;
    private Integer eqpNo;
    private String paramCode;
    private String trndComprsVal;

    @Builder
    public TrendDto(LocalDateTime trndDate, Integer eqpNo, String paramCode,
                    String trndComprsVal) {
        this.trndDate = trndDate;
        this.eqpNo = eqpNo;
        this.paramCode = paramCode;
        this.trndComprsVal = trndComprsVal;
    }
}
