import java.util.Scanner;

public class SomethingNew {
 public static void main(String[] args) {
	int sum = 0;
	System.out.println("Entee the numbr: ");
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
	for(int i = 1; i<=n; i++)
	{
		sum = sum + n;
		
	}
	System.out.println(sum );
}
}
