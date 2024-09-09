package com.restCrudApi.demo.rest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class StudentErrorResponse {
    private int status;
    private String message;
    private  long timeStamp;
}
