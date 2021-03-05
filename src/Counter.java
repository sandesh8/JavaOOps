
public class Counter {
	
	int i=0;
	public void increment()
	{
		i++;
	}

	public int getI() {
		return i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Counter counter = new Counter();
      counter.increment();
      counter.increment();
      System.out.println(counter.getI());
	}

}
