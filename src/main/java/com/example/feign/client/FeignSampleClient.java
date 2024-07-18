package com.example.feign.client;

import com.example.feign.dto.sample.SampleDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

//name 해당 서비스 호출될
@FeignClient(name = "sample-Client", url = "/sample")
public interface FeignSampleClient {

    @PostMapping(value = "/post")
    SampleDto.Response getSample(@RequestBody SampleDto.Request request);

}
