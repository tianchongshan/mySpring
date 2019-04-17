package com.tcs.ioc.support;

import com.tcs.ioc.annotation.Component;
import com.tcs.ioc.annotation.Controller;

import java.util.ArrayList;
import java.util.List;

/**
 * BeanDefinitionGenerator根据具体的类名来完成BeanDefinition的生成
 */
public class BeanDefinitionGenerator {
    public static List<BeanDefinition> generate(String className){
        try {
            Class clazz=Class.forName(className);
            String[] ids = generateIds(clazz);
            if(ids==null)return null;
            List<BeanDefinition> list=new ArrayList<BeanDefinition>();
            for(String id:ids){
                list.add(new BeanDefinition(id,clazz));
            }
            return list;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String[] generateIds(Class clazz){
        String[] ids=null;
        if(clazz.isAnnotationPresent(Controller.class)){
            ids=new String[]{clazz.getName()};
        }else if(clazz.isAnnotationPresent(Component.class)){
            Component component= (Component) clazz.getAnnotation(Component.class);
            String value=component.value();
            if(!"".equals(value)){
                ids=new String[]{value};
            }else{
                Class<?>[] interfaces=clazz.getInterfaces();
                ids=new String[interfaces.length];
                //如果这个类实现了接口，就用接口的类型作为id
                for(int i=0;i<interfaces.length;i++){
                    ids[i]=interfaces[i].getName();
                }
                return ids;
            }
        }
        return ids;
    }
}
