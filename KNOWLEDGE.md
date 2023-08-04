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

# Fri Aug 4 09:28:22 CST 2023

## JDBCUtil close all

-   Close the connection
-   pre-compile object
-   result collection object

## Java program memory allocation: stack and heap and others

Java programs use two main memory areas for storing data: the stack and the heap.

-   **Stack memory** is used to store local variables and method parameters. It is also used to store the call stack, which is a record of the method calls that have been made during the execution of the program. Stack memory is allocated and deallocated automatically by the Java Virtual Machine (JVM).
-   **Heap memory** is used to store objects. Objects are created in the heap and can be accessed from anywhere in the program. Heap memory is not allocated and deallocated automatically by the JVM. Instead, the JVM uses a garbage collector to reclaim unused heap memory.

In addition to stack and heap memory, Java programs also use a few other memory areas:

-   **Method area** stores the Java class bytecode and constants.
-   **Native heap** stores native memory that is allocated by the operating system.
-   **PC registers** store the program counter, which is the address of the next instruction to be executed.

The stack and heap are the most important memory areas for Java programs. The stack is used to store data that is needed for the current method call, while the heap is used to store objects that are created by the program. The JVM manages the stack and heap automatically, so programmers do not need to worry about memory management.

Here is a table that summarizes the different memory areas in Java:

| Memory area  | Description                                                    | Managed by JVM |
| ------------ | -------------------------------------------------------------- | -------------- |
| Stack        | Stores local variables and method parameters                   | Yes            |
| Heap         | Stores objects                                                 | No             |
| Method area  | Stores Java class bytecode and constants                       | Yes            |
| Native heap  | Stores native memory that is allocated by the operating system | No             |
| PC registers | Stores the program counter                                     | Yes            |

I hope this helps! Let me know if you have any other questions.

## Where is String data allocated in java

String data in Java is allocated in the **heap** memory. The heap is a region of memory that is used to store objects. Objects are created in the heap and can be accessed from anywhere in the program. The heap is not allocated and deallocated automatically by the JVM. Instead, the JVM uses a garbage collector to reclaim unused heap memory.

When a string is created in Java, the following happens:

1. The JVM checks the **string constant pool** to see if the string already exists. If the string already exists, then the reference to the existing string is returned.
2. If the string does not exist in the string constant pool, then a new string object is created in the heap. The string object contains the characters of the string and a reference to the string constant pool.

The string constant pool is a special area of memory that is used to store strings that are used frequently. Strings that are stored in the string constant pool are shared by all objects that refer to them. This means that only one copy of the string data is stored in memory, even if multiple objects refer to the string.

The heap is a more dynamic memory area than the string constant pool. Objects that are created in the heap can be garbage collected if they are no longer needed. This means that the heap can be used to store strings that are not used frequently.

I hope this helps! Let me know if you have any other questions.
