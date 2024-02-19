package com.thrivefuse.dds.service;

import com.thrivefuse.dds.dto.EmailInfo;
import com.thrivefuse.dds.intgration.NotificationServiceClient;
import com.thrivefuse.dds.util.AdharEmailUtil;
import com.thrivefuse.dds.util.OtpGenerationService;
import com.thrivefuse.dds.util.OtpVerification;
import feign.codec.DecodeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;

public class AdharVerifcationService {

    @Autowired
    OtpGenerationService otpGenerationService;

    @Autowired
    NotificationServiceClient notificationServiceClient;





    public ResponseEntity<?> verifyAdhar(String adharNumber){

        String emailAddress = AdharEmailUtil.getEmailInfo(adharNumber);
        try{
        if(emailAddress != null) {
            EmailInfo emailInfo = new EmailInfo();
            emailInfo.setToMailAddress(Arrays.asList(adharNumber));
            String otp = otpGenerationService.generateOTP();
            String textMessage = "Please find your adhar verification opp " + otp + ". Please do not share with anyone.";
            String subject = "adhar verification otp";
            OtpVerification.addOtpAndEmailData(emailAddress,otp);
            notificationServiceClient.sendSingleEmail(emailInfo);
            return ResponseEntity.ok("Otp has been sent to mentioned email Id");
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Adhar number is invalid");
        }
        }catch (DecodeException ex){
            return ResponseEntity.ok("Otp has been sent to mentioned email Id");
        }
        catch (Exception ex){
            ex.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Internal Exception occurred . Please try some time later");
        }
        }


    }

