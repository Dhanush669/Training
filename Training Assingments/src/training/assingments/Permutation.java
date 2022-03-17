/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package training.assingments;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Permutation {
    public static void main(String[] args) {
        String str;
        Scanner sc=new Scanner(System.in);
        str=sc.next();
        Map<String,Integer> map=new HashMap<>();
        for(char c:str.toCharArray()){
            map.put(""+c,map.getOrDefault(""+c,0)+1);
        }
        int fact=Factorial(str.length());
        for(int i:map.values()){
            fact/=i;
        }

        System.out.println(fact);
    }

    public static int Factorial(int val){
        if(val==0 || val==1){
            return 1;
        }
        return val*Factorial(val-1);
    }
	
}
