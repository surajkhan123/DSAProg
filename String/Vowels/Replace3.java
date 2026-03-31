package String.Vowels;

public class Replace3 {
    public static void main(String[] args) {
        String s = "BOSS";
        String result = "";
        result = result + s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                // If current character is same as previous, replace it with $
                result = result + "$";
            } else {
                result = result + s.charAt(i);
            }
        }

        System.out.println(result);
    }
}