public class multithread_implements {
    public static void main(String[] args) {
        ThreadDemo arg1 = new ThreadDemo();
        Thread call1 = new Thread(arg1);
        ThreadDemoSecond arg2 = new ThreadDemoSecond();
        Thread call2 = new Thread(arg2);
        call1.start();
        call2.start();
    }
}

class ThreadDemo implements Runnable {
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("ThreadDemo class running");
            i++;
        }
    }
}

class ThreadDemoSecond implements Runnable {
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("ThreadDemoSecond class running");
            i++;
        }
    }
}