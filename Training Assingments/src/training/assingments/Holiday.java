/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package training.assingments;

class Holiday1 {
private String name;
private int day;
private String month;

Holiday1(String name,int day,String month){
    this.name=name;
    this.day=day;
    this.month=month;
}
public String getM(){
    return month;
}
}
public class Holiday
{
    public static void main(String[] args) {
        Holiday1 h1=new Holiday1("Dhanush",12,"March");
        Holiday1 h2=new Holiday1("Dhanush",12,"Marc");
        System.out.println(check(h1,h2));
    }
    public static boolean check(Holiday1 h1,Holiday1 h2){
        return h1.getM().equals(h2.getM());
    }
}
