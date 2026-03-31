public class CommonEle2 {
  public static void main(String[] args) {
    
    char[] a1 = {'a','c','d','e'};
    char[] a2 = {'b','c','d','e'};

    for(int i=0;i<a1.length;i++){
      for(int j=0;j<a2.length;j++){
        if(a1[i]==a2[j]) 
          System.out.print(a1[i]+" ");
      }
    }
  }
}
