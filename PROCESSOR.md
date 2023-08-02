# java 基础语法

-   概念，
-   数据类型
    -   变量， 常量
    -   **byte**: a 8-bit signed integer that can store values from -128 to 127
    -   **char**: a 16-bit Unicode character that can store values from '\\u0000' to '\\uffff'
    -   **short**: a 16-bit signed integer that can store values from -32768 to 32767
    -   **int**: a 32-bit signed integer that can store values from -2147483648 to 2147483647
    -   **long**: a 64-bit signed integer that can store values from -9223372036854775808 to 9223372036854775807
        > must add `l` or `L` at the end.
    -   **float**: a 32-bit floating-point number that can store values with up to 7 decimal digits
        > must add `f` and the end.
    -   **double**: a 64-bit floating-point number that can store values with up to 16 decimal digits
    -   **boolean**: a 1-bit value that can store either true or false
    -   精度缺失，浮点运算精度缺失，选择`double`规避
    -   数据类型的转换
        -   基本数据类型
        -   引用数据类型
            -   类
            -   数组
            -   接口
        -   隐式转换
            > 小的存储空间数据类型自动转换为存储空间大的数据类型  
            > 子类对象自动转换为父类对象
        -   强制类型转换
            > 小数据类型的变量名 = （小数据类型）大数据类型的变量名
            ```java
            int a = 12;
            byte b = (byte)a;
            ```
            ```java
            Demo d = (Demo)new Object();
            ```
-   表达式与运算符
-   注释，
-   命名规范

# 流程控制

`if`, `if-else`, `if-else-if`
`while`, `for`,`break`, `continue`.  
嵌套

# 面向对象

-   概念
-   类与对象
-   对象的创建与使用
-   方法的创建与使用
-   值传递与引用传递
-   封装
-   访问修饰符
-   继承，重写与重载
-   多态

# 异常

-   设计模式
    -   策略模式
    -   单例模式
    -   工厂模式
    -   观察者模式
-   `try-catch`

# 集合框架

-   List

# 常用 API

-   Match
-   System
-   Object
-   Date
-   String

# 数据库

-   增删改查
-   JDBC
-   CS 项目
