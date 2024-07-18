package com.example.feign.service;

import com.example.feign.client.FeignSampleClient;
import com.example.feign.dto.sample.SampleDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SampleService {
    private final FeignSampleClient feignSampleClient;


    public void postSample() {
        var res = feignSampleClient.getSample(SampleDto.Request.of("id", "contents"));

    }

}
