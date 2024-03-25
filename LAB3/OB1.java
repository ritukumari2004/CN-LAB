class ThreadA extends Thread {
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println("Thread A");
        }
    }
}

class ThreadB extends Thread {
    public void run() {
        for(int j = 0; j < 5; j++) {
            System.out.println("Thread B");
        }
    }
}

public class OB1 {
    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();
        threadA.start();
        threadB.start();
    }
}
