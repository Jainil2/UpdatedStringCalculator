package org.example.Service;

public class StringCalculator {
    public int add(String numbers) {
        try {
            String[] numArray =  numbers.split(",");
            if (numArray.length > 2) {
                throw new IllegalArgumentException();
            }
            else if(numArray.length == 0) {
                return 0;
            }
            else if(numArray.length == 1) {
                return Integer.parseInt(numbers);
            }
            else {
                return Integer.parseInt(numArray[0]) + Integer.parseInt(numArray[1]);
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println("Not Valid String for TestCase13!");
        }
        return 0;
    }
}
