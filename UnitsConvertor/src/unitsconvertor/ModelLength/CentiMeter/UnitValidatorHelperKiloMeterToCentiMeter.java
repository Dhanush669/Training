/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unitsconvertor.ModelLength.CentiMeter;

public class UnitValidatorHelperKiloMeterToCentiMeter {
    
    public static boolean checkKiloMeterToCentiMeter(String kiloMeter,String centiMeter){
        
        if(!inputChecker(kiloMeter) && !inputChecker(centiMeter)){
            return false;
        }
        double lengthOne=Float.parseFloat(kiloMeter);
        double lengthTwo=Float.parseFloat(centiMeter);
        
        return validatorKiloMeterToCm(lengthOne,lengthTwo);    
    }
    
    public static boolean checkKiloMeterToCmMeterByAddingTwoKm(String kmOne,String kmTwo,String cm){
        if(!inputChecker(kmOne) && !inputChecker(kmTwo) && !inputChecker(cm)){
            return false;
        }
        double lengthOne=Double.parseDouble(kmOne);
        double lengthTwo=Double.parseDouble(kmTwo);
        double result=Double.parseDouble(cm);
        
        return validatorKiloMeterToCm((lengthOne+lengthTwo),result);
    }
    
    public static boolean inputChecker(String inputOne){
        for(char c:inputOne.toCharArray()){
            if(c!='.' && !Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }
    
    public static boolean validatorKiloMeterToCm(double kiloMeter,double centiMeter){
        return (kiloMeter*100000)==centiMeter;
    }
}
