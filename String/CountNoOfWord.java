package String;

public class CountNoOfWord {

    public static void main(String[] args) {
        String s = " java   is    easy";
        int space=0; boolean inWord = false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != ' '){
                while(!inWord){
                    space++;
                    inWord = true;
                }
            } else{
                inWord =  false;
            }
        } System.out.println(space);
    }
}