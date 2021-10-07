###Java基础入门

> 程序：计算机执行某些操作或解决某个问题而编写的一系列有序指令的集合

#### Java诞生的几个常识性知识
- Java之父 高斯林
- 1995年发布第一个正式版本
- 2009年Oracle收购Sun公司，Java从此归属Oracle
- 2011年发布Java7
- 2014年发布Java8

#### Java的特性
- 面向对象
- 健壮性：的强类型机制、异常处理、垃圾的自动收集等是 Java 程序健壮性的重要保证
- 跨平台性： 底层虚拟机（JVM）支持，不同平台有不同的JVM

#### 什么是JVM？
1) JVM 是一个虚拟的计算机，具有指令集并使用不同的存储区域。负责执行指令，管理数据、内存、寄存器，包含在 JDK 中. 
2) 对于不同的平台，有不同的虚拟机。
3) Java 虚拟机机制屏蔽了底层运行平台的差别，实现了“一次编译，到处运行”

### JDK & JRE & JVM 区别与联系
1) JDK = JRE + 开发工具集（例如 Javac,java 编译工具等) 
2) JRE = JVM + Java SE 标准类库（java 核心类库） 
3) 如果只想运行开发好的 .class 文件 只需要 JRE
### 第一个Hello world程序
```java
// 一个类文件中只能定义一个Public类，类名需要遵守规范，严格区分大小写
public class Base_01To20 {
    public static void main(String[] args) {
        System.out.println("Hello world");
    }
}
```
#### Java代码的简单执行流程介绍
1. Java文件 .Java结尾的文件 编译（javac）之后得到.class结尾的文件，此时叫字节码文件
2. 字节码文件在JVM中运行 输出结果
### 如何快速学好技术？
1. 先从自身需求出发（工作需要，跳槽需要，技术控的兴趣爱好）
2. 看看能否用我们已有方法解决现有难题
3. 引出我们要学的新技术
4. 然后学习新技术的基本原理与语法
5. crud快速入门
6. 开始深入研究细节
### Java转义字符
1. \t 制表符
2. \n 换行符
3. \\ 一个斜线
4. \r 一个回车
```java
public class Base {
    @Test
    public void test001(){
        // 制表符
        System.out.println("北京\t天津\t上海");

        // 换行符
        System.out.println("hello \nJack");

        System.out.println("\\");

        System.out.println("豆奶大大\r我不是");
    }
}
/*
北京	天津	上海
hello 
Jack
\
我不是
 * */
```
### 注释
> 解释代码的含义，增加可读性。 主要是给很久没有看这块代码的自己看 或者有合作的同事看的
1. 单行注释 //
2. 多行注释 /**/
3. 文档注释 /** */
### 变量
> 变量是程序的基本组成单位之一
> 变量相当于内存中的一个数据存储空间的表示，可以理解为门牌号，我们通过门牌号可以访问到变量的值
1. int a = 60; //声明+赋值
2. 变量表示内存中的一个存储区域，不同类型的变量占用的空间是不同的
3. 变量必须先声明再使用
4. 变量声明后，该区域的值可以在同一类型范围内不断变化
5. 变量在同一作用域下不能重名
6. 变量=变量名+值+数据类型

#### 数据类型
Java数据类型分为基本数据类型以及引用数据类型:
- 基本数据类型
  - 数值型
    - 整数类型 [byte1字节,short2字节,int4字节,long8字节]
    - 浮点数 [float4字节,double8字节]
  - 字符型 char 2个字节，用于存放单个字符
  - 布尔型 boolean 1个字节
- 引用数据类型
  - 类 class
  - 接口 interface
  - 数组 []

整型的使用细节：
1. Java个整数类型有固定的范围和字段长度，不受操作系统的影响
2. Java整形常量默认为int型，如果要声明long类型需要添加L
3. Java程序中 整型最常用的是int型，不够用的时候才用Long类型

浮点数的使用细节：
1. Java中浮点型的常量默认是double类型，要使用float类型需要在后面加F
2. 浮点数的运算有坑，避免使用浮点数进行比较运算

字符型的使用细节：
1. 单引号
2. 在Java中，char本质是一个整数，输出的时候，是Unicode对应的字符
3. char 类型是可以进行运算的，相当于一个整数




### 基本数据类型转换
> 当Java程序在进行副指挥或者运算时，精度小的类型自动转换为精度大的数据类型，这个就是自动类型转换
> byte->short->int->long->float->double 
```java
// int型自动转为double类型的
double a = 30;
int a = 30.2; //此时会报错
```
#### 自动类型转换的注意点和细节
1. 有多种类型的数据混合运算的时候，系统会将所有数据都转换成容量最大的那种数据类型，然后再进行计算
2. 当我们把精度大的数据赋值给精度小的的数据类型的时候，就会报错
3. byte,short,三种类型之间做任何计算都会先转为int类型
4. boolean 不参与转换
5. 自动提升原则： 表达式结果的类型自动提升为操作数中最大的类型
#### 强制类型转换
> 自动类型转换的逆过程，将容量大的数据类型赋值给容量小的数据类型、 强制类型转换的时候需要加上强制转换符，但是可能造成精度降低
```java
public class Base_41To60 {
    @Test
    public void test001(){
        int i = (int) 1.9;
        System.out.println(i); //1,精度丢失
    }
}
```
#### 强制类型转换的细节说明
1. 强制转换符只针对最近的操作数有效，往往胡使用小括号提升优先级
2. char类型可以操作int类型的常量值，但是不能保存int类型的变量值，需要强转

### 基本数据类型与String类型的转换
```java
public class Base{
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
```

### 运算符
1. 算数运算符[+,-,*,/,%,++,--,正负号，字符串相加]
2. 赋值运算符
3. 关系运算符[==,!=,<,>,<=,>=,instanceof]
4. 逻辑运算符[&&,||,!],[&,|,^]
5. 位运算符
6. 三元运算符
#### 算数运算符的使用细节：
1. 对于除号，整数除法和浮点数除法是有区别的。 都是整数的情况下，结果也是整数，如果有小数部分会舍弃。 
2. 自增 自减 在前在后的区别
```java
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
}
```
#### 关系运算符使用细节
1. 关系运算符的结果都是Boolean类型，要么是true，要么是false
2. 关系运算符组成的表达式我们成为关系表达式 a>b
3. 比较运算符==千万不要写成=
#### 逻辑运算符使用细节
1) a&b : & 叫逻辑与:规则:当 a 和 b 同时为 true ,则结果为 true, 否则为 false
2) a&&b : && 叫短路与:规则:当 a 和 b 同时为 true ,则结果为 true,否则为 false
3) a|b : | 叫逻辑或，规则:当 a 和 b ，有一个为 true ,则结果为 true,否则为 false
4) a||b : || 叫短路或，规则:当 a 和 b ，有一个为 true ,则结果为 true,否则为 false
5) !a : 叫取反，或者非运算。当 a 为 true, 则结果为 false, 当 a 为 false 是，结果为 true
6) a^b: 叫逻辑异或，当 a 和 b 不同时，则结果为 true, 否则为 false
总结： 短路与 和 短路或效率更高
#### 三元运算符
> 语法：      条件表达式？表达式1：表达式2
> 当前面的条件表达式结果为true，执行表达式1，否则执行表达式2
```java
@Test
public void test003(){
    int a = 99;
    int b = 100;
    int max = a>b?a:b;
    System.out.println(max);
}
```