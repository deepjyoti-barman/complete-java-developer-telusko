# Java

## Fundamentals of Programming

- A computer is a device that processes data and executes tasks using software programs.
- Different components of the computer: CPU, Hard disk, RAM, Keyboard, Mouse etc.
- Most important component: Processor / CPU, also known as the brain of the computer.
- **Processor** is responsible for any task we perform on this computer.
- Processor is a semi-conductor technology device:
  - It is very fast in its execution
  - Any device which is making use of transistors and capacitors is known as semi-conductor technology device
  - i.e. transistors are being used to make the semi-conductor technology device which is our computer
  - Transistors are of two types: NPN and PNP
  - A transistor can understand only two things: low-voltage (0V) or high-voltage (5V), in software engineering world low-voltage is represented as 0 and high voltage is represented as 1
- Processor is a dumb device, it can't do anything by itself - we have provide instructions to the computer so that it can perform the task for us. But, we have to instruct in the form of 0's and 1's because that the language our processor understands.
- Writing instructions in binary form in a form that the machine understands is known as **Machine Level Language (MLL)**.
- Set of instructions in one place, we call it as **Program**.
- Writing instructions in binary form is not easy and human friendly so we have developed another way of writing instructions that is in the form of mnemonics, which is known as **Assembly Level Language (ALL)**.
- Processor can't understand ALL so we have introduced a system software called **Assembler** which converts ALL, which is in mnemonics to MLL, which is in binary form.
- Because writing programs using ALL is also not so user-friendly as well, so after a lof of research we have come across writing programs using symbols and english like commands, which is known as **High Level Language (HLL)**.
- Processor can't understand HLL as well so we have introduced a system software called **Compiler** which converts HLL, which is in symbols and english like commands to MLL, which is in binary form.

## Memory Unit in A Computer

- CPU can process our instructions and gives us the desired output/result.
- Hard Disk Drive/Device (HDD) is where you can keep your data/instructions which you want to send to your processor to execute and get the desired output.
- To send data from HDD to processor we introduced Bus.
- **Bus** is a set of wires which carries information from one unit to another unit within the system.
- This **HDD** by its very nature, it is very slow compared to processor. Because hard disk drives uses Electro-Mechanical technology (magnetic technology).
- Disadvantages of HDD:
  - Bulky
  - Slow
  - Noisy
- Advantages of HDD:
  - Non-volatile
  - Less costly
- Because we had a speed mismatch between two of the very important components of the computer i.e. HDD and Processor, we introduced another component named as Random Access Memory (RAM).
- **RAM** is built using Semiconductor technology to match the speed of the processor.
- Advantages of RAM:
  - Fast
  - Compact
  - Less noisy
- Disadvantages of RAM:
  - It is a **volatile memory**. Volatile means such a device which requires continuous power supply for the device to work, even if for a fraction of a second if the power supply goes down then all the data will be erased.
  - It is an expensive device.
- The process of storing data from RAM to HDD permanently is known as **Saving**.
- The process of getting the data from HDD to RAM, so that it can further be processed is known as **Loading**.
- **HDD** <--- bus ---> **RAM** <--- bus ---> **PROCESSOR**
- Storage area of the HDD, where we store the data we call it: **File**, storage area of the RAM we call it: **Byte** and the small space where we are executing the instructions on the processor we call it: **Register**.
- RAM is known as main memory, whereas HDD is known as secondary memory.
- The more is the capacity of RAM, the more fast your computer is.
- **Cache Memory**:
  - **CACHE** <--- bus ---> **PROCESSOR**
  - Very small is size: between 2 KB to 20 MB
  - Whenever we have a frequently requested data, in that case OS will allocate that and process it from the cache memory.
  - i.e. if you are opening any file or an image again and again, our processor will be taking the instructions from the cache memory instead of the main memory for processing it.

## Platform and Platform Dependency

- Platform combination of both:
  - Hardware devices of our system
  - Software devices of our system
- Hardware refers to processor and software refers to OS.
- i.e. Intel + Windows is one platform, M2 + MacOS is another platform.
- What is platform dependency:
  - Platform 1:
    - Installed OS: Windows
    - Developed an application using C and when compiled it generates an executable file which is having MLL code with .exe extension
    - Then we upload the executable file (.exe) on the internet
  - Platform 2:
    - Installed OS: Linux
    - Download the executable file which was developed on Windows OS and try to execute it on this platform
    - Execution will fail
  - Platform 3:
    - Installed OS: MacOS
    - Download the executable file which was developed on Windows OS and try to execute it on this platform
    - Execution will fail
  - Platform 4:
    - Installed OS: Windows
    - Download the executable file which was developed on Windows OS and try to execute it on this platform
    - Execution will pass
  - This is known as platform dependency
- If the application development platform has to be same as the application execution platform then we call this a **platform dependent application**
- The primary reason behind this platform dependency is the MLL code generated after compilation of the C program itself is platform dependent.
- Hence, C is a platform dependent language.

## How Java Made Platform Independent Programming Language

- How Java works:
  - Platform 1:
    - Installed OS: Windows
    - Developed an application using Java
    - When compiled the Java application using Java Compiler (javac) it generates **Intermediate Level Language** file known as **Byte code**. Byte code is very very secured and cannot be understood by humans as well
    - We have a component called **Java Virtual Machine (JVM)** which converts the Byte code into Binary (MLL) code
      - JVM is a part of JRE (Java Runtime Environment), which in turn is a part of JDK (Java Development Kit)
      - JVM is a **platform dependent system software** i.e. we have different JVM versions available for different OS - Windows, Linux, MacOS etc)
      - JVM internally makes use of interpreter and converts Byte code into MLL code
      - Then we upload the Byte code on the internet
  - Platform 2:
    - Installed OS: Linux
    - Download the Byte code which was developed on Windows OS and try to execute it on this platform
    - Byte code is platform independent
    - But we need to download the JVM (platform dependent) which is available for Linux OS to convert this file into MLL code
    - Now this time the processor will successfully be able to execute the MLL code without any issue
  - Platform 3:
    - Installed OS: MacOS
    - Download the Byte code which was developed on Windows OS and try to execute it on this platform
    - Byte code is platform independent
    - But we need to download the JVM (platform dependent) which is available for Mac OS to convert this file into MLL code
    - Now this time also the processor will successfully be able to execute the MLL code without any issue
  - This is how Java is made **Platform Independent Language**
- Because we have written the code using Java language in one platform and was able to execute it in multiple different platforms so we call it, **"Write Once, Run Anywhere (WORA)"**
- Java is also called as a **portable** language
- Java is also called as a **architecture-neutral** language

## JDK Setup

- JRE which includes JVM comes preinstalled in most systems. But for development we need JDK which we can download from different vendors.
- Oracle JDK is for commercial use with support
- OpenJDK is for personal use without any additional support
- Recommended IDEs: Eclipse, IntelliJ, VSCode etc.
- Recommended version of Java to install: Java 8, Java 11, Java 17, Java 21 etc. (which has long term support)

## VSCode Setup

- Download link: [https://code.visualstudio.com/download](https://code.visualstudio.com/download)
- Recommended extension:
  - Extension Pack for Java
  - Code Runner

## IntelliJ Setup

- Download link: [https://www.jetbrains.com/idea/download/](https://www.jetbrains.com/idea/download/)

## Eclipse Setup

- Download Link: [https://www.eclipse.org/downloads/packages/](https://www.eclipse.org/downloads/packages/)

## What is Java?

- Java is a programming language which we use to build applications.
- Java is one of the most structured programming languages.
- As per Oracle Java runs on 3.5 billion devices.
- Java Started in 1995 by developed by Sun Micro Systems.
- Java usages: Android apps, BE development of web applications etc.
- Java is a programming language, it is also technology (JVM and some other tools comes as a part of that technology).
- Why JVM is so popular:
  - It makes Java platform independent
  - It makes Java portable
  - We can also run other languages on JVM: Kotlin, Scala and Groovy
- Kotlin is derived from Java, so it's easy jump to Kotlin if we already have knowledge of Java.

## First Code in Java and How Java Works

- **jshell** gives us an interactive playground to learn and experiment with Java programming code in a hassle-free environment.
- Our system's OS works on top of Hardware and JVM works on top of OS.
- JVM is platform dependent, i.e. JVM doesn't have support iOS.
- **Java Code** ---> **Java Compiler** ---> **Byte Code** ---> **JVM** ---> **MLL code**
- Out of all the files in our project, we need to provide JVM the first file from which it should start execution. The first should file have a method called 'main' and with a unique signature `public static void main(String[] args)`.
- Java is an Object Oriented Programming language, which means everything should be an object and to create an object we need to have a class.
- Extension for Java code: .java
- Extension fot the Byte code: .class
- JRE = JVM + Libraries
- JDK = JRE + Other tools
- First Java code:

  ```java
  // Program to print 'Hello World'

  public class FirstCode {
      public static void main(String[] args) {
          System.out.println("Hello World");
      }
  }
  ```

## Variables

- Database is used for permanent storage, but during processing we need to store the data in a temporary place called as variable.
- Java is a strongly typed language, which means every variable, which is going to store some data in Java must have a name and a type associated with it.

## Data Types

- Two category of data types: Primitive and Non-primitive
- Primitive data types are the most simple / basic data types.
- Primitive is also of 4 types:
  - Integer
    - byte -> 1 byte (size) -> -128 to +127 / 2^7 to 2^7 - 1 (range)
    - short - 2 bytes -> 2^15 to 2^15 - 1 (range)
    - int - 4 bytes
    - long - 8 bytes
  - Float
    - float - 4 bytes (size)
    - double - 8 bytes
  - Character
    - char - 2 byte (size) -> Because it stores all types of characters in the word, UNICODE charset
  - Boolean
    - boolean - 1 bit (size)

## Type Conversion

- Storing the value of a lower range data type into a variable of higher range data type is known as widening / implicit conversion.
- Storing the value of a higher range data type into a variable of lower range data type is known as narrowing / explicit conversion / lossy conversion / casting.
- Compiler auto-promotes the type if any operation between two lower range data types evaluates a value which is higher than their individual ranges.
- char to boolean, int to char etc. conversions are not allowed.

## Assignment Operators

- Pre-increment operator: increments the value first and then the value is fetched.
- Post-increment operator: value is fetched first and then the value is incremented.

## Logical Operators

- x > y && a < b: If the first condition evaluates to false it will not check the second condition, and the output will be false.
- x > y || a < b: If the first condition evaluates to true it will not check the second condition, and the output will be true.
- This is when it is known as short circuit.

## Switch Statement

- Whenever the switch statement matches a case it will execute that block and it will also go through all other cases following that block.
- Hence every case block should end with a break statement.

## Loops

- Used to execute a set of instructions multiple times.
- Loops are of 3 Types:
  - while loop: Loop based on a condition, the loop continues to execute until the condition evaluates to false.
  - do-while loop:
    - Similar to while loop, but in this case it executes the body of the loop first and then check for the condition.
    - do-while loop is useful when we want to execute the body of the loop at least once even if the condition is false.
  - for loop:
    - Loop finite no of times, the loop continues to execute may be 5 times, 10 times or even 500 times.
    - In a for loop we can place 3 different statements in one line: initialization, condition and increment/decrement.
    - In the for loop: initialization and condition check will be performed first, then it will execute all the statements which is there in the body of the loop and finally will execute the increment/decrement operation
    - Condition check is the mandatory part of the for loop, while initialization and increment/decrement operations are optional e.g. `for (; i < 5; ) { }`. This can make the for loop look like a while loop.
- If you know how many iterations you want to perform you can use for-loop. If you want to read all the characters of a file, until the EOF is reached using while loop makes sense.