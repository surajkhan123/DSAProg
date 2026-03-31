package String;

public class RemoveDuplicate3 {
  // Assignment (24-03-2026)
  public static void main(String[] args) {
        String s = "Bangalore is Bangalore beautiful City is beautiful";
        String[] words = s.split(" ");  // split by words
        String result = "";             // store final string

        for (String word : words) {
            // add word only if result does not already contain it
            if (!result.contains(word)) {
                result += word + " ";
            }
        }

        System.out.println(result.trim());
    }
}

