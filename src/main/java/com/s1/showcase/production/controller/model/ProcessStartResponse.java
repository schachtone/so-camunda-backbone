package com.s1.showcase.production.controller.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProcessStartResponse {
    private String processId;
    private String startTime;
    private String message;
}
