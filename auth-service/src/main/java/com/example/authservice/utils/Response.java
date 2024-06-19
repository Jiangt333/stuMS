package com.example.authservice.utils;

import org.springframework.stereotype.Component;

@Component("authServiceResponse")
public class Response<T> {
    public int code = 200;
    public T data;
}
