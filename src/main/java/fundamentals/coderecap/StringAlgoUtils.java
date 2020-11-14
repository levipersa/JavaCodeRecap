package fundamentals.coderecap;

public class StringAlgoUtils {
    public static boolean areCircularPermuted(String principal, String permuted) {
        if (principal.length() == permuted.length()) {
            String testString = principal + principal;
            if (testString.contains(permuted))
                return true;
        }
        return false;
    }
}
