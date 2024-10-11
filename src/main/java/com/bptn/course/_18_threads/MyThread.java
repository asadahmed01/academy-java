package com.bptn.course._18_threads;

public class MyThread extends Thread{

    int limitToStop;

    // Create a constructor to initialize the above instance variable
    MyThread(int limitToStop){
      this.limitToStop = limitToStop;
    }
    // Override the run() method here.
    @Override
    public void run(){
      // Loop through odd numbers only
      for (int i = 1; i < limitToStop; i += 2) {
        System.out.println(i);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
          // Print stack trace if interrupted
            e.printStackTrace();
        }
        }
    }
    
    
    
    //MAIN METHOD
    public static void main(String[] args) {

        // Create a variable from the MyThread class here.
        MyThread myThread = new MyThread(20);
        // Start the thread here
        myThread.start();
    }

}
