import java.util.HashSet;
import java.util.Set;

// CS108 HW1 -- String static methods

// CS108 HW1 -- String static methods

public class StringCode {

	/**
	 * Given a string, returns the length of the largest run.
	 * A a run is a series of adajcent chars that are the same.
	 * @param str
	 * @return max run length
	 */
    public static int maxRun(String str) {
        if (str == null || str.isEmpty()) return 0;

        int max = 1;
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                count = 1;
            }
            max = Math.max(max, count);
        }

        return max;
    }


    /**
     * Given a string, for each digit in the original string,
     * replaces the digit with that many occurrences of the character
     * following. So the string "a3tx2z" yields "attttxzzz".
     */
    public static String blowup(String str) {
        StringBuilder sub = new StringBuilder();
        int i = 0;

        while (i != str.length()) {
            char c = str.charAt(i);
            if (i == str.length() - 1 && Character.isDigit(c)) {
                break;
            }
            if (Character.isDigit(c)) {
                if (str.charAt(i + 1) == '\n') ;
                for (int j = 1; j <= c - '0'; j++) {
                    sub.append(str.charAt(i + 1));
                }
            } else {
                sub.append(c);
            }
            i++;
        }
        return sub.toString();
    }

    /**
     * Given 2 strings, consider all the substrings within them
     * of length len. Returns true if there are any such substrings
     * which appear in both strings.
     * Compute this in linear time using a HashSet. Len will be 1 or more.
     */
    public static boolean stringIntersect(String a, String b, int len) {
        for(int i=0; i<=a.length()-len;i++){
            String subA = a.substring(i, i+len);
            for(int j=0;j<=b.length()-len;j++){
                String subB = b.substring(j ,j+len);
                if(subB.equals(subA)) return true;
            }
        }
        return false;
    }


}
