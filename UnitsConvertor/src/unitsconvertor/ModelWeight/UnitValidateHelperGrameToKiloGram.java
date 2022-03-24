/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unitsconvertor.ModelWeight;

public class UnitValidateHelperGrameToKiloGram {
    public static boolean checkGramToKiloGram(String gram,String kiloGram){
        if(!inputChecker(gram) && !inputChecker(kiloGram)){
            return false;
        }
        double weightOne=Double.parseDouble(gram);
        double weightTwo=Double.parseDouble(kiloGram);
        
        return validator(weightOne,weightTwo);
    }
    
     public static boolean checkGramToKiloGramByAddingTwoGram(String gramOne,String gramTwo,String kiloGram){
        if(!inputChecker(gramOne) &&!inputChecker(gramTwo) && !inputChecker(kiloGram)){
            return false;
        }
        double weightOne=Double.parseDouble(gramOne);
        double weightTwo=Double.parseDouble(gramTwo);
        double result=Double.parseDouble(kiloGram);
        
        return validator(weightOne+weightTwo,result);
    }
     
    public static boolean checkGramToKiloGramBySubtractingTwoGram(String gramOne,String gramTwo,String kiloGram){
        if(!inputChecker(gramOne) &&!inputChecker(gramTwo) && !inputChecker(kiloGram)){
            return false;
        }
        double weightOne=Double.parseDouble(gramOne);
        double weightTwo=Double.parseDouble(gramTwo);
        double result=Double.parseDouble(kiloGram);
        
        return validator(weightOne-weightTwo,result);
    }
    
    public static boolean inputChecker(String inputOne){
        for(char c:inputOne.toCharArray()){
            if(c!='.' && !Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }
    
    public static boolean validator(double gram,double kiloGram){
        return gram*1000==kiloGram;
    }
    
}
