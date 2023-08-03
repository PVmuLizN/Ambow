# Wed Aug 2 09:25:29 CST 2023

## Beans are in both JDK and JRE

[1]: https://docs.oracle.com/en/java/javase/17/docs/api/java.desktop/java/beans/Beans.html "Beans (Java SE 17 & JDK 17) - Oracle"
[2]: https://stackoverflow.com/questions/1906445/what-is-the-difference-between-jdk-and-jre "What is the difference between JDK and JRE? - Stack Overflow"
[3]: https://stackoverflow.com/questions/35689701/adding-jdk-to-netbeans-8-1 "java - Adding JDK to netbeans 8.1 - Stack Overflow"
[4]: https://marketsplash.com/tutorials/java/java-jdk-vs-jre/ "Java Development Kit (JDK) VS Java Runtime Environment (JRE) - MarketSplash"
[5]: https://easycodebook.com/2019/08/download-and-install-java-jdk-and-netbeans-ide/ "Download and Install Java JDK and NetBeans IDE"

Beans are a class in the **java.beans** package that provide some general purpose methods for JavaBeans[^1^][1]. JavaBeans are reusable software components that can be manipulated visually in a builder tool[^1^][1].

JDK stands for **Java Development Kit**. It is a software development environment that contains the JRE, the Java compiler, and other tools for developing Java applications[^2^][2].

JRE stands for **Java Runtime Environment**. It is a software package that contains the Java Virtual Machine (JVM), the Java Class Library, and other components needed to run Java programs[^2^][2].

Both JDK and JRE contain beans, but JDK also contains tools to create and manipulate beans. If you want to develop Java applications that use beans, you need JDK. If you only want to run Java applications that use beans, you need JRE.

I hope this helps. If you have any more questions, feel free to ask.😊

## 8 data types

[1]: https://www.w3schools.com/java/java_data_types.asp "Java Data Types - W3Schools"
[2]: https://www.geeksforgeeks.org/data-types-in-java/ "Java Data Types - GeeksforGeeks"
[3]: https://mathcenter.oxford.emory.edu/site/cs170/variables/ "Variables and the 8 Primitive Data Types - Emory University"
[4]: https://techvidvan.com/tutorials/data-types-in-java/ "Data Types in Java Programming with Implementation Examples"
[5]: https://www.thepoorcoder.com/hackerrank-java-datatypes-solution/ "Hackerrank Java Datatypes Solution - The Poor Coder"

According to several sources[^1^][1] [^2^][2] [^3^][3] [^4^][4] [^5^][5], the 8 data types in Java are:

-   **byte**: a 8-bit signed integer that can store values from -128 to 127
-   **char**: a 16-bit Unicode character that can store values from '\\u0000' to '\\uffff'
-   **short**: a 16-bit signed integer that can store values from -32768 to 32767
-   **int**: a 32-bit signed integer that can store values from -2147483648 to 2147483647
-   **long**: a 64-bit signed integer that can store values from -9223372036854775808 to 9223372036854775807
-   **float**: a 32-bit floating-point number that can store values with up to 7 decimal digits
-   **double**: a 64-bit floating-point number that can store values with up to 16 decimal digits
-   **boolean**: a 1-bit value that can store either true or false

These are the basic data types that can be used to store single values in Java. There are also non-primitive data types, such as String, Array, and Class, that can store more complex or multiple values. You will learn more about them in later chapters.😊

# Thu Aug 3 10:24:23 CST 2023

## reference and object

[1]: https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html "Object (Java Platform SE 8 ) - Oracle"
[2]: https://stackoverflow.com/questions/16504084/what-is-object-reference-variable "java - What is Object Reference Variable? - Stack Overflow"
[3]: https://www.infoworld.com/article/3512039/does-java-pass-by-reference-or-pass-by-value.html "Does Java pass by reference or pass by value? | InfoWorld"
[4]: https://stackoverflow.com/questions/12565037/what-exactly-is-a-reference-in-java "What exactly is a reference in Java? - Stack Overflow"
[5]: https://www.kdgregory.com/index.php?page=java.refobj "Java Reference Objects"

In Java, `Object o = new Object()` creates a new object of type `Object` on the heap, and assigns a reference to that object to the variable `o` on the stack. The reference is a value that points to the memory location where the object resides, but it is not the object itself. You can think of it as an address or a pointer, but you cannot directly manipulate it like in C++. The reference variable `o` can be used to access the fields and methods of the object it refers to[^1^][1] [^2^][2].

Some sources say that Java passes objects by reference, but this is not true. Java always passes arguments by value, meaning that a copy of the value is passed to a method. However, if the value is a reference, then passing a copy of the reference still allows the method to access and modify the original object[^3^][3] [^4^][4]. This can be confusing, but it is important to understand the difference between objects and references in Java[^5^][5].
