class BiNumber
{
	int number1;
	int number2;
	public BiNumber(int number1, int number2)
	{
		this.number1 = number1;
		this.number2 = number2;
		System.out.println(number1);
		System.out.println(number2);
	}
	public int add()
	{
     return number1+number2;
	
	}
	public int multiply()
	{
		return number1*number2;
	}
	public void doubleValue()
	{
		  this.number1 *= 2;
		  this.number2 *=2;
		  System.out.println(this.number1);
		  System.out.println(this.number2);
	}
}
public class DemoPractice {

	public static void main(String[] args) {
		
		BiNumber number = new BiNumber(2, 3);
		number.add();
		System.out.println(number.add());
		System.out.println(number.multiply());
		number.doubleValue();
	}

}
