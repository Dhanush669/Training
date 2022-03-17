/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.trainingfilehandling;

/**
 *
 * @author Dhanush
 */
import java.util.Scanner;
import java.io.*;
public class TrainingFileHandling {

    public static void main(String[] args) {
        File file=new File("studentsData.txt");
        choice(file);
        
    }
    
    public static void choice(File file){
        int choice=getChoice();
        switch(choice){
            case 1:
                writeFile(file);
                break;
            case 2:
                readFile(file);
                break;
        }
    }
    
    public static void readFile(File file){
        String str;
        FileInputStream fin;
        DataInputStream din;
        try{
             BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        
        st = br.readLine();
        for(char c:st.toCharArray()){
            if(c==','){
                System.out.println();
            }
            else{
            System.out.print(c);
            }
        }
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
            choice(file);
        }
        catch(IOException e){
            System.out.println(e.getMessage());
            choice(file);
        }
        
    }
    
    public static void writeFile(File file){
        String name,dep,sec,msg="";
        int year;
        long phno,rollno;
        name=getInput("Name");
        dep=getInput("Department");
        sec=getInput("Section");
        year=getInput();
        phno=getPhno("Phone Number");
        rollno=getRollno("Roll Number");
        try{
        msg+=name+" "+dep+" "+sec+" "+year+" "+phno+" "+rollno+",";
        
        BufferedWriter out = new BufferedWriter(
                new FileWriter(file, true));
        out.write(msg);
        out.close();
                }
        catch(IOException e){
            System.out.println(e.getMessage());
            System.out.print("af4");
            choice(file);
        }
        
    }
    
    public static int getChoice(){
        int op1;
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Enter your choice");
            System.out.println("enter 1 to add data");
            System.out.println("enter 2 to read all data");
        try{
            op1=Integer.parseInt(sc.next());
            break;
            }
            catch(NumberFormatException e){
                 e=new NumberFormatException("you have given an invalid choice.\ngive a valid one");
                 System.out.println(e.getMessage());
            }
        
        }
        return op1;
    }
    
    public static long getRollno(String val){
        long op1;
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Enter your "+val);
        try{
            op1=Long.parseLong(sc.next());
            break;
            }
            catch(NumberFormatException e){
                 e=new NumberFormatException("you have given an invalid year.\ngive a valid year");
                 System.out.println(e.getMessage());
            }
        
        }
        return op1;
    }
    
    public static long getPhno(String val){
        long op1;
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Enter your "+val);
        try{
            op1=Long.parseLong(sc.next());
            if(String.valueOf(op1).length()<10 || String.valueOf(op1).length()>10){
                throw new InputException("you have entered an invalid phone number.\nenter a valid one"); 
            }
            break;
            }
            catch(NumberFormatException e){
                 e=new NumberFormatException("you have given an invalid year.\ngive a valid year");
                 System.out.println(e.getMessage());
            }
            catch(InputException e){
                System.out.println(e.getMessage());
            }
        
        }
        return op1;
    }
    
    public static int getInput(){
        int op1;
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Enter your year");
        try{
            op1=Integer.parseInt(sc.next());
            if(op1>5){
                throw new InputException("you have entered an invalid year.\nenter a valid one");
            }
            break;
            }
            catch(NumberFormatException e){
                 e=new NumberFormatException("you have given an invalid year.\ngive a valid year");
                 System.out.println(e.getMessage());
            }
            catch(InputException e){
                System.out.println(e.getMessage());
            }
        
        }
        return op1;
    }
    
    public static String getInput(String val){
        String data;
        
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Enter your "+val);
        try{
            data=sc.next();
            for(char c:data.toCharArray()){
                if(!Character.isAlphabetic(c)){
                    throw new InputException("you have entered an invalid "+val);
                }
            }
            break;
            }
            catch(InputException e){
                 System.out.println(e.getMessage());
            }
        
        }
        return data;
    }
    
}