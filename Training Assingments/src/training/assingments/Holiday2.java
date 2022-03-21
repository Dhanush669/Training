/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package training.assingments;

class Holidays {
    private String name;
    private int day;
    private String month;

    Holidays(String name,int day,String month){
        this.name=name;
        this.day=day;
        this.month=month;
    }
    public String getM(){
        return month;
    }
    public int getD(){
        return day;
    }
}

public class Holiday2 {
    public static void main(String[] args){
        Holidays h1=new Holidays("Dhanush",12,"March");
        Holidays h2=new Holidays("Dhanush",7,"March");
        Holidays h3=new Holidays("Dhanush",13,"March");
        Holidays h4=new Holidays("Dhanush",15,"March");
        Holidays h_array[]={h1,h2,h3,h4};
        System.out.println(avg(h_array));
    }
    
    public static double avg(Holidays h[]){
	    int tot=0;
	    for(int i=0;i<h.length;i++){
	        tot+=h[i].getD();
	    }
	    return tot/h.length;
	}
    
}
