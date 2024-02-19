package com.thrivefuse.dds.util;

import java.util.HashMap;
import java.util.Map;

public class AdharEmailUtil {

    private static final Map<String, String> aadhaarEmailMap = new HashMap<>();

    static {
        // Initialize with some data
        aadhaarEmailMap.put("764623458978", "kumar7.soft@gmail.com");
        aadhaarEmailMap.put("764617364867","kumar7.soft@gmail.com");
        // ... add more if needed
    }

    public static String getEmailInfo(String aadhaarNumber) {
        return aadhaarEmailMap.get(aadhaarNumber);
    }

    public static void addAadhaarEmailInfo(String aadhaarNumber, String phoneNumber) {
        aadhaarEmailMap.put(aadhaarNumber, phoneNumber);
    }
}

