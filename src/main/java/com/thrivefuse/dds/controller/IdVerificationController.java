package com.thrivefuse.dds.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/verify")
public class IdVerificationController {

    public ResponseEntity<?> verfyUserAdharNumber(@RequestParam String adharNumber){
        return null;

    }
}
