package com.epam.pack1;
import com.epam.pack2.Second;
import static com.epam.pack2.Second.STATIC_STRING_VARIABLE;
        public class First {
            public static void main(String[] args) {
                System.out.println("Print package1");


                com.epam.pack1.Second secondPack1 = new com.epam.pack1.Second();
                /*com.epam.pack2.*/Second secondPack2 = new /*com.epam.pack2.*/Second();
                secondPack1.sayHello();
                secondPack2.sayHello();


                // Checking static method:
               // com.epam.pack1_sample6.First.sayHelloStaticMethod();
                // Checking imported static method:
              //  com.epam.pack1_sample6.First.sayHelloStaticImportedMethod();

            }

            public static void sayHelloStaticMethod(){
                System.out.println("SayHello static method");
            }
            public static void sayHelloStaticImportedMethod(){
                System.out.println(STATIC_STRING_VARIABLE);
            }
        }
/*
F:\JavaTrainingProjects\JavaExamples\s2L1\sample4>javac -cp src -d bin .\src\com\epam\pack1\First.java

F:\JavaTrainingProjects\JavaExamples\s2L1\sample4>java -cp bin First
Print package1
Say hello pack1 Second
Say hello pack2 Second

F:\JavaTrainingProjects\JavaExamples\s2L1\sample4>tree /F
Структура папок тома Transcend
Серийный номер тома: 00000004 44A0:DAE6
F:.
????src
?   ????com
?       ????epam
?           ????pack1
?           ?       Second.java
?           ?       First.java
?           ?
?           ????pack2
?           ?       Second.java
?           ?
?           ????pack3
????bin
    ????com
        ????epam
            ????pack1
            ?       First.class
            ?       Second.class
            ?
            ????pack2
                    Second.class



F:\JavaTrainingProjects\JavaExamples\s2L1\sample4>java -cp bin First
Print package1
 */