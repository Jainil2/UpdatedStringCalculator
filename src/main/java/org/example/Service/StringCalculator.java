package org.example.Service;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
    private static final int MAX_NUMBER = 1000;
    public int add(String numbers) {
        try {
            if (numbers.isEmpty()) {
                return 0;
            }

            String delimiter = ",";
            if (numbers.startsWith("//")) {
                int delimiterIndex = numbers.indexOf('\n');
                if (delimiterIndex != -1) {
                    delimiter = numbers.substring(2, delimiterIndex);
                    numbers = numbers.substring(delimiterIndex + 1);
                } else {
                    throw new IllegalArgumentException("Invalid delimiter format.");
                }
            }

            // Replace new lines with the delimiter
            numbers = numbers.replace("\n", delimiter);

            // Split the input string by the delimiter
            String[] numArray = numbers.split(delimiter);

            List<Integer> negatives = new ArrayList<>();
            int sum = 0;
            for (String num : numArray) {
                if (!num.trim().isEmpty()) {
                    int value = Integer.parseInt(num.trim());
                    if (value < 0) {
                        negatives.add(value);
                    } else if(value <= MAX_NUMBER) {
                        sum += value;
                    }
                }
            }

            if (!negatives.isEmpty()) {
                throw new NegativeNumberException("Negatives not allowed: " + negatives);
            }

            return sum;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input: Input string contains non-numeric characters or improper format.");
        }
    }
}
