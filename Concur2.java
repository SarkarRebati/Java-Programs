public class Concur2 {

    public static void main(String ar[]) {
    
    Thread inactthrd = new Thread(new ThreadInactiveDemo());
    
    inactthrd.start();
    
    Thread actthrd = new Thread(new ThreadActiveDemo());
    
    actthrd.start();
    
    }
    
    }
    
    class ThreadActiveDemo implements Runnable {
    
    public void run() {
    
    System.out.println("Thread - Active Demo");
    
    }
    
    }
    
    class ThreadInactiveDemo implements Runnable {
    
    public void run() {
    
    try {
    
    Thread.sleep(4 * 1000);
    
    } catch (InterruptedException E) {
    
    E.printStackTrace();
    
    }
    
    System.out.println("Thread - Inactive Demo");
    
    }
    
    }
    
  