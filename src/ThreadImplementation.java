// extends Thread
// implements Runnable

class Counter1 extends Thread
{
   public void run()
   { 
	   System.out.println("Counter1 Class Running\n");
	   for(int i=1; i<=1000; i++)
	   {
		   System.out.println(i);
	   }
	   System.out.println("Counter1 finished\n");
   }
}

class Counter2 implements Runnable
{
	@Override
	public void run() {
		 System.out.println("Counter2 Class Running\n");
		for(int i=1001; i<=200; i++)
		{
			System.out.println(i);
		}
		System.out.println("Counter2 finished\n");
		
	}
	
}

class ThreadImplementation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    Counter1 counter = new Counter1();
    counter.setPriority(10);
    counter.start();
    
    Counter2 counterr = new Counter2();
    Thread thread = new Thread(counterr);
    thread.setPriority(3);
    thread.start();
    
    counter.join();
    thread.join(); // After completion of counter1 and counter2 counter 3 is executed.
    System.out.println("Conter 3 Started\n");
	for(int i=1001; i<=200; i++)
	{
		System.out.println(i);
	}
	System.out.println("Counter3 finished\n");
	
	}

}
