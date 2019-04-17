package com.tcs.ioc;

import com.tcs.ioc.support.BeanDefinition;

import java.util.List;

/**
 * 向工厂注册bean和BeanDefinition的方法
 */
public interface BeanRegister {
    /**
     * 向工厂内注册BeanDefinition
     * @param bds
     */
    void registBeanDefinition(List<BeanDefinition> bds);

    /**
     * 向工厂内注册bean实例对象
     * @param id
     * @param instance
     */
    void registInstanceMapping(String id,Object instance);
}
