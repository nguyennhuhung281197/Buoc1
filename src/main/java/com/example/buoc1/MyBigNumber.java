package com.example.buoc1;

public class MyBigNumber {
    public String sum(String stn1, String stn2) {
        int length1 = stn1.length();
        int length2 = stn2.length();
        int maxLength = Math.max(length1, length2);


        int[] num1 = new int[maxLength];
        int[] num2 = new int[maxLength];

        for (int i = 0; i < length1; i++) {
            num1[i] = stn1.charAt(length1 - 1 - i) - '0';
        }

        for (int i = 0; i < length2; i++) {
            num2[i] = stn2.charAt(length2 - 1 - i) - '0';
        }


        int[] result = new int[maxLength + 1];

        for (int i = 0; i < maxLength; i++) {
            int sum = num1[i] + num2[i] + result[i];
            result[i] = sum % 10;
            result[i + 1] = sum / 10;
        }


        StringBuilder sb = new StringBuilder();
        boolean length3 = true;

        for (int i = maxLength; i >= 0; i--) {
            if (result[i] == 0 && length3) {
                continue;
            }
            length3 = false;
            sb.append(result[i]);
        }
        return sb.toString();
    }
}