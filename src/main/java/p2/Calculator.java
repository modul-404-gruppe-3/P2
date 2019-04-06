package p2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Calculator {
	
    public double fahrenheitToCelsius(double fahrenheit) {
		return   (fahrenheit - 32) / 1.8;	
	}
    
	
    public double celsiusToFahrenheit(double celsius) {	
		return (celsius * 1.8 + 32);
	}
	

	public boolean validateBinaryString(String binary) {
		for (char c : binary.toCharArray()) {
			if (!(c =='1' || c == '0')) {
				return false;
			}
		}
		return true;
	}

    public Integer binaryToInteger(String binary) {
    	if (!validateBinaryString(binary)) {
    		return null;
		}
        char[] numbers = binary.toCharArray();
        Integer result = 0;
        int count = 0;
        for(int i=numbers.length-1;i>=0;i--){
             if(numbers[i]=='1') {
            	 result+=(int)Math.pow(2, count);
             }
             count++;
        }
        return result;
    }

    public String toBinary(int number) {
    	return Integer.toBinaryString(number);
	   }
       
     public long diffDate(LocalDate d1, LocalDate d2) {
         return ChronoUnit.DAYS.between(d1, d2);
     }
}