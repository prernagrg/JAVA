public class MyThread extends Thread {
    public void run() {
        System.out.println("Running: " + Thread.currentThread().getName());
    }
}

class TestThread {

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.run();
        t.start();
    }
}