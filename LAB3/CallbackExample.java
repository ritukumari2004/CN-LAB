interface ResultCallback {
 void onResult(String result);
}

class WorkerThread extends Thread {
 private ResultCallback callback;
 public WorkerThread(ResultCallback callback) {
 this.callback = callback;
 }
 public void run() {
 
 try {
 Thread.sleep(2000); 
 } catch (InterruptedException e) {
 e.printStackTrace();
 }
 
 String result = "Thread result data";
 

 callback.onResult(result);
 }
}
public class CallbackExample {
 public static void main(String[] args) {
 
 ResultCallback callback = result -> {
 
 System.out.println("Received result in the main thread: " + result);
 };
 
 WorkerThread workerThread = new WorkerThread(callback);
 workerThread.start();
 try {

 workerThread.join();
 } catch (InterruptedException e) {
 e.printStackTrace();
 }
 System.out.println("Main thread continues executing.");
 }
}
