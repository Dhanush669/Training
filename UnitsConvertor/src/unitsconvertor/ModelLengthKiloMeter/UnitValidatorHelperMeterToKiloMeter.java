/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unitsconvertor.ModelLengthKiloMeter;


public class UnitValidatorHelperMeterToKiloMeter {
    
    public static boolean checkMeterToKiloMeter(String kiloMeter,String meter){
        
        if(!inputChecker(meter) && !inputChecker(kiloMeter)){
            return false;
        }
        double lengthOne=Double.parseDouble(meter);
        double lengthTwo=Double.parseDouble(kiloMeter);
        
        return validatorMeterToKiloMeter(lengthOne,lengthTwo);    
    }
    
    public static boolean checkMeterToKiloMeterByAddingTwoMeter(String inputOne,String inputTwo,String output){
        if(!inputChecker(inputOne) && !inputChecker(inputTwo) && !inputChecker(output)){
            return false;
        }
        double lengthOne=Double.parseDouble(inputOne);
        double lengthTwo=Double.parseDouble(inputTwo);
        double result=Double.parseDouble(output);
        
        return validatorMeterToKiloMeter(lengthOne+lengthTwo,result);
    }
    
    public static boolean checkMeterToKiloMeterBySubtractingTwoMeter(String inputOne,String inputTwo,String output){
        if(!inputChecker(inputOne) && !inputChecker(inputTwo) && !inputChecker(output)){
            return false;
        }
        double lengthOne=Double.parseDouble(inputOne);
        double lengthTwo=Double.parseDouble(inputTwo);
        double result=Double.parseDouble(output);
        
        return validatorMeterToKiloMeter(lengthOne-lengthTwo,result);
    }
    
    public static boolean inputChecker(String inputOne){
        for(char c:inputOne.toCharArray()){
            if(c!='.' && !Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }
    
    public static boolean validatorMeterToKiloMeter(double meter,double kiloMeter){
        return (meter/1000)==kiloMeter;
    }
    
}
