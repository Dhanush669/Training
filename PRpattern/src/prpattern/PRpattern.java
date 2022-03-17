/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prpattern;
import java.util.Scanner;

public class PRpattern {
    
    public static void main(String[] args) {
        String str;
        Scanner sc=new Scanner(System.in);
        str=sc.next();
        str=str.toLowerCase();
        char current=str.charAt(0);
        
        if(checkPR(str)){
            str=str.substring(1);
            System.out.println(checkPR(current,str));
        }
        else{
            System.out.println("false");
        }
    }
    
    public static boolean checkPR(String str){
        for(char c:str.toCharArray()){
            int t=c;
            if(t!=112 && t!=114){
                return false;
            }
        }
        return true;
    }
	
	public static boolean checkPR(char current,String str){
        for(char c:str.toCharArray()){
                if(c==current){
                    return false;
                }
                current=c;
            }
            return true;
	}
}
