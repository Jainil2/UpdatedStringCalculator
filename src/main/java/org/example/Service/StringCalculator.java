package org.example.Service;

public class StringCalculator {
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

            int sum = 0;
            for (String num : numArray) {
                if (!num.trim().isEmpty()) {
                    sum += Integer.parseInt(num.trim());
                }
            }

            return sum;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input: Input string contains non-numeric characters or improper format.");
        }
    }
}
