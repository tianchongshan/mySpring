package com.tcs.ioc;

import java.util.Map;

/**
 * 定义获取bean的方法，有根据id获取的，也有获取所有bean的
 */
public interface ApplicationContext {
    /**
     * 根据id获取bean
     * @param id
     * @return
     */
    Object getBean(String id);

    /**
     * 根据id获取特定类型的bean，完成强转
     * @param id
     * @param clazz
     * @param <T>
     * @return
     */
    <T>T getBean(String id,Class<T> clazz);

    /**
     * 获取工厂内的所有bean集合
     * @return
     */
    Map<String,Object> getBeans();
}
