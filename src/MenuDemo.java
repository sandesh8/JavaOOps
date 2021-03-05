import java.util.Scanner;
public class MenuDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the First number: ");
		int number = scanner.nextInt();
		System.out.println("the nummber you entered is: " +number);
		System.out.println("Enter the second number: ");
		int number2 = scanner.nextInt();
		System.out.println("The number you enetered is: " + number2);
		System.out.println("List the choice: ");
		System.out.println("1-Addition");
		System.out.println("2-Subtraction");
		System.out.println("3-Multiplication");
		System.out.println("4-Division");
		System.out.println("Choose Operation: ");
		int choice = scanner.nextInt();
		
	     switch(choice)
		{
	     case 1: 
	    	 System.out.println("result " + (number + number2));
	    	 break;
	     case 2:
	    	 System.out.println("result " + (number - number2));
	    	 break;
	     case 3:
	    	 System.out.println("result " + (number * number2));	 
	    	 break;
	     case 4: 
	    	 System.out.println("result " + (number / number2));
	    	 break;
	     default: 
	    	 System.out.println("Invalid Option");
	    	 break;
		}

	}

}
