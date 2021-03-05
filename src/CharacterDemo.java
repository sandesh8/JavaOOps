class MyChar
{
	char ch;
	public MyChar(char ch)
	{
		this.ch = ch;
	}
	public void isVowel()
	{
		if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
			System.out.println(ch + " is a Vowel ");
			else 
				System.out.println(ch + " is not a Vowel ");
	}
	public void isAlphabet()
	{
		if(ch >= 97 && ch <= 122 )
			System.out.println(ch + " is an Alphabet");
		else if(ch >= 65 && ch <=90)
			System.out.println(ch + " is an Alphabet");
		else 
			System.out.println("It is a Special Character");
	}

}
public class CharacterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyChar mychar = new MyChar('e');
		// mychar.isVowel();
		mychar.isAlphabet();
		

	}

}
