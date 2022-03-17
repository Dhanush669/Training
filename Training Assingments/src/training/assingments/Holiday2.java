/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package training.assingments;

class Holiday {
    private String name;
    private int day;
    private String month;

    Holiday(String name,int day,String month){
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
        Holiday h1=new Holiday("Dhanush",12,"March");
        Holiday h2=new Holiday("Dhanush",7,"March");
        Holiday h3=new Holiday("Dhanush",13,"March");
        Holiday h4=new Holiday("Dhanush",15,"March");
        Holiday h_array[]={h1,h2,h3,h4};
        System.out.println(avg(h_array));
    }
    
    public static double avg(Holiday h[]){
	    int tot=0;
	    for(int i=0;i<h.length;i++){
	        tot+=h[i].getD();
	    }
	    return tot/h.length;
	}
    
}
