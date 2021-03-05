
public class StirngManipulation {

	public static void main(String[] args) {
		String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		
		String  LargerLengthofString = "";
		for(String Larger:days)
		{
			if(Larger.length()>LargerLengthofString.length())
			{
				LargerLengthofString = Larger;
			}
		}
		System.out.println("The larger of the strings is " + LargerLengthofString);
		
		for(int i = days.length-1; i>=0; i--)
		{
			System.out.println(days[i]);
		}

	}

}
