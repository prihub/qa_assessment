package com.bootcampexcercise.modul2.Week2.Day1.activity;

public class VariableAssignmentActivity {
    static int x; // This is the instance variable
    int ClassVar = 101; // This is the class variable
public static void main(String[] args){
    int i=10;
    int j=10;
    int sum = i+j;
    System.out.println("Sum of i and j is" +i +j);
    System.out.println("Sum of i and j is" +(i+j));
    System.out.println("Sum of i and j is"+ sum);

    //Casting
    // Two types of casting available in java
    /**
     * 1. Implicit casting
     * 2. Explicit casting
     */
    // Implicit casting
    int xyz=8;
    double pqr=xyz;
    System.out.println("pqr" +pqr);

    // Explicit casting
    String s="123";
    int convertedNo=Integer.parseInt(s);
    System.out.println("Converted number from string:" +convertedNo);

    /**
     * 1. Add method documentation
     * 2. Add variable purpose in documentation
     * 3. camelcase for variable,
     * 4. scope defination is important in logic of variables and methods
     * 5. TitleCase for Class Names
     * 6. Name of the class should be as per described in activity questions in chat
     */

    /**
     * We have following operators
     * 1. Arithmetic Operators(+,-,/,*,%)
     * 2. Assignment operators (<variable>*<expressions>, y=++c, y=c++)
     * 3. Logical operators(&&, ||, !=, &, |)
     */
}
    public static void method1(){
    int m1=101; // This is a local variable
    m1=102;
    System.out.println(m1);
    System.out.println("method1");
    x=1;
    System.out.println("inside main:" +x);
}

}
