/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unitsconvertor.ModelLength.CentiMeter;

public class UnitValidatorHelperCmToMeter {
    public static boolean checkCentiMeterToMeter(int centiMeter,String meter){
        
        if(centiMeter>=0 && !inputChecker(meter)){
            return false;
        }
        double lengthOne=Float.parseFloat(""+centiMeter);
        double lengthTwo=Float.parseFloat(meter);
        
        return validatorCmToMeter(lengthOne,lengthTwo);    
    }
    
    public static boolean checkCentiMeterToMeter(String meter,int centiMeter){
        
        if(centiMeter>=0 && !inputChecker(meter)){
            return false;
        }
        double lengthOne=Float.parseFloat(""+centiMeter);
        double lengthTwo=Float.parseFloat(meter);
        
        return validatorCmToMeter(lengthOne,lengthTwo);    
    }
    
    public static boolean checkCentiMeterToMeterByAddingTwoCm(String cmOne,String cmTwo,String meter){
        if(!inputChecker(cmOne) && !inputChecker(cmTwo) && !inputChecker(meter)){
            return false;
        }
        double lengthOne=Float.parseFloat(cmOne);
        double lengthTwo=Float.parseFloat(cmTwo);
        double result=Float.parseFloat(meter);
        
        return validatorCmToMeter(lengthOne+lengthTwo,result);
    }
    
    public static boolean checkCentiMeterToMeterBySubractingTwoCm(String cmOne,String cmTwo,String meter){
        if(!inputChecker(cmOne) && !inputChecker(cmTwo) && !inputChecker(meter)){
            return false;
        }
        double lengthOne=Float.parseFloat(cmOne);
        double lengthTwo=Float.parseFloat(cmTwo);
        double result=Float.parseFloat(meter);
        
        return validatorCmToMeter(lengthOne-lengthTwo,result);
    }
    
    
    public static boolean inputChecker(String inputOne){
        for(char c:inputOne.toCharArray()){
            if(c!='.' && !Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }
    
    
    public static boolean validatorCmToMeter(double centiMeter,double meter){
        return (centiMeter/100)==meter;
    }
}
