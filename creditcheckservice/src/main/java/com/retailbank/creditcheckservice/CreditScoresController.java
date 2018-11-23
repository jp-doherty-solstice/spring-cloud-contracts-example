package com.retailbank.creditcheckservice;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreditScoresController {

    @PostMapping("/credit-scores")
    public CreditResponse getCreditScore(@RequestBody CreditRequest request) {
        return new CreditResponse("HIGH");
    }

}
