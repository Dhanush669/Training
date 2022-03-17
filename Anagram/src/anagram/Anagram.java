/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package anagram;
import java.util.Scanner;
public class Anagram {
    public static void main(String[] args) {
        String s1;
        int count=0,siz;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        s1=sc.next();
        System.out.println("enter the number of strings you want to get");
        siz=sc.nextInt();
        for(int i=0;i<siz;i++){
            String s2=sc.next();
            if (s1.length()==s2.length()){
          count+=check(s1,s2);
        }
        }
        System.out.println(count);
    }
    
    public static int check(String s1,String s2){
        for(char i:s1.toCharArray()){
        if(!(s2.contains(""+i))){
            return 0;
        }
        else{
            s2=s2.replaceFirst(""+i,"0");
        }
        }
        return 1;
    }
    
}
