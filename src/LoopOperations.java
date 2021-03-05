class MyNumber
{
	int numberx;
	public MyNumber(int numberx)
	{
		this.numberx = numberx;
	}
	public boolean isPrime()
	{
		for(int i = 2; i<=(this.numberx -1); i++)
		{
			if(numberx % i==0) {
				return false;
				}
			
		}
		return true;	
				
	}
}
public class LoopOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     MyNumber number = new MyNumber(9);
     boolean isPrime = number.isPrime();
     System.out.println("is Prime " + isPrime);
	}

}
