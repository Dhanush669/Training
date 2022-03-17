/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.execptionhandling;

/**
 *
 * @author Dhanush
 */
import com.mycompany.InputException;
import java.util.Scanner;

public class ExecptionHandling {

    public static void main(String[] args) {
        String operator;
        int op1,op2;
        op1=getInput(1);
        operator=getInput("you have given an invalid operator.\nenter a valid one");
        op2=getInput(2);
        switch(operator){
            case "+":
                System.out.println("your result is :"+(op1+op2));
                break;
            case "-":
                System.out.println("your result is :"+(op1-op2));
                break;
            case "/":
                System.out.println("your result is :"+(op1/op2));
                break;
            case "%":
                System.out.println("your result is :"+(op1%op2));
                break;    
        }
        
    }
    public static int getInput(int val){
        int op1;
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Enter operant "+val);
        try{
            op1=Integer.parseInt(sc.next());
            break;
            }
            catch(NumberFormatException e){
                 e=new NumberFormatException("you have given an invalid input.\ngive a valid input");
                 System.out.println(e.getMessage());
            }
        
        }
        return op1;
    }
    public static String getInput(String msg){
        String operator;
        Scanner sc=new Scanner(System.in);
        String functions="+-/%";
        while(true){
            System.out.println("Enter operator");
        try{
            operator=sc.next();
            if(operator.length()>1 || Character.isAlphabetic(operator.charAt(0)) || Character.isDigit(operator.charAt(0))
                    || !(functions.contains(""+operator.charAt(0)))
                    ){
                throw new InputException(msg);
            }
            break;
            }
            catch(InputException e){
                System.out.println(e.getMessage());
            }
        
        }
        return operator;
    }
}
