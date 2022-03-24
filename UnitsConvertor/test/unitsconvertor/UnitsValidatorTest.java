/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package unitsconvertor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import unitsconvertor.ModelTemprature.UnitValidateHelperCelsiusToFahrenheit;
import unitsconvertor.ModelLength.CentiMeter.UnitValidateHelperCmToCm;
import unitsconvertor.ModelWeight.UnitValidateHelperGrameToKiloGram;
import unitsconvertor.ModelTemprature.UnitValidateHelperKelvinToCelsius;
import unitsconvertor.ModelWeight.UnitValidateHelperKiloGrameToGram;
import unitsconvertor.ModelLength.CentiMeter.UnitValidatorHelperCmToKiloMeter;
import unitsconvertor.ModelLength.CentiMeter.UnitValidatorHelperMeterPlusCentiMeter;
import unitsconvertor.ModelLength.CentiMeter.UnitValidatorHelperMeterToCentiMeter;

public class UnitsValidatorTest {
    
    public UnitsValidatorTest() {
    }
    
    
    @Test
    public void tesOneCmEqualToOneCm() {
        UnitValidateHelperCmToCm cmToCm=new UnitValidateHelperCmToCm();
        assertTrue(cmToCm.checkCentiMeterToCentiMeter("1", "1"));
    }
    
    @Test
    public void tesOneMeterEqualToHundredCm() {
        assertTrue(UnitValidatorHelperMeterToCentiMeter.checkMeterToCentiMeter("1","100"));
    }
    
    @Test
    public void testHundredCmequalToZeroPointZeroOneKm() {
        assertTrue(UnitValidatorHelperCmToKiloMeter.checkCentiMeterToKiloMeter("100","0.001"));
    }
    
    @Test
    public void testZeroPointOneKgEqualToHundredGram() {
        assertTrue(UnitValidateHelperKiloGrameToGram.checkKiloGramToGram("0.1","100"));
    }
    
    @Test
    public void testThousandTenGramEqualToSumOfTenGramAndOneKg() {
        assertTrue(UnitValidateHelperGrameToKiloGram.checkGramToKiloGramByAddingTwoGram("1000", "1000", "2"));
    }
    
    @Test
    public void testOneMeterPlusHundredCentiMeterEqualToTwoMeter() {
        assertTrue(UnitValidatorHelperMeterPlusCentiMeter.sumOfMeterAndCentiMeter("1", "100", "2"));
    }
    
    @Test
    public void testTwoHundredCentiMeterPlusOneKiloMeter() {
        assertTrue(UnitValidateHelperCelsiusToFahrenheit.checkCelsiusToFahrenheit((double)0, (double)32));
    }
    
    @Test
    public void testZeroCelsiusEqualToThirtyTwoFahrenheit() {
        assertTrue(UnitValidateHelperCelsiusToFahrenheit.checkCelsiusToFahrenheit((double)0, (double)32));
    }
    
    @Test
    public void testZeroKelvinEqualToNegativeTwoSeventyThreeCelsius() {
        assertTrue(UnitValidateHelperKelvinToCelsius.checkKelvinToCelsius((double)0, (double)-273));
    }
    
    
}
