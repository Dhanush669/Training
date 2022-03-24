/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unitsconvertor.ModelLength.CentiMeter;

public class UnitValidatorHelperCentiMeterPlusKiloMeter {
    public static boolean sumOfCentiMeterAndKiloMeter(String kiloMeter,String centiMeter,String result){
        if(!inputChecker(kiloMeter) && !inputChecker(centiMeter) && !inputChecker(result)){
            return false;
        }
        double lengthOne=Double.parseDouble(kiloMeter);
        lengthOne=changeToCentiMeter(lengthOne);
        double lengthTwo=Double.parseDouble(centiMeter);
        
        double sum=Double.parseDouble(result);
        return validate(lengthOne+lengthTwo,sum);
    }
    
    public static double changeToCentiMeter(double lengthTwo){
        return lengthTwo*100000;
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
