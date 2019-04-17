package com.tcs.ioc.support;

import com.tcs.ioc.BeanRegister;

import java.util.List;

/**
 * BeanCreater比较简单,创建bean并且添加到容器工厂
 */
public class BeanCreater {
    private BeanRegister register;

    public BeanCreater(BeanRegister register) {
        this.register = register;
    }
    
    public void create(List<BeanDefinition> bds){
        for (BeanDefinition bd : bds){
            doCreate(bd);
        }
    }

    private void doCreate(BeanDefinition bd) {
        Object instance=bd.getInstance();
        this.register.registInstanceMapping(bd.getId(),instance);
    }

}
