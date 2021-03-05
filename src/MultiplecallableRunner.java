import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import java.util.List;

public class MultiplecallableRunner {
	
		public static void main(String[] args) throws InterruptedException, ExecutionException {
			// TODO Auto-generated method stub
			ExecutorService executiveservice = Executors.newFixedThreadPool(3);
			// Executing multiple tasks at same time.
			List<CallableTask> tasks = List.of(new CallableTask("Sadneshk"), new CallableTask("Sarvesh"), new CallableTask("Shashank"), new CallableTask("Suhas"));
			
			String result = executiveservice.invokeAny(tasks);  // INVOKING ALL THE TASKS
            System.out.println(result);  // PRINTING ALL THE TASKS
             
            
	}

}
