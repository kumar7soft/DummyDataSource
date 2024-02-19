package com.thrivefuse.dds.util;

import org.springframework.stereotype.Component;

import java.security.SecureRandom;

@Component
public class OtpGenerationService {

    public  String generateOTP() {
        SecureRandom random = new SecureRandom();
        int otpValue = 100000 + random.nextInt(900000); // Generates a 6-digit random number
        return String.valueOf(otpValue);
    }
}
