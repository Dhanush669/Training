/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unitsconvertor.ModelLength.CentiMeter;

public class UnitValidatorHelperCmToKiloMeter {
    public static boolean checkCentiMeterToKiloMeter(String centiMeter,String kiloMeter){
        
        if(!inputChecker(centiMeter)&& !inputChecker(kiloMeter)){
            return false;
        }
        double lengthOne=Float.parseFloat(centiMeter);
        double lengthTwo=Float.parseFloat(kiloMeter);
        
        return validatorCmToKiloMeter(lengthOne,lengthTwo);    
    }
    
    public static boolean checkCentiMeterToKiloMeterByAddingTwoCm(String cmOne,String cmTwo,String km){
        if(!inputChecker(cmOne) && !inputChecker(cmTwo) && !inputChecker(km)){
            return false;
        }
        double lengthOne=Double.parseDouble(cmOne);
        double lengthTwo=Double.parseDouble(cmTwo);
        double result=Double.parseDouble(km);
        
        return validatorCmToKiloMeter(lengthOne+lengthTwo,result);
    }
    
    public static boolean checkCentiMeterToKiloMeterBySubractingTwoCm(String cmOne,String cmTwo,String km){
        if(!inputChecker(cmOne) && !inputChecker(cmTwo) && !inputChecker(km)){
            return false;
        }
        double lengthOne=Double.parseDouble(cmOne);
        double lengthTwo=Double.parseDouble(cmTwo);
        double result=Double.parseDouble(km);
        
        return validatorCmToKiloMeter(lengthOne-lengthTwo,result);
    }
    
    public static boolean inputChecker(String inputOne){
        for(char c:inputOne.toCharArray()){
            if(c!='.' && !Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }
    
    public static boolean validatorCmToKiloMeter(double centiMeter,double kiloMeter){
        return (centiMeter/100000)==kiloMeter;
    }
}
