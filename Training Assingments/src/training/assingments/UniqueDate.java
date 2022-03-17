/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package training.assingments;
import java.util.HashSet;
import java.util.Scanner;
public class UniqueDate {
public static void main(String[] args) {
    String str;
    Scanner sc=new Scanner(System.in);
    str=sc.nextLine();
    HashSet<String> set=new HashSet<String>();
    str+=" ";
    String msg="";
    String unique="";
    int count=0;
    for(char c:str.toCharArray()){
        if(c==' ' || c==',' || c=='.'||c=='!'){
            if(msg.length()==10 && msg.charAt(5)=='-' && msg.charAt(2)=='-'){

                if(checkYear(msg)){
                msg=msg.substring(6,10);
                  set.add(msg);
                }
            }
            msg="";
        }
        else{
            msg+=c;
        }
    }
    System.out.println(set.size());
    }

    public static boolean checkYear(String val){
        String number=val.substring(0,2);
        boolean t1=checkPattern(number);
        number=val.substring(3,5);
        boolean t2=checkPattern(number);
        number=val.substring(6,10);
        boolean t3=checkPattern(number);
        if(t1 && t2 && t3){
           return true;
       }
       return false;
    }

    public static boolean checkPattern(String number){
        try{
            int n=Integer.parseInt(number);
        }
        catch(NumberFormatException e){
            return false;
        }

        return true;
    }
}