
package threads;

class ChildThread extends Thread {
	@Override 
	public void run() {
		for (int i = 1; i <= 25; i++)
			System.out.println("Child : " + i);
	}
}

public class ChildThreadDemo {

	public static void main(String[] args) throws InterruptedException {
        System.out.println("In Main Thread!");
        ChildThread ct = new ChildThread();
        ct.start();
        
        for (int i = 1; i <= 25; i++)
			System.out.println("Main : " + i);
        
        System.out.println("End of Main");
	}

}
