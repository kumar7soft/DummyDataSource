package com.thrivefuse.dds.controller;

import com.thrivefuse.dds.service.AdharVerifcationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/verify")
public class IdVerificationController {

    @Autowired
    AdharVerifcationService adharVerifcationService;
    @GetMapping("/adhar")
    public ResponseEntity<?> verifyUserAdharNumber(@RequestParam String adharNumber){

        return adharVerifcationService.verifyAdhar(adharNumber);

    }
}
