/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unitsconvertor.ModelLengthKiloMeter;

public class UnitValidatorHelperKiloMeterToMeter {
    public static boolean checkKiloMeterToMeter(String kiloMeter,String meter){
        
        if(!inputChecker(meter)&& !inputChecker(kiloMeter)){
            return false;
        }
        double lengthTwo=Double.parseDouble(meter);
        double lengthOne=Double.parseDouble(kiloMeter);
        
        return validatorKiloMeterToMeter(lengthOne,lengthTwo);    
    }
    
    public static boolean checkKiloMeterToMeterByAddingTwoKm(String kmOne,String kmTwo, String meter){
        
        if(!inputChecker(kmOne) && !inputChecker(kmTwo) && !inputChecker(meter)){
            return false;
        }
        double lengthOne=Double.parseDouble(kmOne);
        double lengthTwo=Double.parseDouble(kmTwo);
        double result=Double.parseDouble(meter);
        
        return validatorKiloMeterToMeter(lengthOne+lengthTwo,result);    
    }
    
    public static boolean checkKiloMeterToMeterBySubtractingTwoKm(String kmOne,String kmTwo, String meter){
        
        if(!inputChecker(kmOne) && !inputChecker(kmTwo) && !inputChecker(meter)){
            return false;
        }
        double lengthOne=Double.parseDouble(kmOne);
        double lengthTwo=Double.parseDouble(kmTwo);
        double result=Double.parseDouble(meter);
        
        return validatorKiloMeterToMeter(lengthOne-lengthTwo,result);    
    }
    
    
    
    public static boolean inputChecker(String inputOne){
        for(char c:inputOne.toCharArray()){
            if(c!='.' && !Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }
    
    public static boolean validatorKiloMeterToMeter(double kiloMeter,double meter){
        return (kiloMeter*1000)==meter;
    }
    
    
}
