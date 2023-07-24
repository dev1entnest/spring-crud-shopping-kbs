package com.k8s.springcrudshoppingkbs.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public class ApplicationException extends RuntimeException{
    private Integer errorCode;
    private String message;
    private HttpStatus httpStatus;
    public ApplicationException(String message) {
        this.message=message;
    }
}
