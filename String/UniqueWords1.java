package String; 
 // Assignment (24-03-2026)
public class UniqueWords1 {
    public static void main(String[] args) {
        String s = "Happy Happy Birthday to You";
        String[] words = s.split(" ");  // split into words
        String result = "";             // to store unique words

        for (String word : words) {
            if (!result.contains(word)) {  // check if already added
                result += word + " ";
            }
        }

        System.out.println(result.trim());
    }
}