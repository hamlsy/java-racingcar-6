package racingcar.utils;

import java.util.Arrays;
import java.util.List;

public class Utils {

    private static final String SPLIT_SUB_STRING = ",";

    public static List<String> stringToList(String input){
        return Arrays.stream(input.split(SPLIT_SUB_STRING)).toList();
    }

    public static int stringToInt(String input){
        //todo validation
        return Integer.parseInt(input);
    }
}
