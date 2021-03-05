import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {

		// method1();
		
	/*
     Scanner scanner = null;
     
     try
     {
     scanner = new Scanner(System.in);
     
     int[] numbers = {12, 34, 54, 36, 53};
     int number = numbers[8];
     }
     catch(ArrayIndexOutOfBoundsException e)
     {
    	 e.printStackTrace();
    	 // System.out.println("ArrayIndexOutOfBoundsException");
     }
     finally   // Irrespective of the exception this finally block is always accepted.
     {
    	 scanner.close();
    	 System.out.println("Scanner closed");
     }
     System.out.println("End of the code.");
	}
	
	*/
 /*
	private static void method1() {
		
		method2();
		System.out.println("Method1 ended. ");
	}

	private static void method2() {
		
		method3();
		System.out.println("Method2 ended. ");
	}

	private static void method3() {
		try
		{
		String str = null;
		str.length();
		System.out.println("Method3 ended. ");
		}
		catch(NullPointerException ex)
		{
    System.out.println("NullPointerException");
		}
	}
*/
	try
	{
		int[] a = new int[8];
		a[9] =10;  // cannot place an element exceeding the index number.
	int i =7;
	int j= 0;
	int k = i/j;
	System.out.println(k);
	}
	catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Error Check it Once.");
	}
	 finally
	 {
		 System.out.println("You are new to the world of Program");
	 }
	}
	
}
