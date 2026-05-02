//package MultiThread;

public synchronized void withdraw(int amount){
  if(amount > bal){
    try{
      System.out.println("Less Bal");
      wait();
    } catch(InterruptedException e){

    }
  }

  bal -= amount;
  System.out.println(amount + " withdraw completed");
  System.out.println(bal+ " is available");
}

public synchronized void deposit(int amount){
  System.out.println("Going to Deposit");
  bal +=amount;
  notify();
  System.out.println("Deposit Completed");
}

public class InterThread {


  
}