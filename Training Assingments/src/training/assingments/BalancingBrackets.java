/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package training.assingments;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BalancingBrackets {
    static String inveted="";
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        if(!isPerfect(str)){
            set(str);
            
            if(str.length()%2!=0){
               
                StringBuilder sb=new StringBuilder(inveted);
                sb.reverse();

               System.out.println("balanced bracket "+balanceBracket(str));
              
            }
            else{
                System.out.println("Not possible");
            }
            
        }
        else{
            System.out.println(str);
        }
    }
    
    public static String balanceBracket(String str){
        
        for(int i=1;i<inveted.length()+1;i++){
           
            String t=inveted;
            
            while(t.length()>0){
                
                if(i>t.length()){
                        break;
                    }
                String te=t.substring(0,i);
                //ind=0;
                if(isPerfect(str+te)){
                    return str+te;
                }
                t=t.substring(1);
            }
        }
        return addExtra(str,str);
    }
    
    public static String addExtra(String str,String t){
        for(int i=0;i<t.length();i++){
            switch (t.charAt(i)) {
                case '(':
                    if(!t.contains(")")){
                        str=t.substring(0,i+1)+")"+t.substring(i+1);
                    }   break;
                case '{':
                    str=t.substring(0,i+1)+"}"+t.substring(i+1);
                    break;
                case '[':
                    str=t.substring(0,i+1)+"]"+t.substring(i+1);
                    break;
                default:
                    break;
            }
        }
        return str;
    }
    
    public static void set(String str){
        for(char c:str.toCharArray()){
            setInveted(c);
            switch(c){
                case '}':
                    inveted+='{';
                    break;
                case ')':
                
                inveted+='(';
                break;  

                case ']':
                    
                    inveted+='[';
                    break;
            }
        }
    }
    
    	public static boolean isPerfect(String str){
	    if(str.length()%2!=0){
	        return false;
	    }
	    List<String> list=new ArrayList<>();
	    
	    for(int i=0;i<str.length();i++){
                
	        if(i==0){    
	            list.add(""+str.charAt(i));
	        }
	        else{
	          
	        switch(str.charAt(i)){
	            case '}':
                        list=check(""+str.charAt(i),"{",list);
                        
	                break;
   	            case ')':
                    list=check(""+str.charAt(i),"(",list);  
                    
                    break;  
                    
                case ']':
                        list=check(""+str.charAt(i),"[",list);
                    
	                break;
	           default:
	                list.add(""+str.charAt(i));
	        }
	    }
	    }
	    
	    if(!list.isEmpty()){
	        return false;
	    }
	    return true;
	}
        
        public static void setInveted(char c){
        switch (c) {
            case '{':
                inveted+='}';
                break;
            case '(':
                inveted+=')';
                break;
            case '[':
                inveted+=']';
                break;
            default:
                break;
        }
        }
        
        public static List<String> check(String cur,String wanted,List<String> list){
            if(list.get(list.size()-1).equals(wanted)){
                list.remove(list.size()-1);
            }
            else{
                list.add(cur);
            }
            return list;
        }
    
}
