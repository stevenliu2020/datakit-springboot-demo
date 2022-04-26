package com.guance.service.demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author liuyj
 * @since 2022/4/26 9:40
 */
@Data
@Component
@ConfigurationProperties(prefix="guance.host")
public class HostConfig
{
    private String ip;
    private String name;
}
