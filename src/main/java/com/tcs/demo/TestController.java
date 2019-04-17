package com.tcs.demo;

import com.tcs.ioc.ApplicationContext;
import com.tcs.ioc.annotation.Autowired;
import com.tcs.ioc.annotation.Controller;
import com.tcs.ioc.support.AnnotationApplicationContext;

@Controller
public class TestController {
    @Autowired("testservice")
    private TestService testService;

    public void test(){
        testService.say("hello world");
    }

    public static void main(String[] args) {
        ApplicationContext context=new AnnotationApplicationContext("applicationContext.properties");
        TestController testController=context.getBean("com.tcs.demo.TestController",TestController.class);
        testController.test();
    }
}
