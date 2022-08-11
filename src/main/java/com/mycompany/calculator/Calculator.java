/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calculator;

/**
 *
 * @author almadkhal3
 */
import java.util.Scanner;
public class Calculator {

    void subract(int a, int b)
    {
        System.out.println("x - y = " + (a-b));
    }
    
    void addition(int a, int b)
    {
        System.out.println("x + y = " + (a+b));
    }
   
    void division(int a, int b)
    {
        System.out.println("x / y = " + (a/b));
    }
    
    void multiply(int a, int b)
    {
        System.out.println("x * y = " + (a*b));
    }
    
    void mode(int a, int b)
    {
        System.out.println("x mode y = " + (a%b));
    }
  
    public static void main(String[] args) {
      Scanner m =new Scanner(System.in);
      
        
       System.out.println("Calculator Application");
       Calculator operations= new Calculator();
        
       
       
       System.out.println("x= ");
       int x=m.nextInt(); 
       System.out.println("operation is: ");
       String ch=m.next();
       System.out.println("y =");
       int y=m.nextInt();
        
        
        switch (ch)
         {
            case "-": operations.subract(x,y);break;
            case "+": operations.addition(x,y);break;
            case "/": operations.division(x, y);break;
            case "*": operations.multiply(x, y);break;
            case "%": operations.mode(x, y); break;        
        }
    }
}
