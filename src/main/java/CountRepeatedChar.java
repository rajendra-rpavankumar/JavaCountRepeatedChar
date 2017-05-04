import java.util.HashMap;

/**
 * Created by Pavan Kumar on 29/04/2017.
 */
public class CountRepeatedChar {
    public String countCharType(String input) {
        StringBuilder result = new StringBuilder();
        //StringBuffer result = new StringBuffer();
        int count = 1;
        int i;
        for (i = 1; i < input.length(); i++) {
            if (input.charAt(i) == (input.charAt(i - 1))) {
                count++;
            } else {
                if (count > 1) {
                    result.append( input.charAt(i - 1) + String.valueOf(count));
                }
//                else {
//                    result.append(input.charAt(i - 1));
//                }
                count = 1;
            }
        }

        if (count > 1) {
            result.append( input.charAt(i - 1) + String.valueOf(count));
        } else {
            result.append(input.charAt(i - 1) + String.valueOf(count));
        }
        return  result.toString();
    }
}
