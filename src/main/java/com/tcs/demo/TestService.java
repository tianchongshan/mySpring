package com.tcs.demo;

import com.tcs.ioc.annotation.Component;

@Component("testservice")
public class TestService {
    public void say(String s){
        System.out.println(s);
    }
}
