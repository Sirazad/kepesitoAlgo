package hu.nive.ujratervezes.adddigits;

import java.util.Arrays;

public class AddDigits {
    //todo: implement your solution here

    public int addDigits(String input) {
        if (input == null || input.length() == 0) return -1;
        input = input.replaceAll("\\D", "");
        if (input.equals("")) return 0;
        return Arrays.stream(input.split("")).mapToInt(digit -> Integer.parseInt(digit)).reduce(0, Integer::sum);
    }
}
