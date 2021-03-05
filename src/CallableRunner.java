import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable<String>
{
      private String name;
	public CallableTask(String name)
      {
    	  this.name = name;
      }
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		return "Hello" + name;
	}
	
}
public class CallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		ExecutorService executorservice = Executors.newFixedThreadPool(1);
		Future<String> welcomestring = executorservice.submit(new CallableTask("Sandesh"));
		String welcomeMessage = welcomestring.get();
		
		System.out.println(welcomeMessage);
		

	}

}
