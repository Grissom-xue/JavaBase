package com.grissom.base;

import org.junit.jupiter.api.Test;

/**
 * describe
 *
 * @author Grissom
 * @since 2021/10/07
 */
public class Base_61To80 {
    @Test
    public void test001(){
        int i = 1;
        int j = ++i;
        System.out.println(j);//2
    }

    @Test
    public void test002(){
        int i = 1;
        // i 先进行赋值操作之后 再进行自增
        int j = i++;
        System.out.println(j);//1
    }


    @Test
    public void test003(){
        int a = 99;
        int b = 100;
        int max = a>b?a:b;
        System.out.println(max);
    }
}
