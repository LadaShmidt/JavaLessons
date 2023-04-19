package Cast;

import java.math.BigInteger;

public class Cast {
    public static void main(String[] args) {
        // Преобразование StringBuilder в String
        StringBuilder sb1 = new StringBuilder("Hello");
        String str1 = sb1.toString();

        // Преобразование String в StringBuilder
        String str2 = "World";
        StringBuilder sb2 = new StringBuilder(str2);

        // Преобразование int в BigInteger
        int num1 = 10;
        BigInteger big1 = new BigInteger(String.valueOf(num1));

        // Преобразование int в Integer
        int num2 = 10;
        Integer int1 = new Integer(String.valueOf(num2));
    }
}
