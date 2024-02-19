package com.thrivefuse.dds.intgration;

import com.thrivefuse.dds.dto.EmailInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "FeignEmailNotification", url = "http://localhost:8081") // Replace with the actual service name and URL
public interface NotificationServiceClient {

    @GetMapping("/email/send")
    ResponseEntity<?>  sendSingleEmail(@RequestBody  EmailInfo emailInfo);

    }




