package org.example.Service;

public class StringCalculator {
    public int add(String numbers) {
        try {
            if (numbers.length() > 1) {
                throw new IllegalArgumentException();
            }
            else if(numbers.isEmpty()) {
                return 0;
            }
            else {
                return Integer.parseInt(numbers);
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println("Not Valid String for TestCase12!");
        }
        return 0;
    }
}
