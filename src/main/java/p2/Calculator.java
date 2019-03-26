package p2; /**
 *  Competence P2
 * 
 * @author D. A. Waldvogel
 * @version Version 1.0
 * @date 16.02.2019
 * WAL: in this file you don't have to make any changes
 */

import java.util.Date;

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
        // return Integer.parseInt(binary, 2));
        
    }

    public  String toBinary(int number) {
    	return Integer.toBinaryString(number);
	   }
       
     public int diffDate(Date d1, Date d2) {
    	 
    	 long diff = d2.getTime() - d1.getTime();

         return (int) (diff / 1000 / 60 / 60 / 24);
  
     }
     
   
     
}