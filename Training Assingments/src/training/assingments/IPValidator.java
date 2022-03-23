/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package training.assingments;
import java.util.Scanner;
public class IPValidator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String ip=sc.next();
        System.out.println(ValidateIpv4Address(ip));
    }

    public static boolean ValidateIpv4Address(String ip) {
        String[] ipv4=ip.split("\\.");
        String last=ipv4[ipv4.length-1];
        for(char c:ip.toCharArray()){
            if(!Character.isDigit(c)){
                return false;
            }
        }
        if(ipv4.length!=4 || ipv4[ipv4.length-1].equals("255") || ipv4[ipv4.length-1].charAt(last.length()-1)=='0'){
            return false;
        }
        
        return true;
    }
    
    
    
}
