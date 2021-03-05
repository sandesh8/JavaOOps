import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ExecutorService ExecuteServiceRunner = Executors.newSingleThreadExecutor();   
      ExecuteServiceRunner.execute(new Counter1());  // ExecuterService can only execute 1 task at a time.
      ExecuteServiceRunner.execute(new Thread(new Counter2()));
      
	}
}
