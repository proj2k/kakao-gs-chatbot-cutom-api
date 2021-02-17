package com.gsenc.api.payment.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class PaymentController {

    Logger logger = LoggerFactory.getLogger(PaymentController.class);

    @PostMapping("/payment/getContractBankNumber/simpleText")
    public Map<String, String> getContractBankNumber(@RequestBody Map<String, Map<String, List<Map<String, String>>>> data) {
        Map<String, List<Map<String, String>>> result = data.get("result");
        List<Map<String, String>> resultData = result.get("data");
        StringBuilder stringBuilder = new StringBuilder();
        for (Map<String, String> resultDatum : resultData) {
            if(stringBuilder.length() > 0) {
                stringBuilder.append('\n');
            }
            String paymentType = resultDatum.get("paymentType");
            String bank = resultDatum.get("bank");
            String bankNumber = resultDatum.get("bankNumber");
            stringBuilder.append("- ").append(paymentType).append(" ").append(bank).append(" ").append(bankNumber);
        }
        HashMap<String, String> simpleText = new HashMap<>();
        simpleText.put("simpleText", stringBuilder.toString());
        return simpleText;
    }

}
