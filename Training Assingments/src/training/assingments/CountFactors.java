/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package training.assingments;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CountFactors {
    static Tree tree;
    static int count=0;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int siz=sc.nextInt();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<siz;i++){
            list.add(sc.nextInt());
        }
        int k=sc.nextInt();
        Collections.sort(list);
        tree=new Tree(list.get(list.size()/2),null,null);
        list.remove(list.size()/2);
        while(!list.isEmpty()){
            add_To_Tree(tree,list.get(list.size()/2));
            list.remove(list.size()/2);
        }
        try{
        System.out.println(getCount(tree,k));
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void printTree(Tree root){
        if(root==null){
            return;
        }
        printTree(root.left);
        System.out.print(root.data+" ");
        printTree(root.right);
    }
    
    public static int getCount(Tree root,int k){
        if(root==null){
            return 0;
        }
        if(search(tree,root,k/root.data)){
            root.data=0;
            count++;
        }
        getCount(root.left,k);
        getCount(root.right,k);
        
        return count;
    }
    
    public static boolean search(Tree root,Tree cur,int data){
        if(root==null){
            return false;
        }
        if(root.data==data && root!=cur && data!=0){
            return true;
        }
        else if(root.data>data){
            return search(root.left,cur,data);
        }
        else{
            return search(root.right,cur,data);
        }
        
        
    }
    
    public static Tree add_To_Tree(Tree root,int data) {
        if(root==null){
            Tree t=new Tree(data,null,null);
            root=t;
        }
        else if(data<root.data){
            root.left=add_To_Tree(root.left,data);
        }
        else{
            root.right=add_To_Tree(root.right,data);
        }
        return root;
        
    }
    
}
