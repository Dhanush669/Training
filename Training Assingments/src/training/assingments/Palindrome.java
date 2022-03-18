/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package training.assingments;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(getPalindrome(str));
        
    }
    
    public static String getPalindrome(String str){
        String rev=reverse(str);
        if(!rev.equals(str)){
            for(int i=1;i<rev.length()+1;i++){
                String t=rev;
                int cou=0;
                while(t.length()>0){
                    cou++;
                    //System.out.println(t+" "+i);
                    if(i>t.length()){
                        break;
                    }
                    String te=t.substring(0,i);
                    //System.out.println(te);
                    
                    if(isPalindrome(str+te)){
                        return str+te;
                    }
                    t=t.substring(cou);
                    cou=0;
                }
            }
        }
        return str;
    }
    
    public static String reverse(String str){
        StringBuilder sb=new StringBuilder(str);
        return sb.reverse().toString();
    }
    
    public static boolean isPalindrome(String str){
        if(str.equals(reverse(str))){
            return true;
        }
        return false;
    }
    
}
