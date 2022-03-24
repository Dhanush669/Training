/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unitsconvertor.ModelLength.CentiMeter;

public class UnitValidatorHelperMeterToCentiMeter {
    public static boolean checkMeterToCentiMeter(String centiMeter,String meter){
        
        if(!inputChecker(centiMeter) && !inputChecker(meter)){
            return false;
        }
        double lengthTwo=Double.parseDouble(centiMeter);
        double lengthOne=Double.parseDouble(meter);
        
        return validatorMeterToCm(lengthOne,lengthTwo);    
    }
    
    public static boolean checkMeterToCentiMeterBySubractingTwoMeter(String mOne,String mTwo,String cm){
        if(!inputChecker(mOne) && !inputChecker(mTwo) && !inputChecker(cm)){
            return false;
        }
        double lengthOne=Float.parseFloat(mOne);
        double lengthTwo=Float.parseFloat(mTwo);
        double result=Float.parseFloat(cm);
        
        return validatorMeterToCm(lengthOne-lengthTwo,result);
    }
    
    public static boolean checkMeterToCentiMeterByAddingTwoMeter(String mOne,String mTwo,String cm){
        if(!inputChecker(mOne) && !inputChecker(mTwo) && !inputChecker(cm)){
            return false;
        }
        double lengthOne=Float.parseFloat(mOne);
        double lengthTwo=Float.parseFloat(mTwo);
        double result=Float.parseFloat(cm);
        
        return validatorMeterToCm(lengthOne+lengthTwo,result);
    }
    
    public static boolean inputChecker(String inputOne){
        for(char c:inputOne.toCharArray()){
            if(c!='.' && !Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }
    
    public static boolean validatorMeterToCm(double meter,double centiMeter){
        return (meter*100)==centiMeter;
    }
    
}
