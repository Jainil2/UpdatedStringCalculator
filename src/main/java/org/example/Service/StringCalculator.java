package org.example.Service;

public class StringCalculator {
    public int add(String numbers) {
        try {
            // Handle empty string case
            if (numbers.isEmpty()) {
                return 0;
            }

            // Split the input string by commas
            String[] numArray = numbers.split(",");

            int sum = 0;
            for (String num : numArray) {
                sum += Integer.parseInt(num.trim());
            }

            return sum;
        } catch (NumberFormatException e) {
            // Handle invalid input format
            throw new IllegalArgumentException("Invalid input: Input string contains non-numeric characters.");
        }
    }
}
