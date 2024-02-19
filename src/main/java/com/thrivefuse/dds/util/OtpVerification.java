package com.thrivefuse.dds.util;

import java.util.HashMap;
import java.util.Map;

public class OtpVerification {

    private static final Map<String, String> aadhaarEmailMap = new HashMap<>();

    public static void addOtpAndEmailData(String emailAddress ,String otp){
        aadhaarEmailMap.put(emailAddress,otp);
    }

    public static String getOtpbyEmailAddress(String email){
       return  aadhaarEmailMap.get(email);
    }



}
