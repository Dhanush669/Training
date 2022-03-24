/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unitsconvertor.ModelLength.ModelWeight;

public class UnitValidateHelperKiloGrameToGram {
    public static boolean checkKiloGramToGram(String kiloGram,String gram){
        if(!inputChecker(gram) && !inputChecker(kiloGram)){
            return false;
        }
        double weightOne=Double.parseDouble(kiloGram);
        double weightTwo=Double.parseDouble(gram);
        
        return validator(weightOne,weightTwo);
    }
    
    public static boolean checkKiloGramToGramByAddingTwoGram(String kgOne,String kgTwo,String gram){
        if(!inputChecker(kgOne) &&!inputChecker(kgTwo) && !inputChecker(gram)){
            return false;
        }
        double weightOne=Double.parseDouble(kgOne);
        double weightTwo=Double.parseDouble(kgTwo);
        double result=Double.parseDouble(gram);
        
        return validator(weightOne+weightTwo,result);
    }
    
    public static boolean checkKiloGramToGramBySubtactingingTwoGram(String kgOne,String kgTwo,String gram){
        if(!inputChecker(kgOne) &&!inputChecker(kgTwo) && !inputChecker(gram)){
            return false;
        }
        double weightOne=Double.parseDouble(kgOne);
        double weightTwo=Double.parseDouble(kgTwo);
        double result=Double.parseDouble(gram);
        
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
    
    public static boolean validator(double kiloGram,double gram){
        return kiloGram/1000==gram;
    }
}
