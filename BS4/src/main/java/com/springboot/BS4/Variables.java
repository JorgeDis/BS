package com.springboot.BS4;

import lombok.Data;
import lombok.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public final class Variables {

    @Value("${VAR1}")
    private String var1;

    @Value("${My.VAR2}")
    private String var2;


}