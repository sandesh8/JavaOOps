import java.util.List;

public class MethodReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List.of("Spider", "Snake", "Crocodile", "Centipede", "Scorpion").stream().map(element -> element.length()).forEach(element -> System.out.println(element));

	}

}
