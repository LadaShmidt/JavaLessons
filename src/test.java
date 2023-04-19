import java.math.BigInteger;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] digits = {9};

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < digits.length; i++) {
            str.append(digits[i]);
        }
        String str2 = String.valueOf(str);
        BigInteger num = new BigInteger(str2);
        num = num.add(BigInteger.ONE);
        str2 = num.toString();
        int[] result = new int[str2.length()];

        for (int i = 0; i < str2.length(); i++) {
            int container = Integer.parseInt(String.valueOf(str2.charAt(i)));
            result[i] = container;
        }
        System.out.println(Arrays.toString(result));
    }
}
