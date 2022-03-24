/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unitsconvertor.ModelTemprature;

public class UnitValidateHelperCelsiusToFahrenheit {
    public static boolean checkCelsiusToFahrenheit(double celsius,double fahrenheit){
        return (celsius*(9/5)+32)==fahrenheit;
    }
}
