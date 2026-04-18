// import java.util.Stack;

// public class BalancedString {

//   public static void main(String[] args) {
//     String s = "{[()]}";
//     System.out.println(isBalenced(s));
//   }

//   public static boolean isBalenced(String s){
//     Stack<Character> stack = new Stack<>();
//     for(int i=0;i< s.length();i++){
//       char ch = s.charAt(i);
//       if(ch == '{' || ch=='[' || ch=='(')
//         stack.push(ch);
//       else if (ch =='}' || ch==']' || ch==')') {
        
//         char ch1 = stack.pop();
//         if (!isPair(ch1,ch)) {
//           return false;
//         }
//       }
//       return stack.isEmpty();
//     }

//   }


//   public static boolean isPair(char open, char close) {
//     return (open == '{' && close == '}') ||
//            (open == '[' && close == ']') ||
//            (open == '(' && close == ')');
//   }
// }



import java.util.Stack;

public class BalancedString {
  public static void main(String[] args) {
    String s = "{[()]}";
    System.out.println(isBalanced(s));
  }

  public static boolean isBalanced(String s) {

    // empty string should print false
    if(s.length()==0) return false;

    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      
      // Push opening brackets
      if (ch == '{' || ch == '[' || ch == '(') {
        stack.push(ch);
      } 
      // Process closing brackets
      else if (ch == '}' || ch == ']' || ch == ')') {
        if (stack.isEmpty()) return false; // Found closing but no opener
        
        char ch1 = stack.pop();
        if (!isPair(ch1, ch)) {
          return false;
        }
      } 
      else return false;
    }
    // Return true only if all openers were matched and popped
    return stack.isEmpty();
  }

  public static boolean isPair(char open, char close) {
    return (open == '{' && close == '}') ||
           (open == '[' && close == ']') ||
           (open == '(' && close == ')');
  }
}

