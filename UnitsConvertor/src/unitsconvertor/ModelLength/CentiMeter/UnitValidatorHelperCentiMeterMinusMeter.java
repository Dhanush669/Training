/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unitsconvertor.ModelLength.CentiMeter;

public class UnitValidatorHelperCentiMeterMinusMeter {
    public static boolean differenceOfCentiMeterAndMeter(String meter,String centiMeter,String result){
        if(!inputChecker(meter) && !inputChecker(centiMeter) && !inputChecker(result)){
            return false;
        }
        double lengthOne=Double.parseDouble(meter);
        lengthOne=changeToCentiMeter(lengthOne);
        double lengthTwo=Double.parseDouble(centiMeter);
        
        double sum=Double.parseDouble(result);
        return validate(lengthTwo-lengthOne,sum);
    }
    
    public static double changeToCentiMeter(double lengthTwo){
        return lengthTwo*100;
    }
    
    public static boolean inputChecker(String inputOne){
        for(char c:inputOne.toCharArray()){
            if(c!='.' && !Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }
    
    public static boolean validate(double sumOfMeterAndCentiMeter,double result){
        return sumOfMeterAndCentiMeter==result;
    }
}
