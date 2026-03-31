public class CommonEle3 {
  public static void main(String[] args) {
    String[] s1 ={"Java","Python","C","Swift","JS"};
    String[] s2 = {"Python","Swift","C","JS","R"};

    for(int i=0;i<s1.length;i++){
      for(int j=0; j< s2.length;j++){
        if(s1[i].equals(s2[j]))
          System.out.print(s1[i]+" ");
      }
    }
  }
}
