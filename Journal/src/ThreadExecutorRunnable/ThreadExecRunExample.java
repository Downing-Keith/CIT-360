package ThreadExecutorRunnable;

/*
 *
 * @author Keith Downing
 */
//Creates the Thread by implementing the runnable.
class MyThread implements Runnable {

    Thread thrd;

    MyThread(String name) {
        thrd = new Thread(this, name);
        thrd.start();

    }

    //Entry Point of the thread. Loop is created from a count of 0 to 9.
    public void run() {
        System.out.println(thrd.getName() + " starting.");
        try {
            for (int count = 0; count < 10; count++) {
                //This is the specified amount of time the program sleeps in milliseconds.
                Thread.sleep(400);
                System.out.println("In " + thrd.getName()
                        + ", count is " + count);
            }
        } catch (InterruptedException exc) {
            System.out.println(thrd.getName() + " interupted.");

        }
        System.out.println(thrd.getName() + " terminating");
    }
}

class UseThreads {

    public static void main(String args[]) {
        System.out.println("Main thread starting");

        //First, the MyThread Object is constructed.
        MyThread mt = new MyThread("Student #1");

        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.print("Main thread interrupted");
            }
        }
        System.out.println("Main thread ending.");
    }
}

//Java a Beginner's Guid pages 373-376.
