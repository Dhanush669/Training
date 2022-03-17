/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package training.assingments;
import java.util.ArrayList;
import java.util.Scanner;
public class ChangeAlternatePosi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int siz;
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println("Enter the size of array list");
        siz=sc.nextInt();
        list=getInput(list,siz);
        printAlternate(list,siz);
    }

    public static ArrayList<Integer> getInput(ArrayList<Integer> list,int siz){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<siz;i++){
            list.add(sc.nextInt());
        }
        return list;
    }

    public static void printAlternate(ArrayList<Integer> list,int siz){
        for(int i=0;i<siz-1;i+=2){
           int t=list.get(i);
           list.set(i,list.get(i+1));
           list.set(i+1,t);
        }
            System.out.println(list);
    }
}

