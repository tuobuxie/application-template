package com.jlpay.application.template.controller;

import com.jlpay.application.template.controller.DTO.QueryRequest;
import com.jlpay.application.template.controller.DTO.QueryResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author lishaofeng
 */
@Slf4j
@RestController
public class TestController {



    @PostMapping("/test")
    public QueryResponse testPost(@RequestBody @Valid QueryRequest request, BindingResult bindingResult)  {
        QueryResponse queryResponse = new QueryResponse();

        if (bindingResult.hasErrors()) {
            FieldError fieldError = bindingResult.getFieldError();
            String validMess = fieldError.getField() + ":" + fieldError.getDefaultMessage();
            queryResponse.setRetCode("01");
            queryResponse.setRetMsg(validMess);
            return queryResponse;
        }
        return queryResponse;

    }

    @GetMapping("/test")
    public String testGet( String info)  {
        return "00";

    }
}