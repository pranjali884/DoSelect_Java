package doSelect;

import java.util.Scanner;

public class StringMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String num1 = input.nextLine();
        String num2 = input.nextLine();
        String result = multiplyStrings(num1, num2);
        System.out.println("Result: " + result);
    }

    private static String multiplyStrings(String num1, String num2) {
        int n = num1.length();
        int m = num2.length();
        int[] product = new int[n + m];

        for (int i = n - 1; i >= 0; i--) {
            int digit1 = num1.charAt(i) - '0';
            for (int j = m - 1; j >= 0; j--) {
                int digit2 = num2.charAt(j) - '0';
                int currProduct = digit1 * digit2;
                int sum = product[i + j + 1] + currProduct;
                product[i + j] += sum / 10;
                product[i + j + 1] = sum % 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int digit : product) {
            if (sb.length() == 0 && digit == 0) {
                continue;
            }
            sb.append(digit);
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }
}
