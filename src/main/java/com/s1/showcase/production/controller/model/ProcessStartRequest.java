package com.s1.showcase.production.controller.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProcessStartRequest {
    private String processName;
    private Map<String,Object> processVariables;
}
