/*
 * Threads and Runnable Interface in java 
 * 
 * Thread States:-
 * New, Runnable, Waiting, Running, Dead
 */

//  class A implements Runnable{
//     public void run(){
//         for(int i=1;i<=10;i++){
//             System.out.println("Hi");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
//  }

//  class B implements Runnable{   //instead of 'extends Threads' 
//     public void run(){
//         for(int i=1;i<=10;i++){
//             System.out.println("Hello");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
//  }
class Counter{
    int count;
    public synchronized void increment(){ //synchronized help that the increment method is used by one method at a time
        count++;
    }
}
public class ThreadsJava {
    public static void main(String[] args) throws InterruptedException {
        // A obj1 = new A();
        // B obj2 = new B();

        Counter c = new Counter();

        Runnable obj1 = () ->  
        {
                for(int i=1;i<=1000;i++){
                    // System.out.println("Hi");
                    // try {
                    //     Thread.sleep(10);
                    // } catch (InterruptedException e) {
                    //     e.printStackTrace();
                    // }
                    c.increment();
                }
        };

        Runnable obj2 = () ->  
        {
                for(int i=1;i<=1000;i++){
                    // System.out.println("Hello");
                    // try {
                    //     Thread.sleep(10);
                    // } catch (InterruptedException e) {
                    //     e.printStackTrace();
                    // }
                    c.increment();
                }
        };

        // obj2.setPriority(Thread.MAX_PRIORITY);
        // System.out.println(obj1.getPriority());  // Priority range : 1-10, 1=least priority , 10=max priority , 5=default priority

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        
        System.out.println(c.count);

        // obj1.start();   // in runnable we don't have start method
        // try {
        //     Thread.sleep(5);
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }
        // obj2.start();
    }
}
