package org.cyb.proxypattern;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class RequestInfo {
    private String type;

    private long responseTime;

    private long startTime;
}