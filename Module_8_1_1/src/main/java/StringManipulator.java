public class StringManipulator {
    public static String concatenate(String str1, String str2) {
        return str1 + str2;
    }
    public static int findLength(String str) {
        return str.length();
    }
    public static String convertToUpperCase(String str) {
        return str.toUpperCase();
    }
    public static String convertToLowerCase(String str) {
        return str.toLowerCase();
    }
    public static boolean containsSubstring(String str, String subStr) {
        return str.contains(subStr);
    }

}

