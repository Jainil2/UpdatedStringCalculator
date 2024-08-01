package org.example.Service;

public class StringCalculator {
    public int add(String numbers) {
        try {
            if (numbers != null && !numbers.isEmpty()) {
                throw new IllegalArgumentException();
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println("Not Valid String for TestCase11!");
        }
        return 0;
    }
}
