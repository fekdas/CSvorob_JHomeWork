package HomeWork16;

public class myThread extends Thread {
	
		public void run() {
			for (int i = 0; i<11;i++) {
				HomeWork16task2task3.print10();
					try	{
						Thread.sleep(505);
						} 
					catch (InterruptedException e)
						{ 
					System.out.println("sleep не отработал как надо" + e.getMessage());
						}
			 		}
			}
}
