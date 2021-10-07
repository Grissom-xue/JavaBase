package com.grissom.base;

import org.junit.jupiter.api.Test;

/**
 * describe
 *
 * @author Grissom
 * @since 2021/10/07
 */
public class Base_21To40 {
    @Test
    public void test001(){
//        // 制表符
//        System.out.println("北京\t天津\t上海");
//
//        // 换行符
//        System.out.println("hello \nJack");
//
//        System.out.println("\\");

        // 不同系统的表现形式是不同的
        System.out.println("韩顺平教育\r北京");

    }

    @Test
    public void test002(){
        int a = 100;
        // 基本数据类型转String类型，只要 使用 + ""即可
        System.out.println(a + "" + 100);

        // 字符串转基本数据类型，可以通过包装类的parseXXX方法进行
        try
        {
        Integer.parseInt("123");
        Double.parseDouble("123.1");
        Float.parseFloat("123.33");
        Short.parseShort("12");
        Long.parseLong("1334342343");
        Boolean.parseBoolean("true");
        Byte.parseByte("12");
        } catch (Exception e){
            e.printStackTrace();
        }

        // 获取字符串中某个指定字符
        String s = "sdasda12312321";
        char c = s.charAt(0);
        System.out.println(c);
    }
}
