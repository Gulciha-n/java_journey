package threadDemo;

public class CronometerThread implements Runnable{
	
	private Thread thread;
	private String threadName;
	
	public CronometerThread(String threadName) {
		this.threadName=threadName;
		System.out.println("Created : " + threadName);
	}
	 
	@Override
	public void run() {
		System.out.println("Running" +": "+ threadName);
		
			try {
				for(int i=0;i<10;i++) {
				System.out.println(threadName+ ":" + i);
				thread.sleep(1000);
				}
			}
				catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Finished"+threadName);
		}

	public void start() {
		
		if(thread == null) {
			thread = new Thread(CronometerThread.this,threadName);
			thread.start();
		}	
	}	
}

