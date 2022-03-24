/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unitsconvertor.ModelLengthKiloMeter;

public class UnitValidateHelperMeterToMeter {
    public static boolean checkMeterToMeter(String inputOne,String inputTwo){
        
        if(!inputChecker(inputOne) && !inputChecker(inputTwo)){
            return false;
        }
        double lengthOne=Float.parseFloat(inputOne);
        double lengthTwo=Float.parseFloat(inputTwo);
        
        return validator(lengthOne,lengthTwo);    
    }
    
    public static boolean checkMeterToMeter(String inputOne,String inputTwo,String output){
        if(!inputChecker(inputOne) && !inputChecker(inputTwo) && !inputChecker(output)){
            return false;
        }
        double lengthOne=Float.parseFloat(inputOne);
        double lengthTwo=Float.parseFloat(inputTwo);
        double result=Float.parseFloat(output);
        
        return validator(lengthOne+lengthTwo,result);
    }
    
    public static boolean inputChecker(String inputOne){
        for(char c:inputOne.toCharArray()){
            if(c!='.' && !Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }
    
    public static boolean validator(double lengthOne,double lengthTwo){
        return lengthOne==lengthTwo;
    }
}
